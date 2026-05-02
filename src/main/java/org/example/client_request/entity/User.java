package org.example.client_request.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.example.client_request.constants.UserState;

import java.time.LocalDateTime;

@Entity
@Table(name = "users")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private Long telegramId;

    @Column(nullable = false)
    private String userName;

    @Enumerated(EnumType.STRING)
    private UserState state;

    private LocalDateTime createdAt;

}
