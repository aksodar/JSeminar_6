package ru.gb.jseminar;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Homework {


    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework homework = new Homework();
        List <Notebook> notebooks = homework.initListNotebooks();
        Map<String,String> params = new HashMap<>();
        System.out.println(homework.filter(params, notebooks));
    }

    public List<Notebook> initListNotebooks(){
        Notebook nb1 = new Notebook("Acer", 793, 225000, "black", "Windows", 256, 40);
        Notebook nb2 = new Notebook("Asus", 882, 100000, "black", "Windows", 512,80);
        Notebook nb3 = new Notebook("Samsung", 881, 150000, "black", "Windows", 256, 40);
        Notebook nb4 = new Notebook("Apple", 100, 300000, "silver", "Mac OC", 512,80);
        Notebook nb5 = new Notebook("Apple", 200, 225000, "red", "Mac OC", 256, 40);
        Notebook nb6 = new Notebook("Acer", 882, 100000, "black", "Windows", 512,80);
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(nb1);
        notebooks.add(nb2);
        notebooks.add(nb3);
        notebooks.add(nb4);
        notebooks.add(nb5);
        notebooks.add(nb6);
    return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        params.put("ozu", "256");
        params.put("valueZhD", "40");
        params.put("operatingSystem", "Windows");
        params.put("color", "black");
        List<Notebook> filter = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            int count = 0;
            for (String key : params.keySet()) {
                if (key.equals("name")) {
                    if (params.get(key).equalsIgnoreCase(notebook.getName())) {
                        count = count +1;
                    }
                }
                if (Objects.equals(key, "model")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(notebook.getModel()))) {
                        count = count + 1;
                    }
                }
                if (key.equals("operatingSystem")) {
                    if (params.get(key).equalsIgnoreCase(notebook.getOperatingSystem())) {
                        count = count +1;
                    }
                }  
                
                if (key.equals("color")) {
                    if (params.get(key).equalsIgnoreCase(notebook.getColor())) {
                        count = count +1;
                    }
                } 
                
                if (Objects.equals(key, "ozu")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(notebook.getOzu()))) {
                        count = count + 1;
                    }
                }
                if (Objects.equals(key, "valueZhD")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(notebook.getValueZhD()))) {
                        count = count + 1;
                    }
                }
                if (Objects.equals(key, "price")) {
                    if (params.get(key).equalsIgnoreCase(String.valueOf(notebook.getPrice()))) {
                        count = count + 1;
                    }
                }
                if (count == params.size()) {
                    filter.add(notebook);
                }  
            }
            
        }
        return filter;
    }

}
