package xyz.xbdx.dummy.eureka.product.repository;


import xyz.xbdx.dummy.eureka.product.entity.ProductEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ListCrudRepository<ProductEntity, Long> {
}
