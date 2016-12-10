package com.lessons.task2;

public class Human {

    int age;
    String name;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public String talk() {
        return "Привет! Я - " + name + "!";
    }

    public String ask(String text) {
        return "Ты сказал: '"+ text + "'?";
    }

    @Override
    public String toString() {
        return "Человек, имя - " + name + ", возраст - " + age + " лет";
    }
}
