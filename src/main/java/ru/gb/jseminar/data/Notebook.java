package ru.gb.jseminar.data;

public class Notebook {
    private int price;
    private String model;
    private int id;
    private int ram;
    private String color;
    private int hd;
    private String os;

    public Notebook(int price, String model, int id, int ram, String color, int hd, String os) {
        this.price = price;
        this.model = model;
        this.id = id;
        this.ram = ram;
        this.color = color;
        this.hd = hd;
        this.os = os;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHd() {
        return hd;
    }

    public void setHd(int hd) {
        this.hd = hd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }
}