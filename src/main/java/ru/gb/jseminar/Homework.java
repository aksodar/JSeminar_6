package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook.Properties.Color;
import ru.gb.jseminar.data.Notebook.PropertiesConfig;

import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Homework {
    public static Homework hw = new Homework();
    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
//        System.out.println("Before");
//        var list = hw.initListNotebooks(3);
//        for (Notebook nb: list) {
//            String a = "RAM";
//            System.out.println(nb);
//            System.out.println(nb.getPropertyValue(PropertiesConfig.valueOf(a).ordinal()));
//        }
//
//        System.out.println("After");
//        Map<String,String> param = new HashMap<>();
//        param.put("RAM","16");
//        param.put("MODEL","ELITEBOOK");
//        var list1 = hw.filter(param, list);
//        for (Notebook nb: list1) {
//            System.out.println(nb);
//        }
        Notebook nb = new Notebook(0,0,0,0,2,85930,16,512);
        System.out.println(nb);

    }

    public List<Notebook> initListNotebooks(int size){
        List<Notebook> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            Notebook nb = new Notebook();
            nb.randInit();
            list.add(nb);
        }
        return list;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        return notebooks.stream().filter(notebook -> {
            int size = params.size();
            AtomicInteger count = new AtomicInteger(0);
            params.forEach((a, b) -> {
                if(notebook.getPropertyValue(PropertiesConfig.valueOf(a).ordinal()).equals(b))
                    count.getAndIncrement();
            });
            return size == count.get();
        }).collect(Collectors.toList());
    }

}
