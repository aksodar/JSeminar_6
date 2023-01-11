package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();
        Notebook laptop1 = new Notebook(1, 128, 1024, "Win", "red");
        Notebook laptop2 = new Notebook(2, 256, 64, "Mac", "white");
        Notebook laptop3 = new Notebook(3, 512, 32, "Android", "black");
        Notebook laptop4 = new Notebook(4, 1024, 512, "Win", "green");

        System.out.println(laptop1.toString());
        System.out.println(laptop2.toString());
        System.out.println(laptop3.toString());
        System.out.println(laptop4.toString());

        while (true) {
            System.out.println("Выберите команду:");
            System.out.println("1 - сортировка по RAM");
            System.out.println("2 - сортировка по SSD");
            System.out.println("3 - сортировка по OS");
            System.out.println("4 - сортировка по цвету");
            Scanner sc = new Scanner(System.in, "ibm866");
            System.out.print(" ");
            Integer choice = sc.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
                if (choice == 1) {
                    System.out.printf("Введите значение ОЗУ(RAM) 128, 256, 512, 1024 (больше или равно): ");
                    Integer res = sc.nextInt();
                    if (laptop1.ram >= res) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.ram >= res) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.ram >= res) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.ram >= res) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 2) {
                    System.out.printf("Введите объем жесткого диска SSD(RAM) 32, 64, 512, 1024 (больше или равен): ");
                    Integer res = sc.nextInt();
                    if (laptop1.ssd >= res) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.ssd >= res) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.ssd >= res) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.ssd >= res) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 3) {
                    System.out.printf("Введите название операционной системы(OS: Win, Mac, Android): ");
                    Scanner sc1 = new Scanner(System.in);
                    String res = sc1.nextLine();
                    if (laptop1.os.equals(res)) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.os.equals(res)) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.os.equals(res)) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.os.equals(res)) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 4) {
                    System.out.printf("Введите цвет(clr): ");
                    Scanner sc2 = new Scanner(System.in);
                    String res2 = sc2.nextLine();
                    if (laptop1.clr.equals(res2)) {
                        System.out.println(laptop1);
                    }
                    if (laptop2.clr.equals(res2)) {
                        System.out.println(laptop2);
                    }
                    if (laptop3.clr.equals(res2)) {
                        System.out.println(laptop3);
                    }
                    if (laptop4.clr.equals(res2)) {
                        System.out.println(laptop4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                break;
            } else {
                System.out.println("Такой команды нет. Введите правильную");
            }
        }
    }
}