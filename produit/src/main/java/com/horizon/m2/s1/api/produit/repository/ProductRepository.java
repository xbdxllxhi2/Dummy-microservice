package com.horizon.m2.s1.api.produit.repository;


import com.horizon.m2.s1.api.produit.entity.ProductEntity;
import org.springframework.data.repository.ListCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends ListCrudRepository<ProductEntity, Long> {
}
