package com.tui.proof.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Data
@Entity
@Table(name="ADDRESS")
public class Address {
  public final static String ID_COLUMN = "id";

  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "street")
  private String street;

  @Column(name = "postcode")
  private String postcode;

  @Column(name = "city")
  private String city;

  @Column(name = "country")
  private String country;
}
