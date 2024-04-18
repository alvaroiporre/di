package com.dependencyinjection.di.repositories;

import java.util.List;

import com.dependencyinjection.di.models.Product;

public interface IProductRepository {
  List<Product> findAll();
  Product findById(Long id);
}
