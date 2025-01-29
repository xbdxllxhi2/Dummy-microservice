package xyz.xbdx.dummy.eureka.order.api;

import xyz.xbdx.dummy.eureka.order.dto.OrderDto;
import xyz.xbdx.dummy.eureka.order.entity.OrderEntity;
import xyz.xbdx.dummy.eureka.order.service.OrderService;
import xyz.xbdx.dummy.eureka.order.mapper.OrderMapper;
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
