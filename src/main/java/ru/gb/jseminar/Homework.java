package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать множество ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework homework = new Homework();

        Map<String, String> filterMap = new HashMap<>();
        filterMap.put("RAM", "16");
        filterMap.put("SSD", "1024");
        filterMap.put("size", "15");
        filterMap.put("color", "black");

        homework.printNotebookList(homework.filter(filterMap, homework.initListNotebooks()));
    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("Acer", 8, 512, "Ubuntu", 15, "black", 60000));
        notebooks.add(new Notebook("Asus", 16, 1024, "Windows", 15, "black", 100000));
        notebooks.add(new Notebook("Lenovo", 16, 1024, "Windows", 15, "black", 95000));
        notebooks.add(new Notebook("MSI", 16, 1024, "Windows", 14, "white", 90000));
        notebooks.add(new Notebook("HP", 16, 1024, "Windows", 15, "black", 110000));
        return notebooks;
    }

    public List<Notebook> filter (Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> notebooksFiltered = new ArrayList<>();

        for (Notebook notebook : notebooks) {
            Map<String, String> notebookParams = notebook.getAllParams();
            boolean flag = true;

            for (String param : params.keySet()) {
                if (notebookParams.containsKey(param)) {
                    if (!params.get(param).equals(notebookParams.get(param))) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                notebooksFiltered.add(notebook);
            }
        }

        return notebooksFiltered;
    }

    public void printNotebookList (List<Notebook> notebooks) {
        Logger log = Logger.getLogger(Homework.class.getName());
        for (Notebook notebook : notebooks) {
            log.info(notebook.toString());
        }
    }
}
