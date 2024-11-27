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
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer class_id;

    private String title;

    @Lob
    private String description;

    @Enumerated(EnumType.STRING)
    private FocusArea focus_area;

    private enum FocusArea {
        MINDFULNESS, STRESS_MANAGEMENT, FLEXIBILITY
    }

    @Enumerated(EnumType.STRING)
    private DifficultyLevel difficulty_level;

    private enum DifficultyLevel {
        BEGINNER, INTERMEDIATE, ADVANCED
    }

    @Enumerated(EnumType.STRING)
    private ClassType classType;

    private enum ClassType {
        GROUP, PRIVATE, CHILDREN
    }

    private Integer credits_cost;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private Coach created_by;

    private LocalDateTime created_at;

    // Getters and Setters
}
