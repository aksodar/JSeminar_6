package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.*;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();
        List<Notebook> notebooksBase = hw.initListNotebooks();
        Map<String, String> params = new HashMap<>();
        params.put("OS", "Windows");
        params.put("color", "silver");
        params.put("brand", "Acer");

        System.out.println(hw.filter(params, notebooksBase));

    }


    public List<Notebook> initListNotebooks(){
        Notebook notebook1 = new Notebook("Asus", 112356, "black", 1000, 4, "Windows", 150000);
        Notebook notebook2 = new Notebook("Acer", 00236, "silver", 100, 16, "Windows", 125000);
        Notebook notebook3 = new Notebook("HP", 11350, "silver", 500, 8, "Windows", 100000);

        List<Notebook> notebooks = new ArrayList<>(Arrays.asList(notebook1, notebook2, notebook3));

        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
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
            if (!filtered.isEmpty()){
                return filtered;
            }

        }throw new IllegalStateException("product not found");

    }

}
