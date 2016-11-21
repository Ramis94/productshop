package ru.innopolis.university.ramis.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.innopolis.university.ramis.entity.Product;

import java.util.List;

/**
 * Created by innopolis on 20.11.16.
 */
@Repository
public interface ProductRepository extends CrudRepository<Product, Long>{

    List<Product> findProductByCategoryId(Long id);
}
