package xyz.xbdx.dummy.eureka.product.service;

import xyz.xbdx.dummy.eureka.product.entity.ProductEntity;
import xyz.xbdx.dummy.eureka.product.repository.ProductRepository;
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
