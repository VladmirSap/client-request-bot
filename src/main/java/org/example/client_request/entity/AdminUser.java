package org.example.client_request.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.rmi.server.UID;

@Entity
@Table(name = "status_history")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AdminUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @Column(unique = true, nullable = false)
    private Long telegramId;
}
