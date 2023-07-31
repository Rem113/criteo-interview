package com.example.criteointerview.data.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "campaigns")
public class Campaign {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "campaign_generator")
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "start_date")
    private Date startDate;

    @Column(name = "bid")
    private float bid;

    @ManyToMany
    private Set<Product> products;

    public Campaign() {
    }

    public Campaign(String name, Date startDate, float bid, Set<Product> products) {
        this.name = name;
        this.startDate = startDate;
        this.bid = bid;
        this.products = products;
    }

    public Campaign(int id, String name, Date startDate, float bid, Set<Product> products) {
        this.id = id;
        this.name = name;
        this.startDate = startDate;
        this.bid = bid;
        this.products = products;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public float getBid() {
        return bid;
    }

    public void setBid(float bid) {
        this.bid = bid;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
