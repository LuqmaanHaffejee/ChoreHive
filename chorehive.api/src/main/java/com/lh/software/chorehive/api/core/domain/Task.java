package com.lh.software.chorehive.api.core.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Task extends BaseEntity {
  
  private String summary;
  
  private String description;
  
  private LocalDate dateCreated;
  
  private Boolean complete;

}
