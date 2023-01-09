package ru.gb.jseminar;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Task0 {

    public static void main(String[] args) {
        Task0 db = new Task0();
        //int[] d = {1, 2, 3, 2, 4, 5, 6, 3};
        db.initHashSet();
        db.initLinkedHashSet();
        db.initTreeSet();

    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet(){
        HashSet<Integer> g = new HashSet<>();
        int[] d = {8, 7, 1, 9, 2, 3, 2, 4, 5, 6, 3};
        for (int i : d){
            g.add(i);
        }
        System.out.println(g);
    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet(){
        LinkedHashSet<Integer> g1 = new LinkedHashSet<>();
        int[] d = {8, 7, 1, 9, 2, 3, 2, 4, 5, 6, 3};
        for (int i : d){
            g1.add(i);
        }
        System.out.println(g1);
    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet(){
        TreeSet<Integer> g2 = new TreeSet<>();
        int[] d = {8, 7, 1, 9, 2, 3, 2, 4, 5, 6, 3};
        for (int i : d){
            g2.add(i);
        }
        System.out.println(g2);

    }
}
