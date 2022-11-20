package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook.NotebookFactory;
import ru.gb.jseminar.data.Notebook.Properties.*;
import ru.gb.jseminar.data.ProductFactory;

import java.util.*;

import static ru.gb.jseminar.data.Notebook.PropertiesConfig.*;

public class Notebook {
    List<Property> properties;
    Notebook() {
        ProductFactory productFactory = new NotebookFactory();
        properties = new ArrayList<>();

        properties.add(productFactory.getProperty(COLOR));
        properties.add(productFactory.getProperty(CPU));
        properties.add(productFactory.getProperty(GPU));
        properties.add(productFactory.getProperty(MODEL));
        properties.add(productFactory.getProperty(OS));
        properties.add(productFactory.getProperty(PRICE));
        properties.add(productFactory.getProperty(RAM));
        properties.add(productFactory.getProperty(STORAGE));
    }

    Notebook(int color, int cpu, int gpu, int model, int os, int price, int ram, int storage){
        ProductFactory productFactory = new NotebookFactory();
        properties = new ArrayList<>();

        properties.add(productFactory.getProperty(COLOR));
        properties.get(properties.size()-1).init(color);
        properties.add(productFactory.getProperty(CPU));
        properties.get(properties.size()-1).init(cpu);
        properties.add(productFactory.getProperty(GPU));
        properties.get(properties.size()-1).init(gpu);
        properties.add(productFactory.getProperty(MODEL));
        properties.get(properties.size()-1).init(model);
        properties.add(productFactory.getProperty(OS));
        properties.get(properties.size()-1).init(os);
        properties.add(productFactory.getProperty(PRICE));
        properties.get(properties.size()-1).init(price);
        properties.add(productFactory.getProperty(RAM));
        properties.get(properties.size()-1).init(ram);
        properties.add(productFactory.getProperty(STORAGE));
        properties.get(properties.size()-1).init(storage);
    }

    public void randInit (){
        for (Property a : properties) {
            a.randInit();
        }
    }

    public String getPropertyValue(int value){
        return properties.get(value).getValue();
    }

    @Override
    public String toString() {
        return "Noutbook: " + properties.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return properties.get(COLOR.ordinal()).getValue() == notebook.properties.get(COLOR.ordinal()).getValue() &&
                properties.get(CPU.ordinal()).getValue() == notebook.properties.get(CPU.ordinal()).getValue() &&
                properties.get(GPU.ordinal()).getValue() == notebook.properties.get(GPU.ordinal()).getValue() &&
                properties.get(MODEL.ordinal()).getValue() == notebook.properties.get(MODEL.ordinal()).getValue() &&
                properties.get(OS.ordinal()).getValue() == notebook.properties.get(OS.ordinal()).getValue() &&
                Objects.equals(properties.get(PRICE.ordinal()).getValue(), notebook.properties.get(PRICE.ordinal()).getValue()) &&
                Objects.equals(properties.get(RAM.ordinal()).getValue(), notebook.properties.get(RAM.ordinal()).getValue()) &&
                Objects.equals(properties.get(STORAGE.ordinal()).getValue(), notebook.properties.get(STORAGE.ordinal()).getValue());
    }

    @Override
    public int hashCode() {
        return Objects.hash(properties.get(COLOR.ordinal()).getValue(),
                properties.get(CPU.ordinal()).getValue(),
                properties.get(GPU.ordinal()).getValue(),
                properties.get(MODEL.ordinal()).getValue(),
                properties.get(OS.ordinal()).getValue(),
                properties.get(PRICE.ordinal()).getValue(),
                properties.get(RAM.ordinal()).getValue(),
                properties.get(STORAGE.ordinal()).getValue());
    }

}
