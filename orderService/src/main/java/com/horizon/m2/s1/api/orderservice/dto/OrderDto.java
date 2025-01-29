package com.horizon.m2.s1.api.orderservice.dto;

import java.util.List;
import lombok.Data;

@Data
public class OrderDto {
  private Long id;
  private String clientId;
  private List<Long> productsId;
  private int quantity;

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

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
}
