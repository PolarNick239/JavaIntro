package com.lessons.task2;

public class NotRobot extends Human {

    public NotRobot(int age, String name) {
        super(age, "Человек (а не робот) " + name);
    }

    public String talk() {
        return "Привет! Я настоящий человек, как здорово говорить на человеческом языке!";
    }

    public String ask(String text) {
        return "Я не понимать тебя, человек!";
    }
}
