package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int []array = new int[1000];
        array = task1.initArray();
        System.out.println(task1.getPercentUniqueValues(array));

    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int [] initArray(){
        Random random = new Random();
         int []arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(10);
        }
//        int [] l = new Random().ints( 24,1,24).toArray();
//
//        return l;


        return arr;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array){
        Set<Integer>set = new HashSet<>();
        for (int item:array) {
            set.add(item);
        }
        double result = set.size()*100/(double)array.length;
        return result;
    }
}
