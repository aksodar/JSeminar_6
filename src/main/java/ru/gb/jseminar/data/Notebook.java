package ru.gb.jseminar.data;

public class Notebook {
    private int cost;
    private String name;
    private String model;
    private int RAM;
    private int HDD;
    private String OS;
    private String color;

    public Notebook(int cost, String name, String model, int RAM, int HDD, String OS, String color) {
        this.cost = cost;
        this.name = name;
        this.model = model;
        this.RAM = RAM;
        this.HDD = HDD;
        this.OS = OS;
        this.color = color;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getHDD() {
        return HDD;
    }

    public void setHDD(int HDD) {
        this.HDD = HDD;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this){
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()){
            return false;
        }
        Notebook newNotebook = (Notebook) obj;
        return cost == newNotebook.cost
                && name == newNotebook.name
                && model == newNotebook.model
                && RAM == newNotebook.RAM
                && HDD == newNotebook.HDD
                && OS == newNotebook.OS
                && color == newNotebook.color;
    }
}
