package xyz.xbdx.dummy.eureka.product.api;


import xyz.xbdx.dummy.eureka.product.dto.ProductDto;
import xyz.xbdx.dummy.eureka.product.mapper.ProductMapper;
import xyz.xbdx.dummy.eureka.product.service.ProductService;
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
