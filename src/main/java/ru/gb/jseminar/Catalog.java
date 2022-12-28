package ru.gb.jseminar;

import java.util.*;

public class Catalog {
    public List<Laptop> arr = new ArrayList<>();

    public void add(int id, String model, String sys, int ram, int memory) {
        Laptop laptop = new Laptop(id, model, sys, ram, memory);
        this.arr.add(laptop);
    }

    public void getList(List<Laptop> laptops) {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n"); //не придумал, как "адекватно" очистить консоль =)
        System.out.println("Список ноутбуков: ");
        for (Laptop i : laptops) {
            System.out.println(i);
        }
        System.out.println();
    }

    public LinkedList<Laptop> filter(List<Laptop> laptops) {
        getList(laptops);
        Map<Integer, String> filters = new LinkedHashMap<>();
        filters.put(1, "system");
        filters.put(2, "model");
        filters.put(3, "ram");
        filters.put(4, "memory");

        Scanner scan = new Scanner(System.in);
        System.out.print("Выберите фильтр: " +
                "\n 1 - Отфильтровать по системе " +
                "\n 2 - Отфильтровать по моделям " +
                "\n 3 - Отфильтровать по ОЗУ " +
                "\n 4 - Отфильтровать по Памяти " +
                "\n : ");
        Integer choise = scan.nextInt();

        LinkedList<Laptop> result = new LinkedList<>();
        if (!filters.containsKey(choise)) {
            System.out.println("Введено не верное число");
        } else {

            int number = 1;
            Map<Integer, String> tempList = new LinkedHashMap<>();

            if (filters.get(choise).equals("system")) {
                System.out.println("Выберите систему: ");
                for (Laptop i : laptops) {
                    if (!tempList.containsValue(i.getSystem())) {
                        System.out.printf("%d - " + i.getSystem() + "\n", number);
                        tempList.put(number, i.getSystem());
                        number = number + 1;
                    }
                }
                System.out.print(": ");
                choise = scan.nextInt();
                for (Laptop i : laptops) {
                    if (i.getSystem().equals(tempList.get(choise))) {
                        result.add(i);
                    }
                }
            } else if (filters.get(choise).equals("model")) {
                System.out.println("Выберите модель: ");
                for (Laptop i : laptops) {
                    if (!tempList.containsValue(i.getModel())) {
                        System.out.printf("%d - " + i.getModel() + "\n", number);
                        tempList.put(number, i.getModel());
                        number = number + 1;
                    }
                }
                System.out.print(": ");
                choise = scan.nextInt();
                for (Laptop i : laptops) {
                    if (i.getModel().equals(tempList.get(choise))) {
                        result.add(i);
                    }
                }
            } else if (filters.get(choise).equals("ram")) {
                System.out.println("Выберите объем ОЗУ: ");
                for (Laptop i : laptops) {
                    if (!tempList.containsValue(i.getRam().toString())) {
                        System.out.printf("%d - " + i.getRam() + "\n", number);
                        tempList.put(number, i.getRam().toString());
                        number = number + 1;
                    }
                }
                System.out.print(": ");
                choise = scan.nextInt();
                for (Laptop i : laptops) {
                    if (i.getRam().toString().equals(tempList.get(choise))) {
                        result.add(i);
                    }
                }

            } else if (filters.get(choise).equals("memory")) {
                System.out.println("Выберите объем памяти: ");
                for (Laptop i : laptops) {
                    if (!tempList.containsValue(i.getMemory().toString())) {
                        System.out.printf("%d - " + i.getMemory() + "Gb" + "\n", number);
                        tempList.put(number, i.getMemory().toString());
                        number = number + 1;
                    }
                }

                System.out.print(": ");
                choise = scan.nextInt();
                for (Laptop i : laptops) {
                    if (i.getMemory().toString().equals(tempList.get(choise))) {
                        result.add(i);
                    }
                }

            }
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
            System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n"); //не придумал, как "адекватно" очистить консоль =)
            if (result.size() < 2) {
                getList(result);
                System.out.println("По указанным критериям найден только 1 вариант");
                return result;
            }
            getList(result);
            System.out.println("Выполнить еще сортировку?\n1 - да\n2 - нет");
            System.out.print(": ");
            choise = scan.nextInt();
            if (choise.equals(1)) {
                filter(result);
            }
        }
        return result;
    }
}