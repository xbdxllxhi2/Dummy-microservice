package xyz.xbdx.dummy.eureka.order.respository;


import xyz.xbdx.dummy.eureka.order.entity.OrderEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends ListCrudRepository<OrderEntity, Long> {
}
