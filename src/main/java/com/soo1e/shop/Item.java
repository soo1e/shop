package com.soo1e.shop;

import jakarta.persistence.*;

@Entity
public class Item {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY) // auto increment
    public Long id;

    @Column
    public String title;
    public Integer price;
}
