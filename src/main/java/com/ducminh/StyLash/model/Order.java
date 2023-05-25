package com.ducminh.StyLash.model;


import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    private int quantity;
    private String orderStatus;

    // Constructors, getters, and setters

    public Order(User user, Product product, int quantity, String orderStatus) {
        this.user = user;
        this.product = product;
        this.quantity = quantity;
        this.orderStatus = orderStatus;
    }
}
