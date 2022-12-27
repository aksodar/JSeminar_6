package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.logging.Logger;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {

        Homework homework = new Homework();

        Map<String, String> filterMap = new HashMap<>();
        filterMap.put("RAM", "16");
        filterMap.put("SSD", "1024");
        filterMap.put("size", "15");
        filterMap.put("color", "black");

        List<Notebook> resultList = homework.filter(filterMap, homework.initListNotebooks());
        for (Notebook result : resultList) {
            
            System.out.println(result);
        }
        

        
    }


    public List<Notebook> initListNotebooks(){

        List<Notebook> notebooks = new ArrayList<>();
        
        notebooks.add(new Notebook(80000 , "Acer", 8, 512, "Linux", 15, "black"));
        notebooks.add(new Notebook(85000 , "Asus", 16, 512, "Windows", 15, "red"));
        notebooks.add(new Notebook(100000 , "Lenovo", 16, 1024, "None", 15, "black"));
        notebooks.add(new Notebook(98000 , "MSI", 16, 1024, "Linux", 14, "white"));
        notebooks.add(new Notebook(106000 , "HP", 16, 1024, "Windows", 15, "black"));
        return notebooks;

    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){

        List<Notebook> nbFiltr = new ArrayList<>();
        
        for (Notebook notebook : notebooks) {
            Map<String, String> nbParam = notebook.getAllParams();
            boolean flag = true;
            for (String param : params.keySet()) {
                if (nbParam.containsKey(param)) {
                    if (!params.get(param).equals(nbParam.get(param))) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                nbFiltr.add(notebook);
            }
        }

        return nbFiltr;
    }
    
}
