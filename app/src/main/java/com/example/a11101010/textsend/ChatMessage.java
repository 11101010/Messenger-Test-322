package com.example.a11101010.textsend;

import java.util.Date;

/**
 * Created by 11101010 on 30-Jul-17.
 */

public class ChatMessage
{
    private String messageText;
    private String messageSender;
    private long messageTime;

    public ChatMessage(String messageText, String messageSender) {
        this.messageText = messageText;
        this.messageSender = messageSender;
        this.messageTime = new Date().getTime();
    }

    public ChatMessage(){

    }

    public String getMessageText() {
        return messageText;
    }

    public void setMessageText(String messageText) {
        this.messageText = messageText;
    }

    public String getMessageSender() {
        return messageSender;
    }

    public void setMessageSender(String messageSender) {
        this.messageSender = messageSender;
    }

    public long getMessageTime() {
        return messageTime;
    }

    public void setMessageTime(long messageTime) {
        this.messageTime = messageTime;
    }
}

