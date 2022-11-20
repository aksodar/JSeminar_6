package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
public class Homework {  
   

    public static void main(String[] args) {
        Homework hm = new Homework();
        List<Notebook> notebooks = hm.initListNotebooks();
        // System.out.println(notebooks);
        Map<String, String> params = new HashMap<>();
        params.put("model", "ASUS");
        params.put("color", "Black");
        List<Notebook> filterNote=hm.filter(params, notebooks);
        hm.printResultList(filterNote);
        
        
        

    }

    public List<Notebook> initListNotebooks(){
        Notebook n1 = new Notebook("Lenovo", 18, "Nvidia", "Toshiba HDWL120", "Black", "Windows");
        Notebook n2 = new Notebook("Acer", 16, "AMD", "Toshiba HDWL120", "White", "Windows");
        Notebook n3 = new Notebook("HP", 14, "Nvidia", "Toshiba HDWL120", "Black", "Windows");
        Notebook n4 = new Notebook("ASUS", 16, "GTX", "Toshiba HDWL120", "Black", "Windows");        
        List <Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("ASUS", 18, "GTX", "HP", "Black", "IOS"));
        notebooks.add(n1);
        notebooks.add(n2);
        notebooks.add(n3);
        notebooks.add(n4);
        return notebooks;
    }    

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        List<Notebook> resultNout = new ArrayList<>();
        int count = 0;        
        for (Notebook note : notebooks) {
            // System.out.println(note);
            for (String par: params.keySet()){
                String item = params.get(par);
                // String temp = nout.Dict(par);
                // System.out.println(temp);               
                if(item.equals(note.getModel())){
                    count++;                    
                }
                if(item.equals(note.getDiagonal())){
                    count++;                    
                }
                if(item.equals(note.getVideoCard())){
                    count++;                    
                }
                if(item.equals(note.getHardDrive())){
                    count++;                    
                }
                if(item.equals(note.getColor())){
                    count++;                    
                }
                if(item.equals(note.getOperatingSystem())){
                    count++;                    
                }
            }            
            if (count == params.size()){
                resultNout.add(note);
                count=0;
            }
        }  
        return resultNout;
    }

    public void printResultList(List<Notebook> resultNout){
        for (Notebook element : resultNout) {
            System.out.println(element);            
        }
    }

}
