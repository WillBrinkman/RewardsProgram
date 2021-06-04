package com.example.brinkman.rewardsprogram.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;


@Entity
@Table(name="purchase")
public class Purchase {


    public Purchase(){};

    public Purchase(int id, int customerId, double cost, LocalDate date, String description) {

        this.id = id;
        this.customerId = customerId;
        this.cost = cost;
        this.date = date;
        this.description = description;
    }

    @Id
    private int id;

    @Column(name="customer_id")
    private int customerId;

    private double cost;

    private LocalDate date;

    private String description;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }



   // private Long points;

}
