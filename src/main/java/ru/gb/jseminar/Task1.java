package ru.gb.jseminar;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Task1 tsk = new Task1();
        int[] array = tsk.initArray(1000);
        System.out.println(tsk.getPercentUniqueValues(array));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int arraySize){
        int[] myArr = new int[arraySize];
        Random rnd = new Random();
        for (int i = 0; i < arraySize; i++){
            myArr[i] = rnd.nextInt(10);
        }
        return myArr;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        Set<Integer> hset = new HashSet<>();
        for (int item:array){
            hset.add(item);
        }
        double result = hset.size() * 100 / array.length;
        return result;
    }
}
