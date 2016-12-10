package com.lessons.task2;

public class ElephantsFan extends Human {

    public ElephantsFan(int age, String name) {
        super(age, "ЛюбительСлонов" + name);
    }

    @Override
    public String talk() {
        return "Купи мне слоника?";
    }

    @Override
    public String ask(String text) {
        return "Все говорят '" + text + "', а ты возьми и купи мне слоника!";
    }

    @Override
    public String toString() {
        return "Страстный любитель слоников, слоники зовут его - <ИМЯ>, <ЧИСЛО> годиков"; // 2.1 TODO подставить возраст и имя этого любителя
    }
}
