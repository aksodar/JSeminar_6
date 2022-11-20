package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить
    // поля и методы. Реализовать в java.
    // 2) Создать множество ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации
    // и выведет
    // ноутбуки, отвечающие фильтру.
    // Пример: 1 - ОЗУ, 2 - Объем ЖД, 3 - Операционная система, 4 - Цвет
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие
    // по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();

        List<Notebook> notebooks = hw.filter(hw.createNotebook(), hw.initListNotebooks());
        Logger log = Logger.getLogger(Homework.class.getName());
        for (Notebook notebook : notebooks) {
            log.info(notebook.toString());
        }

    }

    public Map<String, String> createNotebook() {

        Map<String, String> searchInfo = new HashMap<>();
        searchInfo.put("RAM", "8");
        searchInfo.put("SSD", "256");
        searchInfo.put("OS", "Windows");
        searchInfo.put("Graphic Card", "Intel");

        return searchInfo;

    }

    public List<Notebook> initListNotebooks() {
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("MSI", 8, 126, "Linux", "Intel", 600));
        notebooks.add(new Notebook("Huawei", 8, 256, "Windows", "Intel", 700));
        notebooks.add(new Notebook("Xiaomi", 8, 256, "Linux", "NVidia", 1900));
        notebooks.add(new Notebook("Asus", 8, 512, "Windows", "AMD", 750));
        notebooks.add(new Notebook("Intel", 8, 256, "Windows", "Intel", 850));
        // System.out.println(notebooks);
        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        List<Notebook> filter = new ArrayList<>();
        // System.out.println(notebooks);
        // System.out.println(params);

        for (Notebook notebook : notebooks) {
            Map<String, String> notebookFeatures = notebook.mainFeatures();
            // System.out.println(notebookFeatures);
            boolean flag = true;

            for (String features : params.keySet()) {
                if (notebookFeatures.containsKey(features)) {
                    if (!params.get(features).equals(notebookFeatures.get(features))) {
                        flag = false;
                        break;
                    }
                } else {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                filter.add(notebook);
            }
        }
        // System.out.println(notebooksFiltered);

        return filter;
    }

}
