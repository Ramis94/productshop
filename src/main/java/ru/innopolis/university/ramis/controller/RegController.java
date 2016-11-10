package ru.innopolis.university.ramis.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import ru.innopolis.university.ramis.entity.Users;
import ru.innopolis.university.ramis.service.UserService;

/**
 * Created by innopolis on 10.11.16.
 */
@Controller
public class RegController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/reg", method = RequestMethod.GET)
    public ModelAndView getReg(){
        return new ModelAndView("auth/registration");
    }

    @RequestMapping(value = "/reg", method = RequestMethod.POST)
    public ModelAndView postReg(@ModelAttribute("regForm") Users users){
        userService.save(users);
        return new ModelAndView("redirect:/login");
    }

}
