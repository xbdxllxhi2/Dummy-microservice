package com.horizon.m2.s1.api.orderservice.mapper;

import com.horizon.m2.s1.api.orderservice.dto.OrderDto;
import com.horizon.m2.s1.api.orderservice.entity.OrderEntity;

public class OrderMapper {

  public static OrderDto toDto(OrderEntity entity) {
    OrderDto dto = new OrderDto();
    dto.setId(entity.getId());
    dto.setProductsId(entity.getProductsId());
    return dto;
  }

  public static OrderEntity toEntity(OrderDto dto) {
    OrderEntity entity = new OrderEntity();
    entity.setId(dto.getId());
    entity.setProductsId(dto.getProductsId());
    return entity;
  }
}
