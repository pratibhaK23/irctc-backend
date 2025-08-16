package com.pkslearning.irctc.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stations")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Station
{
  @Id
  @GeneratedValue(strategy=GenerationType.IDENTITY)
  private long id;
  
  private String code;
  
  private String name;
  
  private String city;
  
  private String state;
  
  
}
