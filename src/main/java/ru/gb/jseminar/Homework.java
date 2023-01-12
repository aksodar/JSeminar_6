package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;
import ru.gb.jseminar.data.RamFilter;
import ru.gb.jseminar.data.ColorFilter;
import ru.gb.jseminar.data.Filter;
import ru.gb.jseminar.data.DiskCapacityFilter;
import ru.gb.jseminar.data.OsFilter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        var notebooks = initListNotebooks();
        var filters = initListFilters();

        var filteredNotebooks = filter(filters, notebooks);

        System.out.println(filteredNotebooks);
    }

    public static List<Notebook> initListNotebooks(){
        var nb = Arrays.asList(
            new Notebook("1", "hp", "black", 4, 100, "win"),
            new Notebook("2", "dell", "red", 8, 1000, "lin"),
            new Notebook("3", "apple", "black", 16, 1000, "mac"),
            new Notebook("4", "apple", "silver", 8, 500, "mac"),
            new Notebook("5", "acer", "black", 16, 1000, "lin"),
            new Notebook("6", "hp", "silver", 16, 2000, "win")
        );
        
        return nb;
    }

    public static List<Filter> initListFilters() {
        var filters = new ArrayList<Filter>();

        System.out.println("Фильтры:");
        System.out.println("1 - ОЗУ");
        System.out.println("2 - Объем жёсткого диска");
        System.out.println("3 - Операционная система");
        System.out.println("4 - Цвет");
        System.out.println("0 - Применить фильтрацию");
        
        try(Scanner scanner = new Scanner(System.in)) {
            var hasNext = true;
            while(hasNext) {
                System.out.print("Введите номер фильтра: ");
                var filterType = scanner.nextInt();

                switch(filterType) {
                    case 0:
                        hasNext = false;
                        break;
                    case 1:
                        System.out.print("Введите минимальную ОЗУ: ");
                        filters.add(new RamFilter(scanner.nextInt()));
                        break;
                    case 2:
                        System.out.print("Введите минимальный объем жёсткого диска: ");
                        filters.add(new DiskCapacityFilter(scanner.nextInt()));
                        break;
                    case 3:
                        System.out.print("Введите операционную систему (win, lin, mac): ");
                        filters.add(new OsFilter(scanner.next()));
                        break;
                    case 4:
                        System.out.print("Введите цвет: ");
                        filters.add(new ColorFilter(scanner.next()));
                        break;
                    default:
                        System.out.println("Такого фильтра нет, попробуйте еще раз");
                        break;
                }
            }
        }
        catch (Exception e) {
            System.out.println(e);
            System.out.println("Фильтр некорректен");
        }

        return filters;
    }

    public static List<Notebook> filter(Collection<Filter> filters, List<Notebook> notebooks){

        var filteredNotebooks = new ArrayList<Notebook>();

        for (Notebook notebook : notebooks) {
            var is = true;
            for (Filter filter : filters) {
                if (!filter.Check(notebook)) {
                    is = false;
                    break;
                }
            }
            if (is) {
                filteredNotebooks.add(notebook);
            }
        }

        return filteredNotebooks;
    }

}
