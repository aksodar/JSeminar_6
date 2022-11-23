package ru.gb.jseminar.data;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Notebook {

    private double cost;
    private String model;
    private String name;
    private int ram;
    private String os;

    public Notebook(double cost, String model, String name, int ram, String os) {
        this.cost = cost;
        this.model = model;
        this.name = name;
        this.ram = ram;
        this.os = os;
    }

    public Map<String,Object> mapNotebook (){
        Map<String,Object> mapNote = new HashMap<>();
        mapNote.put("cost",cost);
        mapNote.put("model",model);
        mapNote.put("name",name);
        mapNote.put("ram",ram);
        mapNote.put("os",os);
        return mapNote;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }


    @Override
    public String toString() {
        return "Notebook{" +
                "cost=" + cost +
                ", model='" + model + '\'' +
                ", name='" + name + '\'' +
                ", ram=" + ram +
                ", os='" + os + '\'' +
                '}';
    }
}
