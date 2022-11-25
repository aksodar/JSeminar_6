package ru.gb.jseminar.data;

public class Notebook {
    private String brand;
    private int ram;
    private char os;
    private String vCard;
    private int cost;

    public Notebook(String brand, int ram, char os, String vCard, int cost) {
        this.brand = brand;
        this.ram = ram;
        this.os = os;
        this.vCard = vCard;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public char getOs() {
        return os;
    }

    public void setOs(char os) {
        this.os = os;
    }

    public String getvCard() {
        return vCard;
    }

    public void setvCard(String vCard) {
        this.vCard = vCard;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "brand='" + brand + '\'' +
                ", ram=" + ram +
                ", os=" + os +
                ", vCard='" + vCard + '\'' +
                ", cost=" + cost +
                '}';
    }
}