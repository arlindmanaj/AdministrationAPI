package com.hipp.admin.adminsystem.model.domain;
import jakarta.persistence.*;
@Entity
@Table(name = "admins")
public class Admin {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int id;

    @Column(nullable = false, unique = true)
    public String username;

    @Column(nullable = false)
    public String password;



}
