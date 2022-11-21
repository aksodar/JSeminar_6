package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Task1 task = new Task1();
        int[] array = task.initArray(100);
        System.out.println(Arrays.toString(array));
        System.out.println(task.getPercentUniqueValues(array));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами
    // от 0 до 24.
    public int[] initArray(int arrSize) {
        Random random = new Random();
        int[] arr = random.ints(arrSize, 0, 24).toArray();
        // int[] arr = new int[arrSize];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(0, 24);
        }
        return arr;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set
    // вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее
    // количество чисел в массиве.
    public double getPercentUniqueValues(int[] array) {
        Set<Integer> set = new HashSet<>();
        for (int number : array) {
            set.add(number);
        }
        System.out.println(set);
        return set.size() * 100 / (double) array.length;
    }
}
