package com.example.carmalouna.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

<<<<<<< HEAD
@Data
=======
@Data // creates all getter and setter methods
>>>>>>> b4282c46f423758a6543e1f94692fd81a4e14f98
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user")

public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer user_id;

    private String name;

    @Column(unique = true)
    private String email;

    private String passwordHash;

    private enum user_type {
        MEMBER, COACH
    };

    private enum account_status {
        ACTIVE, INACTIVE, PENDING_VERIFICATION
    };

    private LocalDateTime created_at;

    private LocalDateTime last_login;

}
