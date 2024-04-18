package com.dependencyinjection.di.services;

import java.util.List;
import java.util.stream.Collectors;

import com.dependencyinjection.di.models.Product;
import com.dependencyinjection.di.repositories.ProductRepositoryImpl;

public class ProductServiceImpl implements IProductService {
  private ProductRepositoryImpl repository = new ProductRepositoryImpl();
  @Override
  public List<Product> findAll() {
    return repository.findAll().stream().map(p -> {
      Double priceImp = p.getPrice() * 1.25d;
      //Product newProduct = new Product(p.getId(), p.getName(), priceImp.longValue());
      Product newProduc = (Product) p.clone();
      newProduc.setPrice(priceImp.longValue());
      return newProduc;
    }).collect(Collectors.toList());
  }

  @Override
  public Product findById(Long id) {
    return repository.findById(id);
  }
}
