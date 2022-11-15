package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[] arr = task1.initArray(1000);
        System.out.println(Arrays.toString(arr));
        System.out.println(task1.getPercentUniqueValues(arr));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int arraySize) {
        Random random = new Random();
        int[] arr = new int[arraySize];
        for (int i = 0; i < arr.length; i ++) {
            arr[i] = random.nextInt(24);
        }
        return arr;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int item : array) {
            set.add(item);
        }
        return (double) set.size() * 100 / array.length;
    }
}
