package ru.gb.jseminar.data;

import java.util.HashMap;
import java.util.Map;

public class Notebook {

    private int price;
    private String manufacturer;
    private int RAM;
    private int SSD;
    private String OS;
    private int size;
    private String color;
    

    public Notebook (int price, String manufacturer, int ram, int ssd, String os, int size, String color) {
        
        this.price = price;
        this.manufacturer = manufacturer;
        this.RAM = ram;
        this.SSD = ssd;
        this.OS = os;
        this.size = size;
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Price:%d rub Manufacturer:'%s' RAM:%dGB SSD:%dGB OS:'%s' Size:%d' Color:'%s'",price, manufacturer, RAM, SSD, OS, size, color);
    }

    @Override
    public boolean equals(Object obj) {
        var nb = (Notebook) obj;
        return price == nb.price && manufacturer.equals(nb.manufacturer) && RAM == nb.RAM && SSD == nb.SSD && OS.equals(nb.OS) && size == nb.size && color.equals(nb.color);
    }

    public Map<String, String> getAllParams () {
        Map<String, String> params = new HashMap<>();

        params.put("price", String.valueOf(price));
        params.put("manufacturer", manufacturer);
        params.put("RAM", String.valueOf(RAM));
        params.put("SSD", String.valueOf(SSD));
        params.put("OS", OS);
        params.put("size", String.valueOf(size));
        params.put("color", color);
        
        return params;
    }


    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getSSD() {
        return SSD;
    }

    public void setSSD(int SSD) {
        this.SSD = SSD;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

}    