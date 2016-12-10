package com.lessons.task2;

import java.util.Random;

public class UnicornsVisionary extends Human {

    public UnicornsVisionary(int age, String name) {
        super(age, name);
    }

    @Override
    public String talk() {
        return "Пум-бурум-пам-пам-пам-бам! О, Единорог!";
    }

    @Override
    public String ask(String text) {
        if (text.contains("Единорог")) {
            return "Кто сказал Единорог??";
        } else {
            Random r = new Random();
            if (r.nextInt(10) >= 1) {
                return "О, Единорог прошел!";
            } else {
                return "Здорово лежать на лугу, рядом журчит ручеёк, пасутся единороги, на небе созвездие Большой Медведицы.";
            }
        }
    }

    @Override
    public String toString() {
        return "Видит единорогов, возраст в паспорте - " + age + " года, психологический возраст - " + (age / 3) + " лет, воображаемые друзья зовут его " + name;
    }
}
