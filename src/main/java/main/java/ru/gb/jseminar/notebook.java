package main.java.ru.gb.jseminar;

public class notebook {
    String marka;
    String name;
    String os;

    Integer number;
    Integer ram;
    Integer rom;

    String color;

    //Конструктор
    public notebook(String marka, String name, String os, Integer number, Integer ram, Integer rom, String color){
        this.marka = marka;
        this.name = name;
        this.os = os;

        this.number = number;
        this.ram = ram;
        this.rom = rom;

        this.color = color;
    }

    //Переназначаем метод toString()
    @Override
    public String toString() {
        String param = String.format(" Марка: %s\n Имя: %s\n Операционная система: %s\n Номер: %s\n ОЗУ: %s\n ПЗУ: %s\n Цвет: %s\n", marka, name, os, number, ram, rom, color);
        return param;
    }

    //Сравниваем текущее значение переменной класса с заданными величинами
    public boolean filter_ram(int a, int b){
        if(this.ram >= a && this.ram <= b) return true;
        else return false;
    }

    //Сравниваем текущее значение переменной класса с заданными величинами
    public boolean filter_rom(int a, int b){
        if(this.rom > a && this.rom < b) return true;
        else return false;
    }
}
