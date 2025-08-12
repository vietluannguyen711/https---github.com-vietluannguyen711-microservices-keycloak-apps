package com.example.messages.service.messages_service.dto;

import java.time.Instant;

import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
@Data
@AllArgsConstructor
public class Message {
    private Long id;
    @NotEmpty
    private String content;
    @NotEmpty
    private String createdBy;
    private Instant createdAt;
}
