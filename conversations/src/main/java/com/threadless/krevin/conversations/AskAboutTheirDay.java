package com.threadless.krevin.conversations;

public class AskAboutTheirDay {

    private final String name;

    public AskAboutTheirDay(String name) {
        this.name = name;
    }

    public String doIt() {
        return String.format("So %s, how's work going? Working hard or hardly working, amirite?!?! Up top!", name);
    }
}
