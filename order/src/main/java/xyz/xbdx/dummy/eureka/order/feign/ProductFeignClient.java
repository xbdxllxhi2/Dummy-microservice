package xyz.xbdx.dummy.eureka.order.feign;

import xyz.xbdx.dummy.eureka.order.dto.ProductDto;
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
