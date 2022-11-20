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
    //      Пример: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework homework=new Homework();
        List<Notebook>n1=homework.createNotebook();
        List<Notebook>n2=new ArrayList<>();
        Map<String,String>map=new HashMap<>();
        map.put("capacityHD","500");
        map.put("ram","8");                       //вводим критерии фильтрации
        map.put("os","windows");
        System.out.println(homework.filter(map,n1));
    }

    public List<Notebook> createNotebook(){
        List<Notebook>noutbooks= new ArrayList<>();
        Notebook notebook1= new Notebook("8", "500","windows","black");
        noutbooks.add(notebook1);
        Notebook notebook2= new Notebook("8", "1000","MacOs","white");
        noutbooks.add(notebook2);
        Notebook notebook3= new Notebook("16", "500","linux","black");
        noutbooks.add(notebook3);
        Notebook notebook4= new Notebook("2", "1000","windows","blue");
        noutbooks.add(notebook4);
        Notebook notebook5= new Notebook("1", "500","MacOs","yellow");
        noutbooks.add(notebook5);
        Notebook notebook6= new Notebook("8", "500","windows","black");
        noutbooks.add(notebook6);
        Notebook notebook7= new Notebook("8", "216","MacOs","red");
        noutbooks.add(notebook7);
        Notebook notebook8= new Notebook("4", "1000","linux","white");
        noutbooks.add(notebook8);
        Notebook notebook9= new Notebook("16", "2000","windows","blue");
        noutbooks.add(notebook9);
        Notebook notebook10= new Notebook("8", "500","MacOs","green");
        noutbooks.add(notebook10);
        return noutbooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        List<Notebook>sort = new ArrayList<>();
        List<Notebook>sort2 = new ArrayList<>();
        int count=0;
        if (notebooks.isEmpty()){
            throw new IllegalStateException("Список пуст");
        }else {
            for (String item: params.keySet() ) {
                String value = params.get(item);
                if (count>=1){
                    boolean ramBool=false;
                    boolean colorBool=false;
                    boolean capacityHDBool=false;
                    boolean osBool=false;
                    for (Notebook item2:sort) {
                        if (item=="ram"){
                            if (value==item2.getRam()){
                                ramBool=true;
                            }
                        }
                        if (item=="color"){
                            if (value==item2.getColor()){
                                colorBool=true;
                            }
                        }
                        if (item=="capacityHD"){
                            if (value==item2.getCapacityHD()){
                                capacityHDBool=true;
                            }
                        }
                        if (item=="os"){
                            if (value==item2.getOs()){
                                osBool=true;
                            }
                        }
                        if (ramBool||colorBool||capacityHDBool||osBool){

                        }else{
                            sort2.add(item2);
                        }
                        ramBool=false;
                        colorBool=false;
                        capacityHDBool=false;
                        osBool=false;
                    }
                }else {
                    for (Notebook item1:notebooks) {
                        if(item=="ram"){
                            if(value==item1.getRam()){
                                sort.add(item1);
                            }
                        }
                        if (item=="color"){
                            if(value==item1.getColor()){
                                sort.add(item1);
                            }
                        }
                        if (item=="capacityHD"){
                            if(value==item1.getCapacityHD()){
                                sort.add(item1);
                            }
                        }
                        if (item=="os"){
                            if(value==item1.getOs()){
                                sort.add(item1);
                            }
                        }
                    }
                }
                count++;
            }
            for (Notebook item:sort2) {
                sort.remove(item);
            }
        }
        return sort;
    }
}
