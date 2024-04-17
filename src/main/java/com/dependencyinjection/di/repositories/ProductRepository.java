package com.dependencyinjection.di.repositories;

import java.util.Arrays;
import java.util.List;

import com.dependencyinjection.di.models.Product;

public class ProductRepository {

  private List<Product> data;

  public ProductRepository() {
    this.data = Arrays.asList(
      new Product(1L, "Memory", 300L),
      new Product(2L, "display", 800L),
      new Product(3L, "card", 100L),
      new Product(4L, "modem", 200L)
    );
  }

  public List<Product> findAll() {
    return data;
  }

  
}
