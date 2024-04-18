package com.dependencyinjection.di.services;

import java.util.List;

import com.dependencyinjection.di.models.Product;

public interface IProductService {
  List<Product> findAll();
  Product findById(Long id);
}
