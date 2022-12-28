package ru.gb.jseminar;
public class Main {

    // 1) Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
    // 2) Создать коллекцию ноутбуков.
    // 3) Написать мапу, которая будет содержать критерий (или критерии) фильтрации и выведет
    //      ноутбуки, отвечающие фильтру.
    //      Пример: ОЗУ - Значение, Объем ЖД - Значение, Операционная система - Значение, Цвет - Значение
    // 4) Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
    public static void main(String[] args) {
        Catalog catalog = new Catalog();
        catalog.add(0, "Apple", "monterey", 16, 128);
        catalog.add(1, "Asus", "windows", 16, 128);
        catalog.add(2, "Asus", "windows", 32, 512);
        catalog.add(2, "Lenovo", "windows", 32, 512);
        catalog.add(3, "MSI", "unix", 32, 1024);
        catalog.add(4, "Asus", "unix", 64, 1024);
        catalog.add(5, "MSI", "windows", 64, 1024);
        catalog.add(5, "Lenovo", "windows", 64, 512);

        catalog.filter(catalog.arr);
    }
}