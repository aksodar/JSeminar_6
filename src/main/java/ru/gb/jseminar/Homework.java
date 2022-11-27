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
        Homework HW6 = new Homework();
        List<Notebook> notebooks = HW6.initListNotebooks();
        Map<String, String> filterMap = new HashMap<>();
        filterMap.put("RAM", "8");
        filterMap.put("HDD", "512");
        filterMap.put("OS", "WIN11");
        filterMap.put("Color", "Silver");
        List<Notebook> filteredNotebooks = HW6.filter(filterMap, notebooks);

        for (Notebook notebook: filteredNotebooks) {
            System.out.print(notebook.getName() + " ");
            System.out.print(notebook.getModel() + " ");
            System.out.print("RAM:" + notebook.getRAM() + "GB ");
            System.out.print("HDD:" + notebook.getHDD() + "GB ");
            System.out.print("OS:" + notebook.getOS() + " ");
            System.out.print("Color:" + notebook.getColor() + " ");
            System.out.println("Price:" + notebook.getCost() + " руб.");
        }
    }

    public List<Notebook> initListNotebooks(){
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook(35000,"ASUS","N56VZ",16,1000, "WIN11","Brown"));
        notebooks.add(new Notebook(11000,"Samsung","r418",4,480, "WIN7","Black"));
        notebooks.add(new Notebook(135000,"Apple","MacBook Air",16,750, "MacOS","Silver"));
        notebooks.add(new Notebook(80000,"Lenovo","ThinkBook",8,512, "WIN11","Silver"));
        notebooks.add(new Notebook(56000,"Acer","Aspire 5",12,512, "WIN11","Black+Silver"));
        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) throws NullPointerException{
        if (notebooks == null || params == null){
            throw new NullPointerException();
        }
        List<Notebook> filteredNotebooks = new ArrayList<>();
        boolean flag = false;
        for (Notebook notebook: notebooks) {
            flag = true;
            for (Map.Entry<String, String> entry: params.entrySet()) {
                if (entry.getKey() == "RAM"){
                    if (!Integer.toString(notebook.getRAM()).equals(entry.getValue())){
                        flag = false;
                    }
                }
                if (entry.getKey() == "HDD"){
                    if (!Integer.toString(notebook.getHDD()).equals(entry.getValue())){
                        flag = false;
                    }
                }
                if (entry.getKey() == "OS"){
                    if (!notebook.getOS().equals(entry.getValue())){
                        flag = false;
                    }
                }
                if (entry.getKey() == "Color"){
                    if (!notebook.getColor().equals(entry.getValue())){
                        flag = false;
                    }
                }
            }
            if (flag){
                filteredNotebooks.add(notebook);
            }
        }
        return filteredNotebooks;
    }

}
