package com.hipp.admin.adminsystem.model.domain;

import jakarta.persistence.*;

import java.time.LocalDateTime;
@Entity
@Table(name = "orders")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name= "name", nullable = false)
    private String name;

    @Column(name= "quantity",nullable = false)
    private int quantity;

    @Column(name= "address", nullable = false)
    private String address;

    @Column(name="delivery_Destination", nullable = false)
    private String deliveryDestination;

    @Column(name="Time_Created", nullable = false)
    private LocalDateTime lastUpdated;

    @ManyToOne
    @JoinColumn(name = "client_id", nullable = false)
    private Client client; // Reference to the Client entity

    @ManyToOne
    @JoinColumn(name = "sales_person_id", nullable = false)
    private SalesPerson salesPerson; // Reference to the SalesPerson entity

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee; // Reference to the Employee entity

}
