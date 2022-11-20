package ru.gb.jseminar;

import java.util.*;

public class Task0 {

    public static void main(String[] args) {
        Task0 task0 = new Task0();
        task0.initHashSet();
        task0.initLinkedHashSet();
        task0.initTreeSet();

    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet(){
        Set<Integer>set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(4);
        set.add(5);
        set.add(6);
        set.add(3);
        System.out.println(set);
    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet(){
        LinkedHashSet<Integer>set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
//        set.add(1);
//        set.add(2);
//        set.add(3);
//        set.add(2);
//        set.add(4);
//        set.add(5);
//        set.add(6);
//        set.add(3);
        System.out.println(set);

    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet(){
        TreeSet<Integer>set = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);

    }
}
