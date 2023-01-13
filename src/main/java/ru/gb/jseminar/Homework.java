package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.*;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();
        System.out.println(hw.initListNotebooks());
        ArrayList hw1 = new ArrayList(hw.initListNotebooks());

        System.out.println("Результат фильтра \n" + hw.filter(searchFiltre(), hw1).toString());
    }

    public ArrayList<String> initListNotebooks() {
        Notebook Notebook1 = new Notebook("asus", "Zenbook Pro 14 OLED", 2000, 16, "Windows 11", "grey",
                75000);
        Notebook Notebook2 = new Notebook("lenovo", "V 14", 1000, 16, "Windows 11", "grey",
                50000);
        Notebook Notebook3 = new Notebook("dell", "240 G7 HP Laptop", 256, 8, "Windows 11", "Black",
                40000);
        Notebook Notebook4 = new Notebook("apple", "MacBook Air", 2000, 16, "MacOS", "white",
                110000);
        ArrayList listNotebook = new ArrayList();
        listNotebook.add(Notebook1);
        listNotebook.add(Notebook2);
        listNotebook.add(Notebook3);
        listNotebook.add(Notebook4);

        return listNotebook;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) throws IllegalStateException {
        ArrayList listfilter = new ArrayList();
        for (Notebook item : notebooks) {
            int count = 0;
            for (String param : params.keySet()) {
                if (item.paramNotebook().containsValue(params.get(param))) {
                    count++;
                }
            }
            if (count == params.keySet().size()) {
                listfilter.add(item);
            }
        }
        if (!listfilter.isEmpty()) {
            return listfilter;
        }
        throw new IllegalStateException("No notebook");
    }

    public static Map<String, String> searchFiltre() {
        Map<String, String> searchKeys = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String keyfield = "";
        String val = "";
        System.out.println("input num for filter: \n"
                + "1  RAM\n"
                + "2 SSD\n"
                + "3 OS\n"
                + "4 COLOR\n");
        int field = sc.nextInt();
        if (field == 1) {
            keyfield = "ramSize";
            System.out.println("input num value: \n"
                    + "1 - 16Gb \n"
                    + "2 - 8Gb");
            int value = sc.nextInt();
            if (value == 1) {
                val = "16";
            } else {
                val = "8";
            }

        }
        if (field == 2) {
            keyfield = "ssdSize";
            System.out.println("input num value: \n"
                    + "1 - 2000Gb \n"
                    + "2 - 1000Gb\n" +
                    "3 - 256Gb");
            int value = sc.nextInt();
            if (value == 1) {
                val = "2000";
            } else if (value == 2) {
                val = "1000";
            } else {
                val = "256";
            }
        }
        if (field == 3) {
            keyfield = "os";
            System.out.println("input num value: \n"
                    + "1 - W \n"
                    + "2 - M");
            int value = sc.nextInt();
            if (value == 1) {
                val = "Windows 11";
            } else {
                val = "MacOS";
            }
        }
        if (field == 4) {
            keyfield = "color";
            System.out.println("input num value: \n"
                    + "1 - grey \n"
                    + "2 - black");
            int value = sc.nextInt();
            if (value == 1) {
                val = "grey";
            } else {
                val = "Black";
            }
        }
        searchKeys.put(keyfield, val);
        return searchKeys;
    }
}


