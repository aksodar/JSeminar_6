package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task0 {

    public static void main(String[] args) {
        Task0 task = new Task0();
        task.initHashSet();
        task.initLinkedHashSet();
        task.initTreeSet();
    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet(){
        var hs = new HashSet<Integer>();
        int[] s = {1, 2, 3, 2, 4, 5, 6, 3};
        for (int i : s) {
            hs.add(i);
        }
        System.out.printf("Изначальный массив значений: %s\n", Arrays.toString(s)); // [1, 2, 3, 2, 4, 5, 6, 3]
        System.out.printf("Множество значений HashSet: %s\n", hs); // [1, 2, 3, 4, 5, 6]
    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet(){
        var lhs = new LinkedHashSet<Integer>();
        int[] s = {1, 2, 3, 2, 4, 5, 6, 3};
        for (int i : s) {
            lhs.add(i);
        }
        System.out.printf("Изначальный массив значений: %s\n", Arrays.toString(s)); // [1, 2, 3, 2, 4, 5, 6, 3]
        System.out.printf("Множество значений LinkedHashSet: %s\n", lhs); // [1, 2, 3, 4, 5, 6] запоминает порядок добавления
    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet(){
        var ths = new TreeSet<Integer>();
        int[] s = {1, 2, 3, 2, 4, 5, 6, 3};
        for (int i : s) {
            ths.add(i);
        }
        System.out.printf("Изначальный массив значений: %s\n", Arrays.toString(s)); // [1, 2, 3, 2, 4, 5, 6, 3]
        System.out.printf("Множество значений TreeSet: %s\n", ths); //[1, 2, 3, 4, 5, 6] упорядочен по возрастанию
    }
}
