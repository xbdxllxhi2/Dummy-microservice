package com.horizon.m2.s1.api.orderservice.respository;


import com.horizon.m2.s1.api.orderservice.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends ListCrudRepository<OrderEntity, Long> {
}
