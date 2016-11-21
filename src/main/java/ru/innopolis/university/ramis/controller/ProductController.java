package ru.innopolis.university.ramis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.innopolis.university.ramis.service.ProductService;

/**
 * Created by innopolis on 20.11.16.
 */
@Controller
public class ProductController extends BaseController {

    @Autowired
    private ProductService productService;

    @RequestMapping(value = "/cat={id}", method = RequestMethod.GET)
    public String getProductByCategoryId(@PathVariable Long id){
            request.setAttribute("listProducts", productService.findProductByCategoryId(id));
        return "category/listProduct";
    }
}
