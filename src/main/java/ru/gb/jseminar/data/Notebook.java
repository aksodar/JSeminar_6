package ru.gb.jseminar.data;

public class Notebook {
    private String manufacturer;
    private int RAM;    // RAM size in GB
    private int SSD;    // SSD size in GB
    private String OS;     // installed OS
    private int size;   // in inch
    private String color;
    private int price;  // price in rub

    public Notebook (String manufacturer, int ram, int ssd, String os, int size, String color, int price) {
        this.manufacturer = manufacturer;
        this.RAM = ram;
        this.SSD = ssd;
        this.OS = os;
        this.size = size;
        this.color = color;
        this.price = price;
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
}
