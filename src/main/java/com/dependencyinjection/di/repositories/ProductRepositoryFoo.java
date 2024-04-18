package com.dependencyinjection.di.repositories;

import java.util.Collections;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

import com.dependencyinjection.di.models.Product;

@Primary
@Repository
public class ProductRepositoryFoo implements IProductRepository {

  @Override
  public List<Product> findAll() {
    return Collections.singletonList(new Product(1L, "Monitores", 200L));
  }

  @Override
  public Product findById(Long id) {
    return new Product(1L, "Monitores", 200L);
  }

}
