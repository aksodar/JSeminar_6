package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.*;
import java.util.logging.Logger;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Notebook> result = hw.initListNotebooks();
        Map<String, String> map = new HashMap<>();
        //map.put("model", "HP");
        map.put("ram", "8");
        map.put("oS", "Windows");
        Logger lg = Logger.getLogger(Homework.class.getName());
        for (Notebook notebook : result) {
            lg.info(notebook.toString());
        }
        lg.info(hw.filter(map, result).toString());

    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        Notebook product1 = new Notebook("Acer", 8, "silver", "Windows", 15);
        Notebook product2 = new Notebook("Apple", 16, "black", "macOS", 13);
        Notebook product3 = new Notebook("HP", 8, "black", "Windows", 13);
        notebooks.add(product1);
        notebooks.add(product2);
        notebooks.add(product3);

        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> resultFilter = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            int count = 0;
            for (String key : params.keySet()) {
                if (Objects.equals(key, "model")) {
                    if (params.get(key).equalsIgnoreCase(notebook.getModel())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "ram")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(notebook.getRam()))) {
                        count++;
                    }
                }
                if (Objects.equals(key, "color")) {
                    if (params.get(key).equalsIgnoreCase(notebook.getColor())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "oS")) {
                    if (params.get(key).equalsIgnoreCase(notebook.getoS())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "diagonal")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(notebook.getDiagonal()))) {
                        count++;
                    }
                }
                if (count == params.size()) {
                    resultFilter.add(notebook);
                }
            }

        }

        return resultFilter;
    }

}
