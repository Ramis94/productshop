package ru.innopolis.university.ramis.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;
import ru.innopolis.university.ramis.entity.Users;
import ru.innopolis.university.ramis.service.UserService;

@Component
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserService userService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Users userInfo = null;
        userInfo = userService.loadUserByUsername(s);
        if (userInfo == null) throw new UsernameNotFoundException("UserInfo with name " + s + " not found");
        return new UserInfo(userInfo);
    }
}
