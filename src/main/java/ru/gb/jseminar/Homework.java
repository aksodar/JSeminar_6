package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Arrays;
import java.util.HashMap;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {

        //Создаём объекты класса Ноутбук
        Notebook nb1 = new Notebook("XP", 4000, 8000, "red");
        Notebook nb2 = new Notebook("Ubuntu", 5000, 4000, "black");
        Notebook nb3 = new Notebook("Mint", 3000, 4000, "white");
        Notebook nb4 = new Notebook("Kali", 4500, 16000, "green");

        //Создаём объект класса Homework
        Homework hw = new Homework();

        //Вызываем метод для формирования списка ноутбуков
        List<Notebook> actualNotebook = hw.initListNotebooks(nb1, nb2, nb3, nb4);

        //Создаём мапу с параметрами фильтрации для ноутбуков
        Map<String, String> propertys = new HashMap<String, String>();
        propertys.put("OS", "Kali");
        propertys.put("CPU", "4000");
        propertys.put("RAM", "8000");
        propertys.put("COLOR", "red");
        
        //Применяем метод фильтрации ноутбуков
        List<Notebook> gNotebooks = hw.filter(propertys, actualNotebook);
        System.out.println("Ноутбуки прошедшие фильтр:");
        for (Notebook notebook: gNotebooks) {
            System.out.println(String.format("%s %s %s %s", notebook.getOs(), notebook.getCpu(), notebook.getRam(), notebook.getColor()));
        } 

    }

    //Метод формирования списка ноутбуков
    public List<Notebook> initListNotebooks(Notebook ... v){
        //Помещаем объекты класса ноутбук в лист
        List <Notebook> noteBookList = new ArrayList<Notebook>(Arrays.asList(v));
        return noteBookList;
    }

    //Метод фильтрации ноутбуков, если есть хотябы одно совпадение.
    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks){
        List<Notebook> filteredNotebooks = new ArrayList<Notebook>();
        for (Notebook noteBook: notebooks){
            for (String item: params.keySet()){
                if (params.get(item).equals(noteBook.getOs()) || 
                    params.get(item).equals(noteBook.getCpu().toString()) ||
                    params.get(item).equals(noteBook.getRam().toString()) ||
                    params.get(item).equals(noteBook.getColor())){
                    filteredNotebooks.add(noteBook);
                    break;
                }
            }
        }
        return filteredNotebooks;
    }

}
