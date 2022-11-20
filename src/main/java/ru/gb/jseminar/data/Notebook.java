package ru.gb.jseminar.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class Notebook {

    private String model, ram, hd, os, color;
    public Notebook(String model, String ram, String hd, String os, String color) {

        this.model=model;
        this.ram=ram;
        this.hd=hd;
        this.os=os;
        this.color=color;
    }

    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getRam() {
        return ram;
    }
    public void setRam(String ram) {
        this.ram = ram;
    }
    public String getHd() {
        return hd;
    }
    public void setHd(String hd) {
        this.hd = hd;
    }
    public String getOs() {
        return os;
    }
    public void setOs(String os) {
        this.os = os;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public TreeMap<String, String> CreateDict(){
        Map<String, String> item = new TreeMap<>();

        item.put("model", this.model);
        item.put("ram", this.ram);
        item.put("hd", this.hd);
        item.put("os", this.os);
        item.put("color", this.color);

        return (TreeMap<String, String>) item;

    }
    public List<String> Test(){
        List<String> item = new ArrayList<>();

        item.add(this.model);
        item.add(this.ram);
        item.add(this.hd);
        item.add(this.os);
        item.add(this.color);

        return item;

    }

}
