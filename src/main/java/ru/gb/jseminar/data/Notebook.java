package ru.gb.jseminar.data;

import java.util.HashMap;
import java.util.Map;

public class Notebook {
    private String model;
    private String os;
    private int ram;
    private int hdd;
    private String processor;
    private double display;
    private String color;
    private int cost;

    public Notebook(String model, String os, int ram, int hdd, String processor, double display, String color, int cost) {
        this.model = model;
        this.os = os;
        this.ram = ram;
        this.hdd = hdd;
        this.processor = processor;
        this.display = display;
        this.color = color;
        this.cost = cost;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public int getHdd() {
        return hdd;
    }
    public void setHd(int hdd) {
        this.hdd = hdd;
    }
    public String getProcessor() {
        return processor;
    }
    public void setProcessor(String processor) {
        this.processor = processor;
    }
    public double getDisplay() {
        return display;
    }
    public void setDisplay(double display) {
        this.display = display;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public Map<String,Object> mapNotebook (){
        Map<String,Object> mapNb = new HashMap<>();
        mapNb.put("model",model);
        mapNb.put("os",os);
        mapNb.put("ram",ram);
        mapNb.put("hdd",hdd);
        mapNb.put("processor",processor);
        mapNb.put("display",processor);
        mapNb.put("color",color);
        mapNb.put("cost",cost);

        return mapNb;
    }



    @Override
    public String toString() {
        return "\nНоутбук{" +
               "модель: " + model + ", " +
               "ОС: " + os + ", " +
               "память: " + ram + ", " +
               "накопитель: " + hdd + ", " +
               "процессор: " + processor + ", " +
               "экран: " + display + ", " +
               "цвет: " + color + ", " +
               "цена: " + cost +
               "}";
    }
}