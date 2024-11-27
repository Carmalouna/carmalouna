package com.example.carmalouna.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // creates all getter and setter methods
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "sessions")
public class Session {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer session_id;

    @ManyToOne
    @JoinColumn(name = "class_id")
    private Course course;

    @ManyToOne
    @JoinColumn(name = "coach_id")
    private Coach coach;

    private LocalDateTime start_time;

    private LocalDateTime end_time;

    private String session_link;

    @Enumerated(EnumType.STRING)
    private SessionStatus status;

    private enum SessionStatus {
        SCHEDULED, COMPLETED, CANCELED
    }
}
