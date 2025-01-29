package com.horizon.m2.s1.api.orderservice.api;

import com.horizon.m2.s1.api.orderservice.dto.OrderDto;
import com.horizon.m2.s1.api.orderservice.entity.OrderEntity;
import com.horizon.m2.s1.api.orderservice.service.OrderService;
import com.horizon.m2.s1.api.orderservice.mapper.OrderMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
  private final OrderService orderService;

  public OrderController(OrderService orderService) {
    this.orderService = orderService;
  }

  @PostMapping
  public ResponseEntity<OrderEntity> createOrder(@RequestBody OrderDto orderDto) {
    var result = this.orderService.createOrder(orderDto);
    return ResponseEntity.ok(result);
  }

  @GetMapping("/{id}")
  public ResponseEntity<OrderDto> getOrderById() {
    return this.orderService.getOrderById(1L)
        .map(OrderMapper::toDto)
        .map(ResponseEntity::ok)
        .orElse(ResponseEntity.notFound().build());
  }
}
