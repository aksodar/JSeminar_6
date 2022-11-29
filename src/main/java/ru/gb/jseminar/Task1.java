package ru.gb.jseminar;

import java.util.*;

public class Task1 {

    public static void main(String[] args) {
        Task1 tk1 = new Task1();
        int[] array = tk1.initArray(1000);
        System.out.println(Arrays.toString(array));
        System.out.println(tk1.getPercentUniqueValues(array));

    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int arraysSize){
        Random random = new Random();
        int[] myArray = new int[arraysSize];
        for (int i = 0; i < arraysSize; i++) {
            myArray[i] = random.nextInt(10);
        }

        return myArray;}

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        Set<Integer> set = new HashSet<>();
        for (int item: array) {
            set.add(item);
        }
        double result = set.size()*100/array.length;

        return result;
    }
}
