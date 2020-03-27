package com.example.chat.domain;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class ChatMessage {
    private String chatRoomId;
    private String writer;
    private String message;
    private MessageType type;
}
