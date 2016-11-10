package ru.innopolis.university.ramis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.innopolis.university.ramis.entity.Roles;
import ru.innopolis.university.ramis.entity.Users;
import ru.innopolis.university.ramis.repository.UserRepository;
import ru.innopolis.university.ramis.security.PassEncode;
import ru.innopolis.university.ramis.service.UserService;

/**
 * Created by innopolis on 10.11.16.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Users loadUserByUsername(String login){
        return userRepository.findByLogin(login);
    }

    public Users getUserById(Long id){
        return userRepository.findOne(id);
    }

    @Override
    public void save(Users users) {
        users.setRole(Roles.ROLE_USER);
        users.setPassword(new PassEncode().encode(users.getPassword()));
        userRepository.save(users);
    }
}
