package ru.gb.jseminar.data;

public class Notebook {
    //Поля класса Ноутбук
    private String os;
    private Integer cpu;
    private Integer ram;
    private String color;

    //Конструктор класса Ноутбук
    public Notebook(String os, Integer cpu, Integer ram, String color){
        this.os = os;
        this.cpu = cpu;
        this.ram = ram;
        this. color = color;
    }

    //Методы класса Ноутбук
    public String getOs(){
        return os;
    }

    public String setOs(String osName){
        return this.os = osName;
    }
    
    public Integer getCpu(){
        return cpu;
    }

    public Integer setCpu(Integer cpuValue){
        return this.cpu = cpuValue;
    }

    public Integer getRam(){
        return ram;
    }

    public Integer setRam(Integer ramValue){
        return this.ram = ramValue;
    }

    public String getColor(){
        return color;
    }    

    public String setColor(String colorValue){
        return this.color = colorValue;
    }    
}
