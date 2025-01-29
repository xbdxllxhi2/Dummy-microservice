package com.horizon.m2.s1.api.produit.mapper;

import com.horizon.m2.s1.api.produit.dto.ProductDto;
import com.horizon.m2.s1.api.produit.entity.ProductEntity;

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
