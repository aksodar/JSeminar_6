package ru.gb.jseminar;

import java.util.*;

public class Task0 {

    public static void main(String[] args) {
        Task0 t0 = new Task0();
        t0.initHashSet();
        t0.initLinkedHashSet();
        t0.initTreeSet();

    }

    // Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initHashSet(){     // самый быстрый SET
        Set<Integer> set = new HashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);

    }

    // Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initLinkedHashSet(){     // каждый элемент хранит ссылку (не используется) но знать надо
        Set<Integer> set = new LinkedHashSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);

    }

    // Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.
    // Распечатайте содержимое данного множества.
    public void initTreeSet(){   // внутри красночерное дерево, преимущество что это дерево
        Set<Integer> set = new TreeSet<>(Arrays.asList(1, 2, 3, 2, 4, 5, 6, 3));
        System.out.println(set);


    }
}
