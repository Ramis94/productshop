package ru.innopolis.university.ramis.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.innopolis.university.ramis.entity.Product;
import ru.innopolis.university.ramis.repository.ProductRepository;
import ru.innopolis.university.ramis.service.ProductService;

import java.util.List;

/**
 * Created by innopolis on 20.11.16.
 */
@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> findProductByCategoryId(Long id) {
        return productRepository.findProductByCategoryId(id);
    }
}
