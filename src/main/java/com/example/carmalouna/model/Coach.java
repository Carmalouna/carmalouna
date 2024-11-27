package com.example.carmalouna.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table (name = "coach")

public class Coach {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer coach_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Lob
    private String bio;

    @Lob
    private String expertise;

    private enum verification_status {PENDING, VERIFIED, REJECTED};

    private Integer sessions_per_month;

    private LocalDateTime created_at;

}
