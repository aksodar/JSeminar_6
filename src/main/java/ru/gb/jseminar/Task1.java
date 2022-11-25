package ru.gb.jseminar;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        int[] array = t1.initArray(1000);
        System.out.println(t1.getPercentUniqueValues(array));

    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int arraySize) {
        int[] array = new int[arraySize];
        Random random = new Random();
        for (int i = 0; i < arraySize; i++) {
            array[i] = random.nextInt(10);
        }
        return array;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int item : array) {
            set.add(item);
        }
        return set.size() * 100 / (double) array.length;
    }
}
