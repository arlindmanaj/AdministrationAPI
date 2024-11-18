package com.hipp.admin.adminsystem.model.domain;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Role role;

    public enum Role {
        ADMIN,
        MANAGER,
        DRIVER,
        SALESPERSON,
        EMPLOYEE
    }
}
