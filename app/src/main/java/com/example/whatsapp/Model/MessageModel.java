package com.example.whatsapp.Model;

public class MessageModel {
    String uId, message,messageId;
    Long timetamp;

    public MessageModel(String uId, String message, String messageId, Long timetamp) {
        this.uId = uId;
        this.message = message;
        this.messageId = messageId;
        this.timetamp = timetamp;
    }

    public MessageModel(String uId, String message) {
        this.uId = uId;
        this.message = message;
    }

    public MessageModel(String uId, String message, String messageId) {
        this.uId = uId;
        this.message = message;
        this.messageId = messageId;
    }

    public MessageModel(){

    }

    public String getMessageId() {
        return messageId;
    }

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Long getTimetamp() {
        return timetamp;
    }

    public void setTimetamp(Long timetamp) {
        this.timetamp = timetamp;
    }
}
