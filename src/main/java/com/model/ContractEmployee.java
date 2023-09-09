package com.model;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("contract")
public class ContractEmployee extends Employee {
  @Column(name = "epayperhour")
  double payperhour;
  
  @Column(name = "eduration")
  String duration;

  public double getPayperhour() {
    return payperhour;
  }

  public void setPayperhour(double payperhour) {
    this.payperhour = payperhour;
  }

  public String getDuration() {
    return duration;
  }

  public void setDuration(String duration) {
    this.duration = duration;
  }
}