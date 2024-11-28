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
@Table(name = "credits_transactions")
public class CreditsTransaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer transactionId;

    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne
    @JoinColumn(name = "session_id")
    private Session session;

    @ManyToOne
    @JoinColumn(name = "video_id")
    private Video video;

    private enum transactionType {
        CREDIT_PURCHASE, CLASS_BOOKING, VIDEO_ACCESS, PRIVATE_SESSION
    };

    private Integer creditsAmount;

    private LocalDateTime transactionDate;

}