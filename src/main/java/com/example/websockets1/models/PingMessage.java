package com.example.websockets1.models;

public class PingMessage {

    private String name;


    public PingMessage() {
    }
    public PingMessage(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
