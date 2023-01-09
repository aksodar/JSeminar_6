package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.sql.SQLOutput;
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
        Notebook n1 = new Notebook("Honor", "MagicBook", (float)16.1, "Ryzen 5", 16, "не установлена", 60000);
        Notebook n2 = new Notebook("Apple", "MLXW3", (float)13.6, "Apple M2 M2", 16, "macOS", 155000);
        Notebook n3 = new Notebook("ASUS", "TUF Gaming A15", (float)15.6, "Core i5", 8, "Windows 11 Домашняя 64", 73000);
        Notebook n4 = new Notebook("Xiaomi", "RedmiBook 15", (float)15.6, "Core i3", 16, "Windows 11 Домашняя", 40000);
        Notebook n5 = new Notebook("Xiaomi", "RedmiBook 15", (float)15.6, "Core i5", 8, "Windows 11 Домашняя", 50000);
        Notebook n6 = new Notebook("Honor", "MagicBook X15", (float)15.6, "Core i5", 8, "Windows 10 Домашняя 64", 55000);
        Notebook n7 = new Notebook("ASUS", "TUF Dash F15", (float)15.6, "Core i7", 16, "Windows 11 Домашняя 64", 110000);
        List<Notebook> list = hw.initListNotebooks(n1, n2, n3, n4, n5, n6, n7);
        //System.out.println(list.toString());
        Map<String , String > choice = new HashMap<>();
        choice.put("cpu", "Core i7");
        choice.put("ram", "16");
        List<Notebook> filter = hw.filter(choice, list);
        System.out.println(filter.toString());

    }

    public List<Notebook> initListNotebooks(Notebook ... nb){
        List <Notebook> noteBookList = new ArrayList<Notebook>(Arrays.asList(nb));
        return noteBookList;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> Filter = new ArrayList<>();
        for (Notebook n : notebooks) {
            int count = 0;
            for (String key : params.keySet()) {
                if (Objects.equals(key, "brand")) {
                    if (params.get(key).equalsIgnoreCase(n.getBrand())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "model")) {
                    if (params.get(key).equalsIgnoreCase(n.getModel())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "ram")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(n.getRam()))) {
                        count++;
                    }
                }
                if (Objects.equals(key, "cpu")) {
                    if (params.get(key).equalsIgnoreCase(n.getCpu())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "os")) {
                    if (params.get(key).equalsIgnoreCase(n.getOs())) {
                        count++;
                    }
                }
                if (Objects.equals(key, "diagonal")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(n.getDiagonal()))) {
                        count++;
                    }
                }
                if (Objects.equals(key, "price")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(n.getPrice()))) {
                        count++;
                    }
                }
                if (count == params.size()) {
                    Filter.add(n);
                }
            }
        }
        return Filter;
    }
}
