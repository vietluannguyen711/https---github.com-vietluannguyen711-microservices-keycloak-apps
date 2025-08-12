package com.example.messages.service.messages_service.controller;

import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.messages.service.messages_service.dto.Message;
import com.example.messages.service.messages_service.repository.MessageRepository;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/messages")
@Slf4j
class MessageController {

    private final MessageRepository messageRepository;

    MessageController(MessageRepository messageRepository) {

        this.messageRepository = messageRepository;

    }

    @GetMapping

    List<Message> getMessages() {

        return messageRepository.getMessages();

    }

    @PostMapping

    Message createMessage(@RequestBody @Valid Message message) {

        return messageRepository.createMessage(message);

    }

    @PostMapping("/archive")
    Map<String, String> archiveMessages() {
        log.info("Archiving all messages");
        return Map.of("status", "success");
    }
}
