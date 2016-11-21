package ru.innopolis.university.ramis.service;

import ru.innopolis.university.ramis.entity.Category;

import java.util.List;

/**
 * Created by innopolis on 18.11.16.
 */
public interface CategoryService {

    Iterable<Category> findAll();

    List<Category> findCategoryByCategoryIdParent(Long id);
}
