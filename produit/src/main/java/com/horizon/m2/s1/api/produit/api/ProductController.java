package com.horizon.m2.s1.api.produit.api;


import com.horizon.m2.s1.api.produit.dto.ProductDto;
import com.horizon.m2.s1.api.produit.mapper.ProductMapper;
import com.horizon.m2.s1.api.produit.service.ProductService;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/products")
public class ProductController {
  private final ProductService productService;

  public ProductController(ProductService productService) {
    this.productService = productService;
  }

  @RequestMapping("/{id}")
  public ResponseEntity<ProductDto> getProductById() {
    return this.productService.getProductById(1L)
        .map(product -> ResponseEntity.ok(new ProductDto()))
        .orElse(ResponseEntity.notFound().build());
  }

  @RequestMapping
  public ResponseEntity<List<ProductDto>> getProducts() {
    var result = this.productService.getProducts()
        .stream()
        .map(ProductMapper::toDto)
        .collect(Collectors.toList());

    return ResponseEntity.ok(result);
  }
}
