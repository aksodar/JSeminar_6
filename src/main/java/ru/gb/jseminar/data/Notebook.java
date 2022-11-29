package ru.gb.jseminar.data;

public class Notebook {
    private String model;
    private int ram;
    private String color;
    private String oS;
    private int diagonal;

    public Notebook(String model, int ram, String color, String oS, int diagonal) {
        this.model = model;
        this.ram = ram;
        this.color = color;
        this.oS = oS;
        this.diagonal = diagonal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
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

    public String getoS() {
        return oS;
    }

    public void setoS(String oS) {
        this.oS = oS;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public String get(String disgonal) {
        return disgonal;
    }
    public String toString() {
        return String.format("model:'%s' ram:%d color:'%s' oS:'%s' diagonal:%d", model, ram, color, oS, diagonal);
    }
}
