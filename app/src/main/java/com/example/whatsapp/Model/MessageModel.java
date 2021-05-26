package com.example.whatsapp.Model;

public class MessageModel {
    String uId, message;
    Long timetamp;

    public MessageModel(String uId, String message, Long timetamp) {
        this.uId = uId;
        this.message = message;
        this.timetamp = timetamp;
    }

    public MessageModel(String uId, String message) {
        this.uId = uId;
        this.message = message;
    }
    public MessageModel(){

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
