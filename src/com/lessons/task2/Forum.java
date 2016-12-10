package com.lessons.task2;

public class Forum {

    public static void main(String[] args) {
        Human vasya = new Human(14, "Васька из третьего подъезда");
        ElephantsFan fan = new ElephantsFan(13, "Восьмиклассник");
        NotRobot notRobot = new NotRobot(3, "Серия 2013239 Номер 42");
        UnicornsVisionary person = new UnicornsVisionary(22, "Коля");
        Human isaakiy = new Human(116, "Исаакий");

        Human[] people = new Human[]{vasya, fan, notRobot, person, isaakiy};
        System.out.println("В дискуссии принимают участие:");
        for (Human human: people) {
            System.out.println(" - " + human);  // 2.1 TODO доделать функцию toString() в классе ElephantsFan
        }
        System.out.println();

        System.out.println("Все одновременно сказали:");
        //
        // 2.2 TODO пусть каждый скажет слово!
        //
        System.out.println();

        System.out.println("Каждый услышал все фразы, особенно свою, и ответил:");
        //
        // 2.3 TODO пусть каждый ответит на сказанное каждого (два вложенных цикла, на свои фразы отвечать тоже разумно)
        //
        System.out.println();

        //
        // 2.4 TODO пусть любитель слоников попросит купить себя слоника несмотря на то что он сам перед этим себя попросит купить слоника не смотря на то что перед этим он сам себя попросит купить слоника
        //
        System.out.println();

        // 2.5 TODO доп. задание - сделать так, чтобы у каждого объекта (объект - это конкретный экземпляр какого-то класса) метод talk() был вызван ровно один раз за исполнение этой программы (подсказка: сохранять результаты исполнения в массив, и переиспользовать элементы оттуда)
    }
}
