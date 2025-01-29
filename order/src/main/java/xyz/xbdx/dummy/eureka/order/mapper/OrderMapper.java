package xyz.xbdx.dummy.eureka.order.mapper;

import xyz.xbdx.dummy.eureka.order.dto.OrderDto;
import xyz.xbdx.dummy.eureka.order.entity.OrderEntity;

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
