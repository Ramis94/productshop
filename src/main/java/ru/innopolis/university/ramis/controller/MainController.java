package ru.innopolis.university.ramis.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by innopolis on 10.11.16.
 */
@Controller
public class MainController extends BaseController {

    /**
     * Загрузка главной страницы
     * @return
     */
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String main(){
        if (userUtil.isAuthorised()){
            request.setAttribute("userAuth", true);
        } else {
            request.setAttribute("userAuth", false);
        }
        return "index";
    }
}
