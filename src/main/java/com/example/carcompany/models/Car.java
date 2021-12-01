package com.example.carcompany.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Car implements Serializable {

    @Id
    private Long id;
    private String name;
    private String modelNumber;
    private String carCompany;
    private Double price;

    public Car() {
    }

    public Car(Long id, String name,
               String modelNumber,
               String carCompany, Double price) {
        this.id = id;
        this.name = name;
        this.modelNumber = modelNumber;
        this.carCompany = carCompany;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public String getCarCompany() {
        return carCompany;
    }

    public void setCarCompany(String carCompany) {
        this.carCompany = carCompany;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", carCompany='" + carCompany + '\'' +
                ", price=" + price +
                '}';
    }
}
