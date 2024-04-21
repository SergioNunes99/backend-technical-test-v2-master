package com.tui.proof.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="PILOTE_ORDER")
public class Order {
  @Id
  @GeneratedValue
  @Column(name = "number")
  private Long number;

  @JoinColumn(name = "deliveryAddressId", referencedColumnName = Address.ID_COLUMN)
  @ManyToOne(fetch = FetchType.LAZY)
  private Address deliveryAddress;

  @Column(name = "pilotes")
  private int pilotes;

  @Column(name = "orderTotal")
  private double orderTotal;

  public Order(Address address, int pilotes, double v) {
  }
}
