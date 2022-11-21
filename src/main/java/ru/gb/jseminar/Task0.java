package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
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
    public void initHashSet() {
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        set.forEach((s) -> System.out.printf("%d ", s));
        System.out.println(set);
    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
    // 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet() {
        Set<Integer> lset = new LinkedHashSet<>();
        lset.addAll(Arrays.asList(1, 2, 3, 4, 5, 6, 6, 4, 3));
        System.out.println(lset);
    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet() {
        Set<Integer> tset = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(tset);
    }
}
