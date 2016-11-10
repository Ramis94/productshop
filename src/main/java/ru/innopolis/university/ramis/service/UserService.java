package ru.innopolis.university.ramis.service;

import ru.innopolis.university.ramis.entity.Users;

/**
 * Created by innopolis on 10.11.16.
 */
public interface UserService {

    Users loadUserByUsername(String login);

    Users getUserById(Long id);

    void save(Users users);
}
