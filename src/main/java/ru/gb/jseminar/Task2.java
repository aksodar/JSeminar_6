package ru.gb.jseminar;

import java.util.Random;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.crypto.Data;

public class Task2 {

    // Продумайте структуру класса Бульдожка. Какие поля и методы будут актуальны для приложения, которое является
    // а) информационной системой ухода за ней
    // б) архивом выставки бульдожков
    // в) информационной системой Театра бульдожек имени Дарахвелидзе
    public static void main(String[] args) {

        Task2 t = new Task2();

        buldog a = new buldog("Boris", "male", "red", 5, (float) 12.5, "Kira", "+79876543211");
        buldog b = new buldog("Boris", "male", "white", 2, (float) 10.2, "Gosha", "+79876543000");

        System.out.println(a.toString());
        System.out.println(b.toString());
        System.out.println(a.comp(b));

    }
}

class buldog {
    String name; // имя
    String gender; // пол
    String colour; // окрас
    Integer age; // возраст
    Float weight; // вес
    String owner;
    String phone;
    String nextVisit;
    String lastVisit;
    String healing;

    buldog(){
        Random rand = new Random();

        name = null;
        gender = null;
        colour = null;
        age = rand.nextInt(0, 50);
        weight = rand.nextFloat(0, 100);
    }

    buldog(String n, String g, String c, Integer a, Float w, String owner, String phone){ // Как создать конкретного бульдожку
        name = n;
        gender = g;
        colour = c;
        age = a;
        weight = w;
        this.owner = owner;
        this.phone = phone;
        lastVisit = null;
        nextVisit = null;
    }

    @Override
    public String toString(){
        String r = "===== \n" + name + "\n" + gender + "\n" + colour + "\n" + age + "\n" + weight.toString()+ "\n" + nextVisit;
        return r;
    }

    public boolean comp(buldog b){
        if (this.name == b.name) return true;
        else return false;
    }

    public void setNextVisit(String date){
        this.nextVisit = date;
    }
    public String getNextVisit(){
        return this.nextVisit.toString();
    }

    public String getLastVisit(){
        return this.lastVisit.toString();
    }

    public void addVisit(String healing, String date){
        this.healing = healing;
        this.lastVisit = date;
    }
}
