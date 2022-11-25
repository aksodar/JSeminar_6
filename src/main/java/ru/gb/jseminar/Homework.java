package ru.gb.jseminar;
import ru.gb.jseminar.data.Notebook;
import java.util.List;
import java.util.Map;
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

        List<Notebook> lstNb = hw.initListNotebooks();
        String listNbStr = lstNb.toString();
        System.out.println("Всего в продаже:");
        System.out.println(listNbStr.replaceAll("^.|.$", ""));

        Map<String, String> searchKeys = new HashMap<>();
        searchKeys.put("os", "Windows");
        System.out.println();
        System.out.println("Подходят под выбранные критерии:");
        System.out.println(hw.filter(searchKeys, lstNb).toString().replaceAll("^.|.$", ""));
// я так и не понял как убрать эти квадратные скобки в выводе списка...
    }

    public List<Notebook> initListNotebooks() {
        Notebook nb1 = new Notebook("Asus TUF Gaming FX506LB", "Windows", 8, 512, "Intel Core i5 10300H", 15.6, "black", 68669);
        Notebook nb2 = new Notebook("Apple MacBook Air 13", "MacOS", 8, 256, "Apple M1", 13.3, "gray", 72280);
        Notebook nb3 = new Notebook("Lenovo IdeaPad 317ADA05", "no OS", 8, 256, "AMD Athlon Gold 3150U", 17.3, "gray", 35999);
        Notebook nb4 = new Notebook("HIPER Workbook A1568K1135WI", "Windows", 8, 512, "Intel Core i5 1135G7", 15.6, "black", 42489);
        List<Notebook> lstNb = new LinkedList<>();
        lstNb.add(nb1);
        lstNb.add(nb2);
        lstNb.add(nb3);
        lstNb.add(nb4);
        return lstNb;
    }

    public List<Notebook> filter(Map<String, String> searchParameters, List<Notebook> notebooks) {
        List<Notebook> result = new ArrayList<>();
        for (Notebook notebook : notebooks) {
            int count = 0;
            for (String param : searchParameters.keySet()) {
                if (notebook.mapNotebook().containsValue(searchParameters.get(param))) {
                    count++;

                }
            }
            if (count == searchParameters.keySet().size()) {
                result.add(notebook);
            }
        }
        if (!result.isEmpty()) {
            return result;
        }
        throw new IllegalStateException("Ни один из компьютеров не подпадает под выбранные критерии!");
    }
}