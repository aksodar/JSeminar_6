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
    //      Пример: ОЗУ(RAM) - значение, Объем ЖД - значение, Операционная система - значение, Цвет - значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.

    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Notebook> notebooks = hw.initListNotebooks();

        Map<String, String> params = new HashMap<>();
        params.put("OS", "Windows");
        params.put("color", "silver");

        System.out.println(hw.filter(params, notebooks));
    }

    public List<Notebook> initListNotebooks(){
        Notebook notebook1 = new Notebook("APPLE", 12345, "black", 900, 16, "MacOS", 150000);
        Notebook notebook2 = new Notebook("DELL", 67890, "silver", 950, 16, "Windows", 125000);
        Notebook notebook3 = new Notebook("HP", 13570, "silver", 750, 8, "Windows", 100000);

        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);

        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        List<Notebook> filtered = new ArrayList<>();
        if (params.isEmpty()) {
            return notebooks;
        }
        for (Notebook notebook : notebooks){
            int flag = 0;
            for (String key: params.keySet()){
                if (key == "brand"){
                    if (notebook.getBrand() == params.get(key)){
                        flag++;
                    }
                } else if (key == "model"){
                    if (String.valueOf(notebook.getModel()).equals(params.get(key))){
                        flag++;
                    }
                } else if (key == "color"){
                    if (notebook.getColor() == params.get(key)){
                        flag++;
                    }
                } else if (key == "HardDiskSize"){
                    if (String.valueOf(notebook.getHardDiskSize()).equals(params.get(key))){
                        flag++;
                    }
                } else if (key == "RAM"){
                    if (String.valueOf(notebook.getRAM()).equals(params.get(key))){
                        flag++;
                    }
                } else if (key == "OS"){
                    if (notebook.getOS() == params.get(key)){
                        flag++;
                    }
                }  else if (key == "price"){
                    if (String.valueOf(notebook.getPrice()).equals(params.get(key))){
                        flag++;
                    }
                }
            }
            if (flag == params.size()){
                filtered.add(notebook);
            }
        }
        return filtered;
    }
}
