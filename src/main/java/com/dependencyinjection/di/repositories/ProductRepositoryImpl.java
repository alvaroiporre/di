package com.dependencyinjection.di.repositories;

import java.util.Arrays;
import java.util.List;

import com.dependencyinjection.di.models.Product;

public class ProductRepositoryImpl implements IProductRepository {

  private List<Product> data;

  public ProductRepositoryImpl() {
    this.data = Arrays.asList(
      new Product(1L, "Memory", 300L),
      new Product(2L, "display", 800L),
      new Product(3L, "card", 100L),
      new Product(4L, "modem", 200L)
    );
  }

  @Override
  public List<Product> findAll() {
    return data;
  }

  @Override
  public Product findById (Long id) {
    return data.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
  }
  
}
