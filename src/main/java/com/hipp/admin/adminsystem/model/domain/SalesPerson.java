package com.hipp.admin.adminsystem.model.domain;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "salespersons")
public class SalesPerson {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Column(nullable = true)
    private String region; // Optional, if applicable

    @OneToMany(mappedBy = "salesPerson", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Orders> orders;

}
