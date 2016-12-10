package com.lessons.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Primitives {

    public static int sum(int a, int b) {

        // 1.1 TODO функция должна считать сумму двух чисел и возвращать ее

        return 0;
    }

    /**
     * Пример функции, которая работает с массивом чисел и находит максимальный элемент в этом массиве.
     * При этом в случае пустого массива на входе функция кинет ошибку.
     */
    public static int max(int[] xs) {
        if (xs.length == 0) {  // Проверяем длину массива
            throw new IllegalArgumentException("Array should not be empty!");  // Если передан пустой массив - кидаем ошибку о недопустимом аргументе
        }

        int res = xs[0];  // Пока что самый большой элемент - первый, сохраняем его как кандидата в результаты
        for (int i = 0; i < xs.length; ++i) {  // бежим по всем элементам массива с xs[0] по xs[xs.length - 1], индекс текущего элемента находится в переменной i, которая объявлена в первой части for
            if (xs[i] > res) {  // проверяем - вдруг очередной элемент больше текущего кандидата в результаты?
                res = xs[i];  // если да - то обновляем результат
            }
        }

        return res;
    }

    public static int sum(int[] xs) {

        // 1.2 TODO функция должна считать сумму всех элементов массива

        return 0;
    }

    /**
     * Пример функции, которая работает с двумя массивами чисел и находит их по-элементную сумму, которую и возвращает ввиде третьего массива такой же длины.
     * В случае несовпадающих длин массивов - будет кинута ошибка.
     */
    public static int[] sumOfArrays(int[] xs, int[] ys) {
        if (xs.length != ys.length) {  // убеждаемся что массивы имеют одинаковый размер
            throw new IllegalArgumentException("Arrays should be of the same length!");
        }

        int n = xs.length; // сохраняем длину массивов (мы уже убедились что они имеют одинаковый размер)
        int[] res;  // создаем результат - переменную типа "массив чисел", но пока что он не инициализированную, а значит на текущий момент эта переменная - null, и при обращении к любому ее элементу будет получен NullPointerException
        res = new int[n];  // создаем массив в памяти размера n, каждый элемент массива изначально равен нулю
        for (int i = 0; i < n; ++i) {
            res[i] = xs[i] + ys[i];
        }

        return res;  // возвращение массива как результата ничем не отличается от возвращения целочисленного результата - ключевое слово return + переменная в которой находится результат
        // главное чтобы совпадал тип возвращаемого значения, который указан перед названием функции и тип переменной, которая указана после слова return
    }

    /**
     * Функция должна по  массиву элементов создавать массив boolean элементов (т.е. в каждой ячейке значение true/false)
     * Размер результирующего массива и входного массива совпадают, и при этом true в результате должно быть на таких и только на таких позициях i, что xs[i - 1] < xs[i] < xs[i + 1]
     * (если хотя бы одного соседа нет - точка не считается локальным максимумом)
     */
    public static boolean[] isMax(int[] xs) {
        boolean[] res = new boolean[xs.length];

        // 1.3 TODO функция должна сказать какие элементы являются точками локального максимума, а какие - нет
        // Подсказка: чтобы написать логическое и/или надо написать два условия и между ними знак && (для и) или || (для или).

        return res;
    }

    /**
     * Почти то же самое, что и функция boolean[] isMax(int[] xs), но вместо логической маски эта функция возвращает позиции в массиве, на которых результат предыдущей функции был бы равен истине
     * Т.е. возвращается список позиций, на которых элементы входного массива являются локальными максимумами (оба соседних значения есть и элемент строго больше обоих соседей)
     */
    public static List<Integer> getMaxPositions(int[] xs) {
        boolean[] mask = isMax(xs);

        List<Integer> res = new ArrayList<Integer>();
        for (int i = 0; i < xs.length; ++i) {
            if (mask[i]) {  // если элемент является максимумом - добавляем его позицию в результат
                res.add(i);
            }
        }

        return res;
    }

    public static void main(String[] args) {
        int a = 112;
        int b = 127;
        System.out.println("Сумма чисел " + a + " и " + b + ": " + sum(a, b)); // 1.1 TODO реализовать функцию int sum(int a, int b)
        System.out.println();

        int[] xs = new int[]{1, 2, 4, 3, 3, 7, 6, 4, 5};
        System.out.println("Сумма элементов массива " + Arrays.toString(xs) + ": " + sum(xs)); // 1.2 TODO реализовать функцию int sum(int[] xs)
        System.out.println();

        int[] ys = new int[]{1, -1, 2, 2, 3, -2, 1, 2, 1};
        System.out.println("Сумма массива " + Arrays.toString(xs) + "\n            и " + Arrays.toString(ys) + "\n        равна " + Arrays.toString(sumOfArrays(xs, ys)));
        System.out.println();

        boolean[] mask = isMax(xs); // 1.3 TODO реализовать функцию boolean[] isMax(int[] xs)
        System.out.println("                           Массив: " + Arrays.toString(xs) + "\n является ли локальным максимумом: " + Arrays.toString(mask));
        System.out.println();

        List<Integer> maxPositions = getMaxPositions(xs);
        System.out.println("В массиве " + Arrays.toString(xs) + "\n локальные максимумы на позициях: " + maxPositions + " (нумерация с нуля)");
    }

}
