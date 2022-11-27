package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int arSize = 100;
        int[] result = task1.initArray(arSize);
        System.out.println(Arrays.toString(result));
        System.out.println(task1.getPercentUniqueValues(result));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int arraysize){
        Random random = new Random();
        int[] myArray = new int[arraysize];
        for (int i = 0; i < arraysize; i++) {
            myArray[i] = random.nextInt(10);
        }
        return myArray;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int element: array) {
            set.add(element);
        }
        return set.size() * 100 / array.length;
    }
}
