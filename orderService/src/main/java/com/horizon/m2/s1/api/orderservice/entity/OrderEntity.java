package com.horizon.m2.s1.api.orderservice.entity;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "orders")
public class OrderEntity {
  @Id
  private Long id;
  private String clientId;
  @ElementCollection
  private List<Long> productsId;


  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  public List<Long> getProductsId() {
    return productsId;
  }

  public void setProductsId(List<Long> productsId) {
    this.productsId = productsId;
  }
}
