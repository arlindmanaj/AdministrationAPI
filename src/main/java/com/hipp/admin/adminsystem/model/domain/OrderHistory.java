package com.hipp.admin.adminsystem.model.domain;

import jakarta.persistence.*;
import com.hipp.admin.adminsystem.model.domain.Orders;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@Entity
@Table(name = "order_history")

public class OrderHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Orders order; // Reference to the Order entity

    @Enumerated(EnumType.STRING)
    @Column(name = "old_status", nullable = false)
    private OrderStatus oldStatus; // Previous status (Enum)

    @Enumerated(EnumType.STRING)
    @Column(name = "new_status", nullable = false)
    private OrderStatus newStatus; // Updated status (Enum)

    @Column(name = "timestamp", nullable = false)
    private LocalDateTime timestamp; // Timestamp of the status change

}
