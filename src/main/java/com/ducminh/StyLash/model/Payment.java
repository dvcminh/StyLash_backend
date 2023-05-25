package com.ducminh.StyLash.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@Table(name = "payments")
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private User user;

    private double amount;
    private String paymentMethod;
    private String paymentStatus;

    // Constructors, getters, and setters

    public Payment(User user, double amount, String paymentMethod, String paymentStatus) {
        this.user = user;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
        this.paymentStatus = paymentStatus;
    }
}
