package com.example.carmalouna.model;

import jakarta.persistence.*;

import java.time.LocalDateTime;

import lombok.AllArgsConstructor;

import lombok.Data;

import lombok.NoArgsConstructor;

@Data

@AllArgsConstructor

@NoArgsConstructor

@Entity

@Table(name = "ratings")

public class Rating {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer ratingId;

    @ManyToOne

    @JoinColumn(name = "member_id")

    private Member member;

    @ManyToOne

    @JoinColumn(name = "session_id")

    private Session session;

    @ManyToOne

    @JoinColumn(name = "course_id")

    private Course course;

    @ManyToOne

    @JoinColumn(name = "coach_id")

    private Coach coach;

    private Integer sessionRating;

    private Integer classRating;

    private Integer coachRating;

    @Lob

    private String comments;

    private LocalDateTime createdAt;

}
