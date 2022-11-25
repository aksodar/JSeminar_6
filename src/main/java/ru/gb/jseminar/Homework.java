package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.*;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Notebook> notebooksList = hw.initListNotebooks();
        Map<String, String> params = new HashMap<>();
        params.put("brand", "msi");
        params.put("ram", "16");
        System.out.println(hw.filter(params, notebooksList));

    }

    public List<Notebook> initListNotebooks() {

        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("msi", 16, 'D', "rtx3070", 180000));
        notebooks.add(new Notebook("msi", 12, 'W', "mx450", 120000));
        notebooks.add(new Notebook("hp", 8, 'L', "gtx1060", 80000));
        notebooks.add(new Notebook("asus", 6, 'n', "gtx540mx", 5000));

        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {

        if (params.isEmpty()) return notebooks;
        if (notebooks.isEmpty()) throw new NoSuchElementException("haven`t any notebooks");

        List<Notebook> filteredNotebooks = new ArrayList<>();
        for (Notebook nb : notebooks) {
            int count = 0;
            for (String key : params.keySet()) {
                if (Objects.equals(key, "brand")) {
                    if (params.get(key).equals(nb.getBrand())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "ram")) {
                    if (params.get(key).equals(String.valueOf(nb.getRam()))) {
                        count++;
                    }
                }
                if (Objects.equals(key, "os")) {
                    if (params.get(key).equals(String.valueOf(nb.getOs()))) {
                        count++;
                    }
                }
                if (Objects.equals(key, "vCard")) {
                    if (params.get(key).equals(nb.getvCard())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "cost")) {
                    if (params.get(key).equals(String.valueOf(nb.getCost()))) {
                        count++;
                    }
                }
            }
            if (count == params.size()) {
                filteredNotebooks.add(nb);
            }
        }
        return filteredNotebooks;
    }

}
