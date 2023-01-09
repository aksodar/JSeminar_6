package ru.gb.jseminar.data;

import java.util.List;

public class Notebook {
    String brand;
    String model;
    Float diagonal;
    String cpu;
    int ram;
    String os;
    int price;

    public Notebook(String br, String mod, Float d, String cpu, int ram, String os, int pr) {
        this.brand = br;
        this.model = mod;
        this.diagonal = d;
        this.cpu = cpu;
        this.ram = ram;
        this.os = os;
        this.price = pr;
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public Float getDiagonal() {
        return diagonal;
    }
    public String getCpu() {
        return cpu;
    }
    public int getRam() {
        return ram;
    }
    public String getOs() {
        return os;
    }
    public int getPrice() {
        return price;
    }
    @Override
    public String toString(){
        String res = "=========================\n"+"брэнд: "+brand+"\n"+
                "модель:  "+model+"\n"+"диагональ:  "+diagonal+"\n"+"процессор:  "+cpu+"\n"+
                "Оперативная память:  "+ram+"\n"+"Операционная система:  "+os+"\n"+"цена:  "+price+"\n";
        return res;
    }
}
