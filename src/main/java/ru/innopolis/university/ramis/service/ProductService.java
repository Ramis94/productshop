package ru.innopolis.university.ramis.service;

import ru.innopolis.university.ramis.entity.Product;

import java.util.List;

/**
 * Created by innopolis on 18.11.16.
 */
public interface ProductService {

    List<Product> findProductByCategoryId(Long id);

    void saveProduct(Product product);
}
