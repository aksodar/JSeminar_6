package ru.gb.jseminar.data;

import java.util.ArrayList;
import java.util.List;

public class Notebook {
    private String brand;
    private int ram;
    private int hdd;
    private String os;
    private String color;

    public Notebook(String brand) {
        this.brand = brand;
    }

    public Notebook(String brand, int ram, int hdd, String os, String color) {
        this.brand = brand;
        this.ram = ram;
        this.hdd = hdd;
        this.os = os;
        this.color = color;
    }

    @Override
    public String toString() {
        return String
                .valueOf("|Brand: " + this.brand + " | RAM: " + this.ram + " | HDD: " + this.hdd + " | OS: " + this.os
                        + " | Color: " + this.color + " |");
    }

    public String toString(String delimiter) {
        return String.valueOf(
                this.brand + delimiter + this.ram + delimiter + this.hdd + delimiter + this.os + delimiter
                        + this.color);
    }

    public List<String> getListOfValues() {
        List<String> result = new ArrayList<>();
        result.add(this.brand);
        result.add(String.valueOf(this.ram));
        result.add(String.valueOf(this.hdd));
        result.add(this.os);
        result.add(this.color);
        return result;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(final String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(final int ram) {
        this.ram = ram;
    }

    public int getHdd() {
        return hdd;
    }

    public void setHdd(final int hdd) {
        this.hdd = hdd;
    }

    public String getOs() {
        return os;
    }

    public void setOs(final String os) {
        this.os = os;
    }

    public String getColor() {
        return color;
    }

    public void setColor(final String color) {
        this.color = color;
    }
}
