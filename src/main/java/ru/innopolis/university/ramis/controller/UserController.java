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
public class UserController extends BaseController{

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/user", method = RequestMethod.GET)
    public ModelAndView getUser() {
        Users user = userService.loadUserByUsername(userUtil.getCurrentUser().getLogin());
        ModelAndView modelAndView = new ModelAndView("user_private/user");
        modelAndView.addObject("user", user);
        return modelAndView;
    }

    @RequestMapping(value = "/user/update={id}", method = RequestMethod.POST)
    public ModelAndView updateUser(@ModelAttribute("user") Users user){

        return new ModelAndView("redirect:/user");
    }
}
