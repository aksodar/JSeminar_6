package ru.gb.jseminar;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import javax.naming.InitialContext;

public class Task0 {

    public static void main(String[] args) {
        Task0 tk0 = new Task0();

        tk0.initHashSet();
        tk0.initLinkedHashSet();
        tk0.initTreeSet();
    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet() {
        Set<Integer> s = new HashSet<Integer>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3)); // приемущество перед другими:
                                                                                      // быстро работает
        // or like below
        // s.add(1);
        // s.add(2);
        // s.add(3);
        // s.add(2);
        // s.add(4);
        // s.add(5);
        // s.add(6);
        // s.add(3);
        System.out.println(s);

    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,
    // 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet() {
        Set<Integer> s1 = new LinkedHashSet<Integer>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3)); // приемущество перед
                                                                                             // другими: помнит порядок
                                                                                             // внесение элесентов,
                                                                                             // хранит ссылку, почти
                                                                                             // никто не использует
        // s1.add(1);
        // s1.add(2);
        // s1.add(3);
        // s1.add(2);
        // s1.add(4);
        // s1.add(5);
        // s1.add(6);
        // s1.add(3);
        System.out.println(s1);

    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet() {
        Set<Integer> s2 = new TreeSet<Integer>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));// приемущество перед другими:
                                                                                      // внутри красно-черное дерево,
                                                                                      // быстрее в определенных случаях
        // s2.add(1);
        // s2.add(2);
        // s2.add(3);
        // s2.add(2);
        // s2.add(4);
        // s2.add(5);
        // s2.add(6);
        // s2.add(3);
        System.out.println(s2);

    }
}
