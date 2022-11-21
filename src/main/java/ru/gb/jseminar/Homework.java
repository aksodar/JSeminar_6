package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

// import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();
        Logger log = Logger.getLogger(Homework.class.getName());

        Notebook nb1 = new Notebook(1, "Lenovo", "Yoga", "Windows 10", 4, "Silver", "SSD", "512 GB", 62000.00, false);
        Notebook nb2 = new Notebook(2, "HP", "15-dw", "Windows 10", 8, "Black", "HHD", "1 TB", 70000.00, false);
        Notebook nb3 = new Notebook(3, "MacBook", "MC1234", "MacOS", 16, "White", "SSD", "1 TB", 205000.00, false);
        Notebook nb4 = new Notebook(4, "Acer", "Nitro5", "Windows 11", 16, "Black", "SSD", "1 TB", 219999.00, true);
        Notebook nb5 = new Notebook(5, "HP", "Victus", "Windows 11", 16, "Black", "SSD", "1 TB", 139999.00, true);
        Map<String,String> params = new HashMap<>();
        params.put("valueRAM", "16");
        params.put("color", "Black");

        List<Notebook> nbList = hw.initListNotebooks(nb1, nb2, nb3, nb4, nb5);
        List<Notebook> nbFilter = hw.filter(params, nbList);
        for(Notebook nbF: nbFilter) log.info(String.valueOf(nbF));

    }
    public List<Notebook> initListNotebooks(Object o1, Object o2, Object o3, Object o4, Object o5){
        var nb1 = (Notebook) o1;
        var nb2 = (Notebook) o2;
        var nb3 = (Notebook) o3;
        var nb4 = (Notebook) o4;
        var nb5 = (Notebook) o5;
        List<Notebook> notebooksList = new ArrayList<>(Arrays.asList(nb1, nb2, nb3, nb4, nb5));
        return notebooksList;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        List <Notebook> finalList = new ArrayList<>();
        for(Notebook nb: notebooks) {
            int count = 0;
            String str = String.valueOf(nb);
            for(String key: params.keySet()) {
                if(str.indexOf(params.get(key)) != -1) {
                    count++;
                }
            }
            if(count == params.size()) {
                finalList.add(nb);
            } 
            count = 0;
        }
        return finalList;
    }

}
