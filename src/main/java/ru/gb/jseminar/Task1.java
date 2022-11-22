package ru.gb.jseminar;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        System.out.println(Arrays.toString(t1.initArray(1000)));
        double result = t1.getPercentUniqueValues(t1.initArray(1000));
        System.out.println(result);

    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int arraySize){
        Random random = new Random();
       int[] nyArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nyArray[i] = random.nextInt(25);
        }

        return nyArray;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        Set<Integer> mySet = new HashSet<>();
        for (int item: array){
            mySet.add(item);
        }
        double res = mySet.size() * 100 / (double) array.length;
        return res;
    }
}
