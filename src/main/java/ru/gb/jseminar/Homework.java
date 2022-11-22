package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
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
        Homework h1 = new Homework();
        Notebook n1 = new Notebook(50000, "Acer Aspire", 111, 8, "black", 512, "DOS");
        Notebook n2 = new Notebook(60000, "ASUS VivoBook", 222, 8, "black", 512, "Windows");
        Notebook n3 = new Notebook(60000, "HP Victus", 333, 16, "grey", 1024, "Windows");

        Map<String , Integer > map = new HashMap<>();
        map.put("price", 60000);
        map.put("ram", 8);
        map.put("hd", 512);

        List<String> resultList = h1.filter(map, h1.initListNotebooks(n1, n2, n3));
        System.out.println(resultList);
    }

    public List<Notebook> initListNotebooks(Notebook n1, Notebook n2, Notebook n3){
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(n1);
        notebooks.add(n2);
        notebooks.add(n3);
        return notebooks;
    }

    public List<String> filter(Map<String, Integer> params, List<Notebook> notebooks){
        List<String> resultList = new ArrayList<>();
        for (Notebook item:notebooks){
            if (item.getPrice() == params.get("price") && item.getRam() == params.get("ram") && item.getHd() == params.get("hd")){
                resultList.add(item.getModel());
            }
        }

        return resultList;
    }

}