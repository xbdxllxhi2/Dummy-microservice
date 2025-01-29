package com.horizon.m2.s1.api.orderservice.service;

import com.horizon.m2.s1.api.orderservice.dto.OrderDto;
import com.horizon.m2.s1.api.orderservice.entity.OrderEntity;
import com.horizon.m2.s1.api.orderservice.feign.ProductFeignClient;
import com.horizon.m2.s1.api.orderservice.mapper.OrderMapper;
import com.horizon.m2.s1.api.orderservice.respository.OrderRepository;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class OrderService {
  private final OrderRepository orderRepository;
  private final ProductFeignClient productFeignClient;

  public OrderService(OrderRepository orderRepository, ProductFeignClient productFeignClient) {
    this.orderRepository = orderRepository;
    this.productFeignClient = productFeignClient;
  }


  public Optional<OrderEntity> getOrderById(Long id) {
    return this.orderRepository.findById(id);
  }

  public OrderEntity createOrder(OrderDto orderDto) {

    var existingProcuts = this.productFeignClient.getProducts();

    boolean allProductsExist = orderDto.getProductsId().stream()
        .allMatch(productId -> existingProcuts.stream()
            .anyMatch(product -> product.getId().equals(productId)));

    if (allProductsExist) {
      var orderEntity = OrderMapper.toEntity(orderDto);
      return this.orderRepository.save(orderEntity);
    } else {
      throw new RuntimeException("Some products do not exist");
    }
  }
}
