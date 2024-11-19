package com.hipp.admin.adminsystem.model.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "clients")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(nullable = false, unique = true)
    public String name;

    @Column(nullable = false)
    @Email
    public String email;

    @Column(nullable = false)
    public String phone;

    @Column(nullable = false)
    public String address;
    // One-to-many relationship

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Orders> orders;


}
