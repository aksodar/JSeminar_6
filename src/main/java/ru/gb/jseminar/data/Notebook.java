package ru.gb.jseminar.data;

import java.util.*;

public class Notebook {
    private String os, color, model, ram, hd, processor;

    public Notebook (String model, String ram, String hd, String os, String color, String processor) {
        this.model = model;
        this.ram = ram;
        this.hd = hd;
        this.os = os;
        this.color = color;
        this.processor = processor;

    }

    public String getProcessor() {
        return processor;
    }

    public void setProcessor(String processor) {
        this.processor = processor;
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

    public TreeMap<String, String> CreateDict() {
        Map<String, String> item = new TreeMap<>();

        item.put("model", this.model);
        item.put("color", this.color);
        item.put("os", this.os);
        item.put("hd", this.hd);
        item.put("ram", this.ram);
        item.put("processor", this.processor);

        return (TreeMap<String, String>) item;
    }

    public List<String> Test() {
        List<String> item = new ArrayList<>();

        item.add(this.model);
        item.add(this.color);
        item.add(this.os);
        item.add(this.hd);
        item.add(this.ram);
        item.add(this.processor);

        return item;
    }

}
