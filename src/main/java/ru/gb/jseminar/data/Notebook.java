package ru.gb.jseminar.data;

public class Notebook {
    private String model;
    private int ram;
    private String OS;
    private String color;
    private int diagonal;

    public Notebook(String model, int ram, String OS, String color, int diagonal){
        this.model = model;
        this.ram = ram;
        this.OS = OS;
        this.color = color;
        this.diagonal = diagonal;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model){
        this.model = model;
    }

    public int getRam(){
        return ram;
    }

    public void setRam(int ram){
        this.ram = ram;
    }

    public String getOs(){
        return OS;
    }

    public void setOs(String OS){
        this.OS = OS;
    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
        this.color = color;
    }

    public int getDiagonal(){
        return diagonal;
    }

    public void setDiagonal(int diagonal){
        this.diagonal = diagonal;
    }

    //public String get(String disgonal) {
    //    return disgonal;
    //}

    public String toString(){
        return String.format("model:'%s' ram:'%d' OS:'%s' color:'%s' diagonal:'%d'", model, ram, OS, color, diagonal);
    }
}
