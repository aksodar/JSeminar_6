package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать множество ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {

    }

    public Notebook createNotebook (String manufacturer, int ram, int ssd, String os, int size, String color, int price) {
        return new Notebook (manufacturer, ram, ssd, os, size, color, price);
    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(createNotebook("Acer", 8, 512, "Windows 10", 15, "black", 60000));
        notebooks.add(createNotebook("Asus", 16, 1024, "Windows 11", 15, "black", 100000));
        notebooks.add(createNotebook("MSI", 16, 1024, "Windows 11", 14, "black", 90000));

        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {

        return null;
    }

}
