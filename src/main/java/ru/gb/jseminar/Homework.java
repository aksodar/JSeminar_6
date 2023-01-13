package ru.gb.jseminar;
import ru.gb.jseminar.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;
import java.util.stream.Collectors;

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
        List<Notebook> nbs = initListNotebooks();
        Map<String, String> filters = getFilter();
        List<Notebook> filterNotebooks = filtered(filters, nbs);

        System.out.println("\n\nCписок ноутбуков, c фильтрацией:");
        for (Notebook nb : filterNotebooks) {
            System.out.printf("\nНоутбук: %s %s\nЦена: %s\n\nХАРАКТЕРИСТИКИ:\nПроцессор: %s\nВидеокарта: %s\nОперативная память: %s\nHDD: %s\nSSD: %s\n=========================\n", 
            nb.brand, 
            nb.model, 
            nb.price,
            nb.processor,nb.graphicCard,nb.ram,nb.hdd,nb.ssd);
        }
    }

    public static Map<String, String> getFilter() {
        Map<String, String> filters = new HashMap<String, String>();
        Map<String, String> filterParams = new HashMap<String, String>();

        filterParams.put("Бренд", "brand");
        filterParams.put("Модель", "model");
        filterParams.put("Категория", "category");
        filterParams.put("Цена", "price");
        filterParams.put("Процессор", "processor");
        filterParams.put("Видеокарта", "graphicCard");
        filterParams.put("Оперативная память", "ram");
        filterParams.put("Диск HDD", "hdd");
        filterParams.put("Диск SSD", "ssd");
        filterParams.put("ОС", "os");
        filterParams.put("Размер экрана", "displaySize");
        filterParams.put("Вес", "weight");
        filterParams.put("Цвет", "colour");

        System.out.println("Значения фильтрации для списка.");
        try (Scanner in = new Scanner(System.in)) {
            for (Entry<String, String> param : filterParams.entrySet()) {
                System.out.printf("Ввведите значение фильтра %s:", param.getKey());
                filters.put(param.getValue(), in.nextLine());
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        return filters;
    }

    public static List<Notebook> initListNotebooks() {
        ArrayList<Notebook> notebooks = new ArrayList<Notebook>();
        notebooks.add(new Notebook("MSI", "GF", "gamer", 90000.0, "Intel core i5", "GEFORCE RTX3080", 32, 3000, 200,
                "Windows 10", 14.0, 1.8, "black"));
        notebooks.add(new Notebook("MSI", "GE", "gamer", 120000.0, "Intel core i7", "GEFORCE RTX4080Ti", 64, 4000, 1000,
                "Windows 11", 17.0, 3.0, "black"));
        notebooks.add(new Notebook("MSI", "Katana", "gamer", 100000.0, "Intel core i7", "GEFORCE RTX4080", 16, 2000,
                500, "Windows 11", 14.0, 2.0, "black/silver"));

        return notebooks;
    }

    public static Boolean getStringFilter(String value, String nb) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        return nb.toLowerCase().contains(value.toLowerCase());
    }

    public static Boolean getDoubleFilter(String value, Double nb) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        Double doubleValue = 0.0;

        try {
            doubleValue = Double.parseDouble(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return nb <= doubleValue;
    }

    public static Boolean getIntFilter(String value, Integer nb) {
        if (value == null || value.isEmpty()) {
            return false;
        }
        Integer intValue = 0;

        try {
            intValue = Integer.parseInt(value);
        } catch (NumberFormatException e) {
            return false;
        }
        return nb <= intValue;
    }

    public static int checkFilter(Map<String, String> filters) {
        int filterCount = 0;

        for (Entry<String, String> filter : filters.entrySet()) {
            if (!filter.getValue().isEmpty())
                filterCount++;
        }
        return filterCount;
    }

    public static List<Notebook> filtered(Map<String, String> params, List<Notebook> notebooks) {

        Integer filterCount = checkFilter(params);

        if (filterCount == 0)
            return notebooks;

        List<Notebook> filterNotebooks = notebooks.stream().filter(nb -> {
            ArrayList<Boolean> acceptedFilter = new ArrayList<Boolean>();
            for (Entry<String, String> param : params.entrySet()) {
                switch (param.getKey()) {
                    case "brand":
                        acceptedFilter.add(getStringFilter(param.getValue(), nb.brand));
                        break;
                    case "model":
                        acceptedFilter.add(getStringFilter(param.getValue(), nb.model));
                        break;
                    case "category":
                        acceptedFilter.add(getStringFilter(param.getValue(), nb.category));
                        break;
                    case "price":
                        acceptedFilter.add(getDoubleFilter(param.getValue(), nb.price));
                        break;
                    case "processor":
                        acceptedFilter.add(getStringFilter(param.getValue(), nb.processor));
                        break;
                    case "graphicCard":
                        acceptedFilter.add(getStringFilter(param.getValue(), nb.graphicCard));
                        break;
                    case "ram":
                        acceptedFilter.add(getIntFilter(param.getValue(), nb.ram));
                        break;
                    case "hdd":
                        acceptedFilter.add(getIntFilter(param.getValue(), nb.hdd));
                        break;
                    case "ssd":
                        acceptedFilter.add(getIntFilter(param.getValue(), nb.ssd));
                        break;
                    case "os":
                        acceptedFilter.add(getStringFilter(param.getValue(), nb.os));
                        break;
                    case "displaySize":
                        acceptedFilter.add(getDoubleFilter(param.getValue(), nb.displaySize));
                        break;
                    case "weight":
                        acceptedFilter.add(getDoubleFilter(param.getValue(), nb.weight));
                        break;
                    case "colour":
                        acceptedFilter.add(getStringFilter(param.getValue(), nb.colour));
                        break;
                    default:
                        break;
                }
            }
            acceptedFilter.removeIf(n -> (!n));
            return acceptedFilter.size() == filterCount;
        }).collect(Collectors.toList());

        return filterNotebooks;
    }

}
