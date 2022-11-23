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
        List<Notebook> listNotebooks = hw.createNotebook();
        Map<String, Object> filterMap = new HashMap<>();
        filterMap.put("name","apple");
        filterMap.put("ram",1024);
        filterMap.put("os","macOS");
        System.out.println(hw.filter(filterMap,listNotebooks).toString());
    }

    public List<Notebook> createNotebook(){
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(17000,"s2506","ASUS",2048,"Windows"));
        notebooks.add(new Notebook(25000,"macbookPro","apple",2048,"macOS"));
        notebooks.add(new Notebook(20000,"macbookAir","apple",1024,"macOS"));
        notebooks.add(new Notebook(15000,"k892","Lenovo",1024,"Windows"));
        notebooks.add(new Notebook(3000,"pi400","raspberry",512,"Linux"));
        return notebooks;
    }


    public List<Notebook> filter(Map<String, Object> params, List<Notebook> notebooks){
        List<Notebook> result = new ArrayList<>();

        for (Notebook notebook : notebooks){
            int count = 0;
            for(String param : params.keySet()){
                if (notebook.mapNotebook().containsValue(params.get(param))){
                    count ++;
                }
            }
            if (count == params.keySet().size()){
                result.add(notebook);
            }
        }
        if (!result.isEmpty()){
            return result;
        }
        throw new IllegalStateException("It is not computer equals your parametrs");

    }
}
