package ru.innopolis.university.ramis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.innopolis.university.ramis.entity.Users;

/**
 * Created by innopolis on 10.11.16.
 */
@Repository
public interface UserRepository extends CrudRepository<Users, Long> {

    Users findByLogin(String login);
}