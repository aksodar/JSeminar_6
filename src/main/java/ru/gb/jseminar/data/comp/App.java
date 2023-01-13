package comp;

import java.util.Scanner;

public class App {

    public static void main(String[] arg) {

        Notebook nb1 = new Notebook(1, 128, 1024, "Windows", "red");
        Notebook nb2 = new Notebook(2, 256, 64, "MacOS", "white");
        Notebook nb3 = new Notebook(3, 512, 32, "Android", "black");
        Notebook nb4 = new Notebook(4, 1024, 512, "Windows", "green");

        System.out.println(nb1.toString());
        System.out.println(nb2.toString());
        System.out.println(nb3.toString());
        System.out.println(nb4.toString());

        while (true) {
            System.out.println("Выберите команду:");
            System.out.println("1 - сортировка по RAM");
            System.out.println("2 - сортировка по HDD");
            System.out.println("3 - сортировка по OS");
            System.out.println("4 - сортировка по цвету");
            Scanner sc = new Scanner(System.in, "ibm866");
            System.out.print("Введите команду: ");
            Integer choice = sc.nextInt();
            if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {


                if (choice == 1) {
                    System.out.printf("Введите значение ОЗУ больше или равно: ");
                    Integer res = sc.nextInt();
                    if (nb1.ram >= res) {
                        System.out.println(nb1);
                    }
                    if (nb2.ram >= res) {
                        System.out.println(nb2);
                    }
                    if (nb3.ram >= res) {
                        System.out.println(nb3);
                    }
                    if (nb4.ram >= res) {
                        System.out.println(nb4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 2) {
                    System.out.printf("Введите объем жесткого диска больше или равнo: ");
                    Integer res = sc.nextInt();
                    if (nb1.hdd >= res) {
                        System.out.println(nb1);
                    }
                    if (nb2.hdd >= res) {
                        System.out.println(nb2);
                    }
                    if (nb3.hdd >= res) {
                        System.out.println(nb3);
                    }
                    if (nb4.hdd >= res) {
                        System.out.println(nb4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 3) {
                    System.out.printf("Введите название операционной системы: ");
                    Scanner sc1 = new Scanner(System.in);
                    String res = sc1.nextLine();
                    if (nb1.os.equals(res)) {
                        System.out.println(nb1);
                    }
                    if (nb2.os.equals(res)) {
                        System.out.println(nb2);
                    }
                    if (nb3.os.equals(res)) {
                        System.out.println(nb3);
                    }
                    if (nb4.os.equals(res)) {
                        System.out.println(nb4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                if (choice == 4) {
                    System.out.printf("Введите цвет: ");
                    Scanner sc2 = new Scanner(System.in);
                    String res2 = sc2.nextLine();
                    if (nb1.clr.equals(res2)) {
                        System.out.println(nb1);
                    }
                    if (nb2.clr.equals(res2)) {
                        System.out.println(nb2);
                    }
                    if (nb3.clr.equals(res2)) {
                        System.out.println(nb3);
                    }
                    if (nb4.clr.equals(res2)) {
                        System.out.println(nb4);
                    } else System.out.println("Такого ноутбука в наличии нет.");
                }
                break;
            } else {
                System.out.println("Ошибка");
            }
        }
    }
}

