package com.horizon.m2.s1.api.produit.service;

import com.horizon.m2.s1.api.produit.entity.ProductEntity;
import com.horizon.m2.s1.api.produit.repository.ProductRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
  private final ProductRepository productRepository;


  public ProductService(ProductRepository productRepository) {
    this.productRepository = productRepository;
  }

  public Optional<ProductEntity> getProductById(Long id) {
    return productRepository.findById(id);
  }

  public List<ProductEntity> getProducts() {
    return productRepository.findAll();
  }

}
