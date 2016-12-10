package com.lessons.task2;

public class Terminator extends Human {

    public Terminator(int age, String name) {
        super(age, "Terminator " + name);
    }

    public String talk() {
        return "Привет! Я настоящий человек, как здорово говорить на человеческом языке!";
    }

    public String ask(String text) {
        return "Я не понимать тебя, человек!";
    }
}
