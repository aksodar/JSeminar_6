package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Task1 tk1 = new Task1();
        int[] ar1 = tk1.initArray(1000);
        // System.out.println(Arrays.toString(tk1.initArray(1000)));
        System.out.println(tk1.getPercentUniqueValues(ar1));

    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами
    // от 0 до 24.
    public int[] initArray(int arraySize) {
        Random random = new Random();
        int[] myArray = new int[arraySize];
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = random.nextInt(10);

        }
        return myArray;
    }

    // public int[] initArray(){

    // int [] l = new Random().ints( 24,1,24).toArray();

    // return l;
    // }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set
    // вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее
    // количество чисел в массиве.
    public double getPercentUniqueValues(int[] array) {
        int size = array.length;
        Set<Integer> setArray = new HashSet<>();
        for (int item : array) {
            setArray.add(item);

        }
        System.out.println(setArray);
        double result = setArray.size() * 100 / size;

        return result;
    }
}
