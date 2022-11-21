package ru.gb.jseminar;

import ru.gb.jseminar.data.*;

import java.util.List;
import java.util.Map;
public class Homework {
    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        notebooksList cl = new notebooksList();
        for (Notebook item : cl.initListNotebooks(8900.0, 4690.0, 1500.0, 790.0)) {
            System.out.println(item);
        }
    }

    public List<Notebook> initListNotebooks() {
        Notebook notebook1 = new Notebook(model.APPLE, color.RED, os.MACOS, cpu.APPLE,16, 2, 120000.0);
        return null;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        return null;
    }
}