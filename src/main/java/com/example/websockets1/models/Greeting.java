package com.example.websockets1.models;

public class Greeting {

    private String content;

    public Greeting() {
    }

    public Greeting(String content) {
        this.content = content;
    }

    public String getGreeting() {
        return content;
    }

    public void setGreeting(String greeting) {
        this.content = content;
    }
}
