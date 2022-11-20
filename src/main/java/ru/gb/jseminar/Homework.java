package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
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
        Homework homework = new Homework();
        List<Notebook> n1 = homework.initListNotebooks();
        Map<String, String> map = new HashMap<>();
        map.put("hdd", "1000");
        map.put("ram", "8");
        //map.put("brand", "HP");
        System.out.println(homework.filter(map, n1));
    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        Notebook notebook1 = new Notebook("8", "500", "1000$", "ASUS");
        notebooks.add(notebook1);
        Notebook notebook2 = new Notebook("8", "1000", "1500$", "Acer");
        notebooks.add(notebook2);
        Notebook notebook3 = new Notebook("16", "500", "2000$", "MacBook");
        notebooks.add(notebook3);
        Notebook notebook4 = new Notebook("4", "1000", "1400$", "HP");
        notebooks.add(notebook4);
        Notebook notebook5 = new Notebook("4", "500", "2100$", "Acer");
        notebooks.add(notebook5);
        Notebook notebook6 = new Notebook("8", "1000", "1900$", "HP");
        notebooks.add(notebook6);
        Notebook notebook7 = new Notebook("8", "500", "1800$", "Lenovo");
        notebooks.add(notebook7);
        Notebook notebook8 = new Notebook("16", "1000", "2300$", "HP");
        notebooks.add(notebook8);
        Notebook notebook9 = new Notebook("16", "2000", "2500$", "MacBook");
        notebooks.add(notebook9);
        Notebook notebook10 = new Notebook("8", "500", "1100$", "ASUS");
        notebooks.add(notebook10);
        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> sort = new ArrayList<>();
        List<Notebook> sort2 = new ArrayList<>();
        int count = 0;
        if (notebooks.isEmpty()) {
            throw new IllegalStateException("_");
        } else {
            for (String item : params.keySet()) {
                String value = params.get(item);
                if (count >= 1) {
                    boolean ramBool = false;
                    boolean brandBool = false;
                    boolean hddBool = false;
                    boolean costBool = false;
                    for (Notebook item2 : sort) {
                        if (item.equals("ram")) {
                            if (value.equals(item2.getRam())) {
                                ramBool = true;
                            }
                        }
                        if (item.equals("brand")) {
                            if (value.equals(item2.getBrand())) {
                                brandBool = true;
                            }
                        }
                        if (item.equals("hdd")) {
                            if (value.equals(item2.getHdd())) {
                                hddBool = true;
                            }
                        }
                        if (item.equals("cost")) {
                            if (value.equals(item2.getCost())) {
                                costBool = true;
                            }
                        }
                        if (ramBool || brandBool || hddBool || costBool) {
                            System.out.print("");
                        } else {
                            sort2.add(item2);
                        }
                        ramBool = false;
                        brandBool = false;
                        hddBool = false;
                        costBool = false;
                    }
                } else {
                    for (Notebook item1 : notebooks) {
                        if (item.equals("ram")) {
                            if (value.equals(item1.getRam())) {
                                sort.add(item1);
                            }
                        }
                        if (item.equals("brand")) {
                            if (value.equals(item1.getBrand())) {
                                sort.add(item1);
                            }
                        }
                        if (item.equals("hdd")) {
                            if (value.equals(item1.getHdd())) {
                                sort.add(item1);
                            }
                        }
                        if (item.equals("cost")) {
                            if (value.equals(item1.getCost())) {
                                sort.add(item1);
                            }
                        }
                    }
                }
                count++;
            }
            for (Notebook item : sort2) {
                sort.remove(item);
            }
        }
        return sort;
    }
}
