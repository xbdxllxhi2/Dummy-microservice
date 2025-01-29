package com.horizon.m2.s1.api.orderservice.feign;

import com.horizon.m2.s1.api.orderservice.dto.ProductDto;
import java.util.List;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "PRODUCT-SERVICE")
public interface ProductFeignClient {

  @GetMapping("/products/{id}")
  ProductDto getProduct(Long id);

  @GetMapping("/products")
  List<ProductDto> getProducts();
}
