package ru.gb.jseminar.data;

public class Notebook {
    private String brand;
    private int model;
    private String color;
    private int hardDiskSize;
    private int RAM;
    private String OS;
    private int price;

    public Notebook(String brand, int model, String color, int hardDiskSize, int RAM, String OS, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.hardDiskSize = hardDiskSize;
        this.RAM = RAM;
        this.OS = OS;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHardDiskSize() {
        return hardDiskSize;
    }

    public void setHardDiskSize(int hardDiskSize) {
        this.hardDiskSize = hardDiskSize;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", model=" + model +
                ", color='" + color + '\'' +
                ", hardDiskSize=" + hardDiskSize +
                ", RAM=" + RAM +
                ", OS='" + OS + '\'' +
                ", price=" + price +
                '}';
    }
}