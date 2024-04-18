package com.dependencyinjection.di.services;

import java.util.List;
import java.util.stream.Collectors;

import com.dependencyinjection.di.models.Product;
import com.dependencyinjection.di.repositories.ProductRepository;

public class ProductService {
  private ProductRepository repository = new ProductRepository();
  public List<Product> findAll() {
    return repository.findAll().stream().map(p -> {
      Double priceImp = p.getPrice() * 1.25d;
      Product newProduct = new Product(p.getId(), p.getName(), priceImp.longValue());
      return newProduct;
    }).collect(Collectors.toList());
  }
  public Product findById(Long id) {
    return repository.findById(id);
  }
}
