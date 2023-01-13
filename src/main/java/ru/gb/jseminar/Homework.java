package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import main.java.ru.gb.jseminar.notebook;

public class Homework {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Homework hw = new Homework();

        //База для генерации случайных ноутбуков
        List<String> labels = new ArrayList<>(Arrays.asList("Asus", "HP", "MSI", "Lenovo"));
        List<String> names = new ArrayList<>(Arrays.asList("Hunter", "Dragon", "Katana", "Nitro"));
        List<String> oper_systems = new ArrayList<>(Arrays.asList("Windows 7", "Linux Ubuntu", "Windows 10", "Windows XP"));
        List<String> colors = new ArrayList<>(Arrays.asList("Black", "Red", "Silver", "Blue"));
        
        Set<notebook> nb = new HashSet<>();
        nb = hw.initListNotebooks(labels, names, oper_systems, colors);

        //Параметры фильтрации RAM
        int A_RAM = 2;
        int B_RAM = 8;

        //Параметры фильтрации ROM
        int A_ROM = 2000;
        int B_ROM = 8000;

        //Фильтруем set по объему памяти ОЗУ 2<= ram <=8
        System.out.println("Фильтр памяти RAM:");
        System.out.printf("\n%s\n", hw.filter_ram(nb, A_RAM, B_RAM));

        //Фильтруем set по объему памяти ПЗУ 2000< rom <4000
        System.out.println("Фильтр памяти ROM:");
        System.out.printf("\n%s\n", hw.filter_rom(nb, A_ROM, B_ROM));
    }

    //Генератор случайного числа
    public Integer dice(Integer size_list){
        Random random = new Random();
        Integer result = random.nextInt(0, size_list);
        return result;
    }

    //Формируем множество ноутбуков
    public Set<notebook> initListNotebooks(List<String> labels, List<String> names, List<String> oper_systems, List<String> colors){
        Set<notebook> nootebooks = new HashSet<>(4);
        Random random = new Random();
        int SIZE = 5;

        while (true){
            Integer number = random.nextInt(0, 1000); 
            Integer ram = random.nextInt(2, 16);
            Integer rom = random.nextInt(1000, 10000);
            
            nootebooks.add( new notebook(labels.get(dice(labels.size())), 
                                names.get(dice(names.size())), 
                                oper_systems.get(dice(oper_systems.size())), 
                                number, 
                                ram, 
                                rom, 
                                colors.get(dice(colors.size()))));
            if(nootebooks.size() == SIZE) break;
        }

        //Вывод сета на экран
        int count = 1;
        for(notebook id: nootebooks){
            System.out.printf("======================== %s ========================\n", count);
            System.out.println(id.toString());
            count++;
        }

        return nootebooks;
    }

    //Фильтра RAM
    public List<notebook> filter_ram(Set<notebook> nootebooks, int a, int b){
        List<notebook> result_nb = new ArrayList<>();

        for(notebook nb_first: nootebooks){
            if(nb_first.filter_ram(a, b)){
                result_nb.add(nb_first);
            }
        }

        return result_nb;
    }

    //Фильтр ROM
    public List<notebook> filter_rom(Set<notebook> nootebooks, int a, int b){
        List<notebook> result_nb = new ArrayList<notebook>();

        for(notebook nb_first: nootebooks){
            if(nb_first.filter_rom(a, b)){
                result_nb.add(nb_first);
            }
        }

        return result_nb;
    }
}
