package ru.gb.jseminar;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Set;

public class Homework {

    private static Set<ru.gb.jseminar.Notebook> Notebook;

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки из первоначального множества и вывести подходящие по условиям.
    public static void main(String[] args) {
        Notebook a = new Notebook("Mac", "MacOS", 16, "metallic", 14.0F, 250000);
        Notebook b = new Notebook("Asus", "Intel Core", 8, "metallic", 15.6F, 110000);
        Notebook c = new Notebook("Xiaomi", "Intel Core i3 ", 8, "metallic", 15.6F, 40000);
        Notebook d = new Notebook("Lenovo", "AMD Ryze", 16, "metallic", 14.0F, 35000);
        Notebook e = new Notebook("Irbis", "AMD Ryze", 8, "white", 15.6F, 45000);
        Notebook f = new Notebook("Honor", "AMD Ryzen", 16, "black", 13.0F, 120000);
        Notebook g = new Notebook("HUAWEI", "AMD Ryzen", 16, "black", 15.0F, 150000);

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(c.toString());
        System.out.println(d.toString());
        System.out.println(e.toString());
        System.out.println(f.toString());
        System.out.println(g.toString());
        Homework tk = new Homework();
        System.out.println(tk.filter(Notebook));
    }
    public List<Notebook> filter(Set<Notebook> a) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Укажите параметры ноутбука: " +
                "\n фирма: ");
        String enternm = scan.nextLine();
        System.out.println("процессор: ");
        String entersyst = scan.nextLine();
        System.out.println("кэш-память: ");
        String entermem = scan.nextLine();
        System.out.println("цвет ноутбука: ");
        String enterclr = scan.nextLine();
        System.out.println("размер экрана: ");
        Float entersizescr = Float.valueOf(scan.nextLine());
        System.out.println("цена: ");
        Integer enterpr = Integer.valueOf(scan.nextLine());

        List<Notebook> listNotebook = new ArrayList<>();
        for (Notebook i : Notebook) {
            if (enternm.equals(i.name)) {
                if (entersyst.equals(i.system)) {
                    if (entermem.equals(i.memory)) {
                        if (enterclr.equals(i.colour)) {
                            if (entersizescr.equals(i.sizescreen)) {
                                if (enterpr.equals(i.price)) {
                                    listNotebook.add(i);
                                }
                            }
                        }
                    }
                }
            }
        }
        return listNotebook;
    }

//    public Set<Notebook> newFilter(Set<Notebook> Notebook) {
//        Scanner scan = new Scanner(System.in);
//        Set<Notebook> listNotebook = new HashSet<>(Notebook);
//
//        System.out.println("Укажите параметры поиска:");
//        String userRequest = scan.nextLine();
//
//        for (int i = 0; i < userRequest.length(); i++) {
//            if (1 == Character.getNumericValue(userRequest.charAt(i))) {
//                System.out.println("Укажите наименование производителя: \n");
//                String enternm = scan.nextLine();
//                for (Notebook tempNotebook : Notebook) {
//                    if (enternm != tempNotebook.name) {
//                        listNotebook.remove(tempNotebook);
//                    }
//                }
//            }
//
//            if (2 == Character.getNumericValue(userRequest.charAt(i))) {
//                System.out.println("Укажите процессор: \n");
//                String entersyst = scan.nextLine();
//                for (Notebook tempNotebook : Notebook) {
//                    if ((entersyst.equals(tempNotebook.system)) == false) {
//                        listNotebook.remove(tempNotebook);
//                    }
//                }
//            }
//
//            if (3 == Character.getNumericValue(userRequest.charAt(i))) {
//                System.out.println("Укажите объем памяти: \n");
//                String entermem = scan.nextLine();
//                for (Notebook tempNotebook : Notebook) {
//                    if ((entermem.equals(tempNotebook.memory) == false)) {
//                        listNotebook.remove(tempNotebook);
//                    }
//                }
//            }
//
//            if (4 == Character.getNumericValue(userRequest.charAt(i))) {
//                System.out.println("Укажите цвет ноутбука\n");
//                String enterColor = scan.nextLine();
//                for (Notebook tempNotebook : Notebook) {
//                    if ((enterColor.equals(tempNotebook.colour)) == false) {
//                        listNotebook.remove(tempNotebook);
//                    }
//                }
//            }
//
//            if (5 == Character.getNumericValue(userRequest.charAt(i))) {
//                System.out.println("Укажите размер экрана\n");
//                String entersizescr = scan.nextLine();
//                for (Notebook tempNotebook : Notebook) {
//                    if ((entersizescr.equals(tempNotebook.sizescreen)) == false) {
//                        listNotebook.remove(tempNotebook);
//                    }
//                }
//            }
//
//            if (6 == Character.getNumericValue(userRequest.charAt(i))) {
//                System.out.println("Укажите цену:");
//                String enterpr = scan.nextLine();
//                for (Notebook tempNotebook : Notebook) {
//                    if ((enterpr.equals(tempNotebook.price)) == false) {
//                        listNotebook.remove(tempNotebook);
//                    }
//                }
//            }
//        }
//        return listNotebook;
//    }
//    }
}
