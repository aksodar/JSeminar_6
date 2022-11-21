package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Task1 t1 = new Task1();
        int [] array = t1.initArray(1000);
        System.out.println(Arrays.toString(array));
        System.out.println(t1.getPercentUniqueValues(array));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int arraySize){
        Random rn = new Random();
        int [] myArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++){
            myArray[i] = rn.nextInt(10);
        }
        return myArray;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        Set <Integer> myset = new HashSet<>();
        for (int item : array){
            myset.add(item);
        }
        double result = (myset.size()) * 100 / (double)array.length;
        return result;
    }
}
