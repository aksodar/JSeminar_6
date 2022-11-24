package ru.gb.jseminar;

import java.util.*;

public class Task0 {

    public static void main(String[] args) {
        Task0 tsk = new Task0();
        tsk.initHashSet();
        tsk.initLinkedHashSet();
        tsk.initTreeSet();
    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet(){
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);
    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet(){
        Set<Integer> lset = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(lset);
    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet(){
        Set<Integer> tset = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(tset);
    }
}
