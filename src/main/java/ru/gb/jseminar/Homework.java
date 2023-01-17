package ru.gb.jseminar;

import ru.gb.jseminar.data.Person;
import ru.gb.jseminar.data.Filter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Homework {

    // Приложение для проведения исследований с генеалогическим древом.
    // Идея: описать некоторое количество компонент, например: модель человека компонента хранения связей и отношений между людьми: родитель, ребёнок - классика, но можно подумать и про отношение, брат, свекровь, сестра и т. д. компонент для проведения исследований дополнительные компоненты, например отвечающие за вывод данных в консоль, загрузку и сохранения в файл, получение\построение отдельных моделей человека.
    // Под “проведением исследования” можно понимать получение всех детей выбранного человека.

    public static void main(String[] args) {
        
    }

    public static List<Person> initListNotebooks(){
        var people = Arrays.asList(
            new Person("Илья", "Петрович", "Попов", "муж", "Попова Анна Николаевна", "Попов Петр Анатольевич", "2014-02-14"), // сын
            new Person("Мария", "Петровна", "Попова", "жен", "Попова Анна Николаевна", "Попов Петр Анатольевич", "2012-02-14"), // дочь
            new Person("Анна", "Николаевна", "Попова", "жен", "Винюкова Мария Ивановна", "Винюков Николай Петрович", "1986-11-10"), // мать
            new Person("Мария", "Ивановна", "Винюкова", "жен", "Иванова Алина Федоровна", "Иванов Иван Иванович", "1960-06-18"), // бабушка (мать)
            new Person("Петр", "Анатольевич", "Попов", "муж", "Попова Мария Ивановна", "Попов Анатолий Владимирович", "1988-08-15"), // отец
            new Person("Лида", "Иванона", "Зябликова", "жен", "Попова Мария Ивановна", "Попов Анатолий Владимирович", "2013-02-01"), // сестра отца
            new Person("Мария", "Ивановна", "Попова", "жен", "Носик Наталья Олеговна", "Носик Иван Сергеевич", "1955-12-09") // бабушка (отец)
            );
        return people;
    }

    public static List<Filter> initListFilters() {
        var filters = new ArrayList<Filter>();

        System.out.println("Каких родственников вы ищете?");
        System.out.println("1 - родители");
        System.out.println("2 - братья/сестры");
        System.out.println("3 - дети");
        System.out.println("4 - дяти/тети");
        System.out.println("5 - бабушки/дедушки");
        System.out.println("6 - внуки/внучки");
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
                        
                        break;
                    case 2:
                        
                        break;
                    case 3:

                        break;
                    case 4:
                        
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

    public static List<Person> filter(Collection<Filter> filters, List<Person> persons){

        var filteredPersons = new ArrayList<Person>();

        for (Person person : persons) {
            var is = true;
            for (Filter filter : filters) {
                if (!filter.Check(person)) {
                    is = false;
                    break;
                }
            }
            if (is) {
                filteredPersons.add(person);
            }
        }

        return filteredPersons;
    }

}
