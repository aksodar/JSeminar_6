package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.Arrays;
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
        Homework hw = new Homework();
        Map<String, String> filteringСriteria = new HashMap<>();
        filteringСriteria.put("disgonal", "16");
        filteringСriteria.put("operatingSystem",  "Windows");
        filteringСriteria.put("condition", "g" );
        List<Notebook> list = hw.initListNotebooks();
        System.out.println(String.valueOf(hw.filter(filteringСriteria, list)));

    }

    public List<Notebook> initListNotebooks(){
        List<Notebook> listNotebooks = new ArrayList<Notebook>( 
            Arrays.asList(
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Windows", 50000.00, 'g'),
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Windows", 50000.00, 'b'),
            new Notebook(18, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Linux", 50000.00, 'g'),
            new Notebook(16, "Intel", "Palit nVidia GeForce RTX 4090 GameRock OmniBlack 24576Mb","E5-4617" , "Western Digital WD Black 500 ГБ WD5000LPSX", "Linux", 50000.00, 'b')));

        return listNotebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        List<Notebook> result = new ArrayList<Notebook>();
        for (Notebook notebook : notebooks) {
           if (notebook.getCondition() == params.get("condition").charAt(0) && notebook.getDiagonal() == Integer.parseInt(params.get("disgonal")) && notebook.getOperatingSystem() == params.get("operatingSystem")){
              result.add(notebook);
           }
            
        }

        return result;
    }

}
