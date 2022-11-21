package ru.gb.jseminar;

import ru.gb.jseminar.data.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

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
    public static void main(String[] args) {
        Homework hw = new Homework();
        Map<String, String> map = new HashMap<>();
        map.put("BRAND", "Msi");
        map.put("RAM", "16");
        map.put("HDD", "512");
        map.put("OS", "Windows");
        map.put("COLOR", "White");
        List<Notebook> notebooks = hw.initListNotebooks(100);
        notebooks.forEach((notebook) -> System.out.println(notebook.getListOfValues()));
        System.out.println("\nFiltered:\n");
        List<Notebook> filtered = hw.filter(map, notebooks);
        filtered.forEach((notebook) -> System.out.println(notebook.toString(",")));
    }

    public List<Notebook> initListNotebooks(int size) {
        List<Notebook> notebooks = new ArrayList<>();
        List<String> names = new ArrayList<>(Arrays.asList("Asus", "Hp", "Msi", "Dell", "Acer", "Dexp", "Honor"));
        List<Integer> ramList = new ArrayList<>(Arrays.asList(4, 8, 16, 32));
        List<Integer> hddList = new ArrayList<>(Arrays.asList(256, 512, 1024, 2048));
        List<String> osList = new ArrayList<>(Arrays.asList("Windows", "Linux", "MacOs"));
        List<String> colors = new ArrayList<>(Arrays.asList("Black", "White", "Gray", "Silver", "Gold"));
        Random random = new Random();
        while (notebooks.size() < size) {
            Notebook notebook = new Notebook(names.get(random.nextInt(names.size())));
            notebook.setRam(ramList.get(random.nextInt(ramList.size())));
            notebook.setHdd(hddList.get(random.nextInt(hddList.size())));
            notebook.setOs(osList.get(random.nextInt(osList.size())));
            notebook.setColor(colors.get(random.nextInt(colors.size())));
            notebooks.add(notebook);
        }

        return notebooks;
    }

    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        if (notebooks.isEmpty()) {
            throw new IllegalStateException("_");
        }
        if (params.isEmpty()) {
            return notebooks;
        }
        List<Notebook> result = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            int flag = 0;
            for (String key : params.keySet()) {
                if (key == "BRAND") {
                    if (params.get(key).equals(notebook.getBrand())) {
                        flag++;
                    }
                }
                if (key == "RAM") {
                    if (params.get(key).equals(String.valueOf(notebook.getRam()))) {
                        flag++;
                    }
                }
                if (key == "HDD") {
                    if (params.get(key).equals(String.valueOf(notebook.getHdd()))) {
                        flag++;
                    }
                }
                if (key == "OS") {
                    if (params.get(key).equals(notebook.getOs())) {
                        flag++;
                    }
                }
                if (key == "COLOR") {
                    if (params.get(key).equals(notebook.getColor())) {
                        flag++;
                    }
                }
            }
            if (flag == params.size()) {
                result.add(notebook);
            }
        }
        return result;
    }

}
