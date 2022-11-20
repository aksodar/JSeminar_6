package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать множество ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Notebook> products = hw.initListNotebooks();
        Map<String, String> filterParam = new TreeMap<>();
        filterParam.put("color", "black");
        filterParam.put("model", "dell");
        List<Notebook> FiltredProducts = hw.filter(filterParam, products);
        hw.printList(FiltredProducts);
        
    }

    public List<Notebook> initListNotebooks(){
        List<Notebook> product = new ArrayList<>();
        Notebook item_1 = new Notebook("red","hp","8");
        Notebook item_2 = new Notebook("blue","acer","16");
        Notebook item_3 = new Notebook("black","dell","32");
        product.add(item_1);
        product.add(item_2);
        product.add(item_3);
        return product;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> prod){
        List<Notebook> filtredList = new ArrayList<>();

        for (Notebook item: prod) {
            List<String> tmp = new ArrayList<>();

            for (String param: params.keySet()) {

                if (item.CreateDict().get(param).equals(params.get(param))){
                    tmp.add("ok");
                }
            }
            if (tmp.size() == params.size()) {
                filtredList.add(item);
            }

        }

        return filtredList;
    }
    public void printList(List<Notebook> prod){
        for (Notebook item: prod) {
            System.out.println(item.CreateDict());
        }
}
}