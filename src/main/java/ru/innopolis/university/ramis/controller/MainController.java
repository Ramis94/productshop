package ru.innopolis.university.ramis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.innopolis.university.ramis.entity.Category;
import ru.innopolis.university.ramis.service.CategoryService;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by innopolis on 10.11.16.
 */
@Controller
public class MainController extends BaseController {

    @Autowired
    private CategoryService categoryService;

    /**
     * Загрузка главной страницы
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        Iterable<Category> categories = categoryService.findAll();
        List<Category> subCategoryList = new LinkedList<>();
        for (Category category : categories){
            if (category.getCategory().isEmpty()){
                subCategoryList.addAll(categoryService.findCategoryByCategoryIdParent(category.getId()));
            }
        }
        request.setAttribute("categories", categories);
        request.setAttribute("subCategories", subCategoryList);
        if (userUtil.isAuthorised()){
            request.setAttribute("userAuth", true);
        } else {
            request.setAttribute("userAuth", false);
        }
        return "index";
    }
}
