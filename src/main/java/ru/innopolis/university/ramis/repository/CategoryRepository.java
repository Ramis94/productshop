package ru.innopolis.university.ramis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.innopolis.university.ramis.entity.Category;

/**
 * Created by innopolis on 18.11.16.
 */
@Repository
public interface CategoryRepository extends CrudRepository<Category, Long> {

    //List<Category> findCategoryByCategoryIdParent(Long id);
}
