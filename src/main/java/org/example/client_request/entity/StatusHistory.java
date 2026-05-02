package org.example.client_request.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.client_request.constants.Status;

import java.time.LocalDateTime;

@Entity
@Table(name = "status_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class StatusHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "request_id")
    private Request request;

    @Enumerated(EnumType.STRING)
    private Status oldStatus;

    @Enumerated(EnumType.STRING)
    private Status newStatus;

    private String changedBy; // ADMIN or SYSTEM

    private LocalDateTime createdAt;
}
