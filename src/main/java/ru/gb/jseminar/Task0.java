package ru.gb.jseminar;

import java.util.*;

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
        Set<Integer> set = new HashSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);

    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet(){
        Set<Integer> set = new LinkedHashSet();
        set.addAll(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);
    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet(){
        Set<Integer> set = new TreeSet<>();
        set.addAll(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);
    }
}
