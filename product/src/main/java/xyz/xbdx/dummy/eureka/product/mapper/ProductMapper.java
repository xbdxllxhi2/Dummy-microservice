package xyz.xbdx.dummy.eureka.product.mapper;

import xyz.xbdx.dummy.eureka.product.dto.ProductDto;
import xyz.xbdx.dummy.eureka.product.entity.ProductEntity;

public class ProductMapper {
  public static ProductDto toDto(ProductEntity entity) {
    ProductDto dto = new ProductDto();
    dto.setId(entity.getId());
    dto.setName(entity.getName());
    dto.setDescription(entity.getDescription());
    dto.setPrice(entity.getPrice());
    return dto;
  }


  public static ProductEntity toEntity(ProductDto dto) {
    ProductEntity entity = new ProductEntity();
    entity.setId(dto.getId());
    entity.setName(dto.getName());
    entity.setDescription(dto.getDescription());
    entity.setPrice(dto.getPrice());
    return entity;
  }

}
