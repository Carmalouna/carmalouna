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
@Table(name = "video_library")
public class Video {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer videoId;

    private String title;

    @Lob
    private String description;

    private enum focusArea {
        STRENGTH, FLEXIBILITY, STRESS_RELIEF, BALANCE, MINDFULNESS, BACK_AND_SPINE, ENERGY_BOOST, POSTURE_IMPROVEMENT,
        RELAXATION
    };

    private enum difficultyLevel {
        BEGINNER, INTERMEDIATE, ADVANCED
    }

    private String url;

    private Integer creditsCost;

    @ManyToOne
    @JoinColumn(name = "created_by")
    private Coach createdBy;

    private LocalDateTime uploadedAt;
}