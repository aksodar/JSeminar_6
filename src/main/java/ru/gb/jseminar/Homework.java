package ru.gb.jseminar;

import com.sun.source.tree.ContinueTree;
import ru.gb.jseminar.data.Notebook;

import java.util.*;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать список ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();



        List<Notebook> products = hw.initListNotebooks();

        Map<String, String> filterParam = new TreeMap<>();
        filterParam.put("color", "black");
        filterParam.put("ram", "8");
//        filterParam.put("hd", "1000");

        List<Notebook> FiltredProducts = hw.filter(filterParam, products);
        hw.printList(FiltredProducts);


    }


    public List<Notebook> initListNotebooks(){

        List<Notebook> product = new ArrayList<>();

        Notebook item_0 = new Notebook("1", "8", "1000", "Win10", "black", "amd");
        Notebook item_1 = new Notebook("2", "64", "10000", "Win10", "black", "amd");
        Notebook item_2 = new Notebook("3", "32", "5000", "Win10", "pink", "intel");
        Notebook item_3 = new Notebook("4", "16", "1000", "Linux", "white", "intel");
        Notebook item_4 = new Notebook("5", "8", "1000", "Linux", "black", "intel");
        Notebook item_5 = new Notebook("6", "8", "10000", "Linux", "black", "intel");

        product.add(item_0);
        product.add(item_1);
        product.add(item_2);
        product.add(item_3);
        product.add(item_4);
        product.add(item_5);

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
