package com.example.carmalouna.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // creates all getter and setter methods
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "membership_plans")
public class MembershipPlan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer plan_id;

    private String plan_name;

    private Integer credits_per_month;

    private Integer cost;

    private Boolean ad_supported;

}
