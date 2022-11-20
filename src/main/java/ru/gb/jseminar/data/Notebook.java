package ru.gb.jseminar.data;
import java.util.*;

public class Notebook {
    private String color, model, processor;
    public Notebook (String color, String model, String processor){
        this.color = color;
        this.model = model;
        this.processor = processor;

    }
    public String getProcessor(){
        return processor;
    }
    public void setProcessor(String processor){
        this.processor = processor;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public TreeMap<String, String> CreateDict() {
        Map<String, String> item = new TreeMap<>();

        item.put("model", this.model);
        item.put("color", this.color);
        item.put("processor", this.processor);

        return (TreeMap<String, String>) item;
    }

    public List<String> Test() {
        List<String> item = new ArrayList<>();

        item.add(this.model);
        item.add(this.color);
        item.add(this.processor);

        return item;
    }
} 
