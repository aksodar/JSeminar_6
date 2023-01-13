

package ru.gb.jseminar;

import java.util.*;


// 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public class Homework {
    static Map<Integer, Notebook> mod = new HashMap<>();

    public static void main(String[] args) {

        Homework hw = new Homework();
        Notebook n1 = new Notebook("Dell", 8, 128, "Windows 10", "red");
        Notebook n2 = new Notebook("Asus", 16, 256, "Debian", "silver");
        Notebook n3 = new Notebook("Huawei", 32, 512, "Ubuntu", "white");
        Notebook n4 = new Notebook("Msi", 64, 1000, "Windows 311", "black");
        hw.addNote(n1);
        hw.addNote(n2);
        hw.addNote(n3);
        hw.addNote(n4);
        hw.showAll();

        while (true) {
            System.out.println("Выберите команду:");
            System.out.println("1 - сортировка по RAM");
            System.out.println("2 - сортировка по SSD");
            System.out.println("3 - сортировка по OS");
            System.out.println("4 - сортировка по цвету");
            System.out.println("5 - сортировка по названию");
            Scanner sc = new Scanner(System.in);
            System.out.print("Введите команду: ");
            Integer choice = sc.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4 || choice == 5) {


                if (choice == 1) {
                    System.out.printf("Введите значение ОЗУ(RAM) больше или равно: ");
                    Integer res = sc.nextInt();
                    if (n1.ram >= res) {
                        System.out.println(n1);
                    }
                    if (n2.ram >= res) {
                        System.out.println(n2);
                    }
                    if (n3.ram >= res) {
                        System.out.println(n3);
                    }
                    if (n4.ram >= res) {
                        System.out.println(n4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 2) {
                    System.out.printf("Введите объем жесткого диска SSD(RAM), он больше или равен: ");
                    Integer res = sc.nextInt();
                    if (n1.ssd >= res) {
                        System.out.println(n1);
                    }
                    if (n2.ssd >= res) {
                        System.out.println(n2);
                    }
                    if (n3.ssd >= res) {
                        System.out.println(n3);
                    }
                    if (n4.ssd >= res) {
                        System.out.println(n4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 3) {
                    System.out.printf("Введите название операционной системы(OS): ");
                    Scanner sc1 = new Scanner(System.in);
                    String res1 = sc1.nextLine();
                    if (n1.os.equals(res1)) {
                        System.out.println(n1);
                    }
                    else if (n2.os.equals(res1)) {
                        System.out.println(n2);
                    }
                   else if (n3.os.equals(res1)) {
                        System.out.println(n3);
                    }
                    else if (n4.os.equals(res1)) {
                        System.out.println(n4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 4) {
                    System.out.printf("Введите цвет(clr): ");
                    Scanner sc2 = new Scanner(System.in);
                    String res2 = sc2.nextLine();
                    if (n1.color.equals(res2)) {
                        System.out.println(n1);
                    }
                   else if (n2.color.equals(res2)) {
                        System.out.println(n2);
                    }
                    else if (n3.color.equals(res2)) {
                        System.out.println(n3);
                    }
                    else if (n4.color.equals(res2)) {
                        System.out.println(n4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 5) {
                    System.out.printf("Введите название: ");
                    Scanner sc3 = new Scanner(System.in);
                    String res3 = sc3.nextLine();
                    if (n1.name.equals(res3)) {
                        System.out.println(n1);
                    }
                    else if (n2.name.equals(res3)) {
                        System.out.println(n2);
                    }
                    else if (n3.name.equals(res3)) {
                        System.out.println(n3);
                    }
                    else if (n4.name.equals(res3)) {
                        System.out.println(n4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                break;

                } else {
                    System.out.println("Такой команды нет. Введите правильную");
                }
            }
        }


        public void addNote (Notebook n){
            int id = this.mod.keySet().size() + 1;
            this.mod.put(id, n);
        }

        public void showAll () {
            Iterator var1 = this.mod.keySet().iterator();
            while (var1.hasNext()) {
                int id = (Integer) var1.next();
                System.out.println("\n" + "id " + id);
                System.out.println(((Notebook) this.mod.get(id)).toString());
            }
        }
    }




