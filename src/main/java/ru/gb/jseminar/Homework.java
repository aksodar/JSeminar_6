package ru.gb.jseminar;

import com.sun.tools.javac.Main;

import java.util.*;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Notebook a = new Notebook(16, 250, "Windows 10", "black");
        Notebook b = new Notebook(24, 470, "Windows 11", "red");
        Notebook c = new Notebook(32, 1000, "Windows 11", "grey");
        Notebook d = new Notebook(24, 800, "Windows 11", "black");
        Notebook e = new Notebook(16, 800, "Windows 10", "red");
        Notebook f = new Notebook(24, 450, "Windows 10", "grey");
        Notebook g = new Notebook(16, 450, "Windows 10", "black");

        Notebook[] note = {a, b, c, d, e, f, g};
        Homework hv = new Homework();
        System.out.println(hv.in(hv.mag(note)));
    }
    public HashMap<Integer, Notebook> mag(Notebook[] note) {
        HashMap<Integer, Notebook> col = new HashMap<>();
        int id = 0;
        for (int i = 0; i < note.length; i++) {
            id = i;
            col.put(id, note[i]);
        }
        return col;
    }
    public String in(HashMap<Integer, Notebook> mag) {
        String j1 = "===========================";
        Notebook nNull1 = new Notebook(null, null, null, null);
        System.out.print("Введите параметр который хотите посмотреть: \n" +
                "оперативная память: 1; жесткий диск: 2; операционная система: 3; цвет: 4 \n--> ");
        int in1 = new Scanner(System.in).nextInt();
        if (in1 == 1) {
            System.out.println("Введите минимальный параметр оперативной памяти.");
            nNull1.ram = new Scanner(System.in).nextInt();
            for (int i = 0; i < mag.size(); i++) {
                if (nNull1.compRam(mag.get(i))) {
                    System.out.println(mag.get(i));
                }
            }
        }
        else if (in1 == 2){
            System.out.println("Введите минимальный размер жесткого диска.");
            nNull1.hdd = new Scanner(System.in).nextInt();
            for (int i = 0; i < mag.size(); i++) {
                if (nNull1.compHdd(mag.get(i))) {
                    System.out.println(mag.get(i));
                }
            }
        }
        else if (in1 == 3){
            System.out.print("Введите номер операционной системы:\n" +
                    "  1 - Windows 10\n" +
                    "  2 - Windows 11\n" +
                    "--> ");
            String os = new Scanner(System.in).nextLine();
            if(Objects.equals(os, "1")) nNull1.operatingSystem = "Windows 10";
            if(Objects.equals(os, "2")) nNull1.operatingSystem = "Windows 11";
            for (int i = 0; i < mag.size(); i++) {
                if (nNull1.compOperatingSystem(mag.get(i))) {
                    System.out.println(mag.get(i));
                }
            }
        }
        else if (in1 == 4){
            System.out.print("Введите цвет:\n" +
                    "  1 - black\n" +
                    "  2 - red\n" +
                    "  3 - grey\n" +
                    "--> ");
            String os = new Scanner(System.in).nextLine();
            if(Objects.equals(os, "1")) nNull1.colour = "black";
            if(Objects.equals(os, "2")) nNull1.colour = "red";
            if(Objects.equals(os, "3")) nNull1.colour = "grey";
            for (int i = 0; i < mag.size(); i++) {
                if (nNull1.compColour(mag.get(i))) {
                    System.out.println(mag.get(i));
                }
            }
        }
        return j1;
    }


}
