package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.logging.Logger;

public class Task1 {

    public static void main(String[] args) {
        Task1 tk = new Task1();
        Logger lg = Logger.getLogger(Task1.class.getName());
        int[] array = tk.initArray(1000);
        lg.info(Arrays.toString(array));
        //lg.info(Arrays.toString(tk.getPercentUniqueValues(array)));
        System.out.println(tk.getPercentUniqueValues(array));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int arraySize){
        Random random = new Random();
        int[] myArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = random.nextInt(10);
        }
        return myArray;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        Set<Integer> mySet = new HashSet<>();
        for(int item: array){
            mySet.add(item);
        }
        double result = mySet.size() * 100/ (double)array.length;
        return result;
    }
}
