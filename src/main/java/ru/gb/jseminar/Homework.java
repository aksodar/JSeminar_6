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
        filter1.put("processor", "Intel Core i7");
        filter1.put("color", "silver");

        Map<String, String> filter2 = new HashMap<>();
        filter2.put("hard", "500");
        filter2.put("software", "Windows 10");

        Map<String, String> filter3 = new HashMap<>();
        filter3.put("price", "70000.00");
        filter3.put("screen", "15.6");

        Map<String, String> filter4 = new HashMap<>();
        filter4.put("price", "70000.00");
        filter4.put("software", "Linux");

        Map<String, String> filter5 = new HashMap<>();
        filter5.put("memory", "8");
        filter5.put("hard", "500");

        System.out.println("========================\n=====Первый фильтр:=====\n========================");
        System.out.println(hw.filter(filter1, notebookList));
        System.out.println("========================\n=====Второй фильтр:=====\n========================");
        System.out.println(hw.filter(filter2, notebookList));
        System.out.println("========================\n=====Третий фильтр:=====\n========================");
        System.out.println(hw.filter(filter3, notebookList));
        System.out.println("========================\n=====Четвертый фильтр:=====\n========================");
        System.out.println(hw.filter(filter4, notebookList));
        System.out.println("========================\n=====Пятый фильтр:=====\n========================");
        System.out.println(hw.filter(filter5, notebookList));
    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> noteList = new ArrayList<>();
        noteList.add(new Notebook("Intel Core i5", "black", "Windows 10", 15.6, 4, 500, 56944.99));
        noteList.add(new Notebook("Intel Core i7", "silver", "iLife", 15.4, 4, 500, 92999.99));
        noteList.add(new Notebook("Intel Core i7", "pink", "Windows 10", 17.3, 4, 500, 49999.99));
        noteList.add(new Notebook("Intel Core i5", "silver", "iLife", 17.0, 4, 500, 97599.99));
        noteList.add(new Notebook("Intel Core i7", "black", "Linux", 15.6, 16, 500, 79645.99));
        noteList.add(new Notebook("Intel Core i7", "silver", "Windows 10", 14.0, 8, 256, 39700.00));
        noteList.add(new Notebook("AMD A9", "black", "Linux", 11.6, 4, 64, 15399.99));
        noteList.add(new Notebook("Intel Core i3", "black", "Linux", 14.0, 4, 128, 18500.00));
        noteList.add(new Notebook("Intel Core i3", "black", "Windows 10", 13.4, 4, 256, 25000.00));
        return noteList;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) throws Exception {
        if (notebooks == null || params == null) {
            throw new Exception("Входные данные пустые");
        }

        for (Map.Entry<String, String> element : params.entrySet()) {
            String key = element.getKey();
            String methodName = "get" + key.substring(0, 1).toUpperCase() + key.toLowerCase().substring(1);
            String value = element.getValue();
            List<Notebook> filteredList = new ArrayList<>();
            for (Notebook note : notebooks) {
                try {
                    // получаем метод по его названию-строке
                    Method method = note.getClass().getMethod(methodName, null);
                    // вызываем полученный метод
                    Object result = method.invoke(note, null);

                    if (key.toLowerCase().equals("price") || key.toLowerCase().equals("screen")) {
                        Double param = Double.parseDouble(value);
                        if ((double) result >= param) {
                            filteredList.add(note);
                        }
                    } else if (key.toLowerCase().equals("memory") || key.toLowerCase().equals("hard")) {
                        Integer param = Integer.parseInt(value);
                        if ((int) result >= param) {
                            filteredList.add(note);
                        }
                    } else if (result.equals(value)) {
                        filteredList.add(note);
                    }
                } catch (Exception e) {
                    System.out.println("Невозможно отфильтровать по заданному критерию");
                }

            }
            notebooks = filteredList;
            if (notebooks.size() == 0) {
                return notebooks;
            }
        }

        return notebooks;
    }

}
