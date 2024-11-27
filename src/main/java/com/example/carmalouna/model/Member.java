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
@Table(name = "member")

public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer member_id;

    @OneToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "membership_plan_id")
    private MembershipPlan membership_plan;

    private Integer credits;

    private LocalDateTime active_since;

    private LocalDateTime last_activity;

    private LocalDateTime subscription_end_date;
}
