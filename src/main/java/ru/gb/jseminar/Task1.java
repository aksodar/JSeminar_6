package ru.gb.jseminar;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
public class Task1 {

    public static void main(String[] args) {
        Task1 task1 = new Task1();
        int[] array = task1.initArray(1000);

        System.out.println(task1.getPercentUniqueValues(array));
    }

    // Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
    public int[] initArray(int sizeArray) {
        Random rand = new Random();
        int[] myNewArray = new int[sizeArray];
        for (int i = 0; i < sizeArray; i++) {

            myNewArray[i] = rand.nextInt(10);
        }
        return myNewArray;
    }

    // Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных
    // значений в данном массиве и верните его в виде числа с плавающей запятой.
    // Для вычисления процента используйте формулу:
    // процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
    public double getPercentUniqueValues(int[] array) {
        Set<Integer> myNewSet = new HashSet<>();
        for (Integer i : array) {
            myNewSet.add(i);
        }
        double result = myNewSet.size()*100 / array.length;

        return result;
    }
}