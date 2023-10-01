package ru.gb.jseminar.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {
    String id; // ID
    String name; // название
    String color; // цвет
    Integer ram; // объём ОЗУ
    Integer diskCapacity; // объём винтчестера
    String os; // операционная система

    public Notebook(){
        this.id = null;
        this.name = null;
        this.color = null;
        this.ram = null;
        this.diskCapacity = null;
        this.os = null;
    }
    
    public Notebook(String id, String name, String color, Integer ram, Integer diskCapasity, String os){
        this.id = id;
        this.name = name;
        this.color = color;
        this.ram = ram;
        this.diskCapacity = diskCapasity;
        this.os = os;
    }

    public Map<Integer, List<String>> addNotebook(Map<Integer,List<String>> mapIn){
        var mapOut = new HashMap<Integer, List<String>>();

        return mapOut;
    }

    @Override
    public String toString(){
        String r = this.id + ": " + this.name + " (" + this.color + ", " + this.ram + ", " + this.diskCapacity + ", " + this.os + ")";
        return r;
    }
}
