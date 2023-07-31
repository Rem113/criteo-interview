package com.example.criteointerview.data.models;

import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "product_generator")
    private int id;

    @Column(name = "title")
    private String title;

    @Column(name = "category")
    private String category;

    @Column(name = "price")
    private float price;

    @Column(name = "serial")
    private String serial;

    @ManyToMany
    private Set<Campaign> campaigns;

    public Product() {
    }

    public Product(String title, String category, float price, String serial) {
        this.title = title;
        this.category = category;
        this.price = price;
        this.serial = serial;
    }

    public Product(int id, String title, String category, float price, String serial) {
        this.id = id;
        this.title = title;
        this.category = category;
        this.price = price;
        this.serial = serial;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }
}