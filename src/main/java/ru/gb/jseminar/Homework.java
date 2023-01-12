package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить
    // поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации
    // и выведет
    // ноутбуки, отвечающие фильтру.
    // Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение,
    // Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие
    // по условиям.

    public static void main(String[] args) throws Exception {
        Homework hw = new Homework();
        List<Notebook> notebookList = hw.initListNotebooks();
        Map<String, String> filter1 = new HashMap<>();
        filter1.put("color", "silver");
        System.out.println(hw.filter(filter1, notebookList));
    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> noteList = new ArrayList<>();
        noteList.add(new Notebook("Intel Core i5", "black", 15.6, 4, 500, 56944.99));
        noteList.add(new Notebook("Intel Core i7", "silver", 15.4, 4, 500, 92999.99));
        noteList.add(new Notebook("Intel Core i7", "pink", 17.3, 4, 500, 49999.99));
        noteList.add(new Notebook("Intel Core i5", "silver", 17.0, 4, 500, 97599.99));
        noteList.add(new Notebook("Intel Core i7", "black", 15.6, 16, 512, 79645.99));
        noteList.add(new Notebook("Intel Core i7", "silver", 14.0, 8, 256, 39700.00));
        noteList.add(new Notebook("AMD A9", "black", 11.6, 4, 64, 15399.99));
        noteList.add(new Notebook("Intel Core i3", "black", 14.0, 4, 128, 18500.00));
        noteList.add(new Notebook("Intel Core i3", "black", 13.4, 4, 256, 25000.00));
        return noteList;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) throws Exception {
        if (notebooks == null || params == null) {
            throw new Exception("Входные данные пустые");
        }
        List<Notebook> filteredList = new ArrayList<>();
        for (Map.Entry<String, String> element : params.entrySet()) {
            String key = element.getKey();
            String methodName = "get" + key.substring(0, 1).toUpperCase() + key.toLowerCase().substring(1);
            String value = element.getValue();

            for (Notebook note : notebooks) {
                // получаем метод по его названию-строке
                Method method = note.getClass().getMethod(methodName, null);
                if (method.invoke(note, null).equals(value)) {
                    filteredList.add(note);
                }
            }
        }

        return filteredList;
    }

}
