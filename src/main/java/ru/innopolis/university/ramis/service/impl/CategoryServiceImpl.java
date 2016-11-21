package ru.innopolis.university.ramis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.innopolis.university.ramis.entity.Category;
import ru.innopolis.university.ramis.repository.CategoryRepository;
import ru.innopolis.university.ramis.service.CategoryService;

import java.util.List;

/**
 * Created by innopolis on 18.11.16.
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Iterable<Category> findAll(){
        return categoryRepository.findAll();
    }

    @Override
    public List<Category> findCategoryByCategoryIdParent(Long id) {
        return null;//categoryRepository.findCategoryByCategoryIdParent(id);
    }
}
