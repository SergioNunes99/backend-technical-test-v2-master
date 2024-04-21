package com.tui.proof.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name="CLIENT")
public class Client {
  @Id
  @GeneratedValue
  @Column(name = "id")
  private Long id;

  @Column(name = "firstName")
  private String firstName;

  @Column(name = "lastName")
  private String lastName;

  @Column(name = "telephone")
  private String telephone;
}
