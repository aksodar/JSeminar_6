package ru.gb.jseminar;

import java.util.*;

public class Task0 {

    public static void main(String[] args) {
        Task0 tk0= new Task0();
        tk0.initHashSet();
        tk0.initLinkedHashSet();
        tk0.initTreeSet();

    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet(){

        Integer[]data= {1, 2, 3, 2, 4, 5, 6, 3};
        Set<Integer> set = new HashSet<>(List.of(data));
        System.out.println(set);

    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet(){
        Set <Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);

    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet(){
        Set <Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);

    }
}
