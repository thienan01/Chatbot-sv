package com.caovy2001.chatbot.service.node.command;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CommandUpdateMessage {
    private String node_id;
    private  String message;
}
