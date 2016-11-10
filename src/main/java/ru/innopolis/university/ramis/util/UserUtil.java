package ru.innopolis.university.ramis.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import ru.innopolis.university.ramis.entity.Users;
import ru.innopolis.university.ramis.security.UserInfo;
import ru.innopolis.university.ramis.service.UserService;

/**
 * Created by innopolis on 10.11.16.
 */
@Component
public class UserUtil {

    @Autowired
    private UserService userService;

    public Users getCurrentUser(){
        UserInfo userContext = (UserInfo) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        Users users = null;
        if (userContext != null && userContext.getUserInfo() != null){
            users = userService.getUserById(userContext.getUserInfo().getId());
        }
        return users;
    }

    public boolean isAuthorised(){
        Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        return (principal instanceof UserDetails) && !((UserDetails)principal).getAuthorities().isEmpty();
    }
}
