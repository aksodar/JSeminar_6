package ru.gb.jseminar.data;

public class Notebook {
    Integer id;
    String model;
    Float displayDiagonal;
    Float frequencyCpu;
    Float diskSize;
    String color;

    public Notebook(Integer Id, String Model, Float DisplayDiagonal, Float FrequencyCpu, Float DiskSize, String Color) {
        this.id = Id;
        this.model = Model;
        this.displayDiagonal = DisplayDiagonal;
        this.frequencyCpu = FrequencyCpu;
        this.diskSize = DiskSize;
        this.color = Color;
    }
    public Float getDisplayDiagonal() {
        return displayDiagonal;
    }
    public Float getFrequencyCpu() {
        return frequencyCpu;
    }
    public Float getDiskSize() {
        return diskSize;
    }
    public String getColor() {
        return color;
    }
    @Override
    public String toString() {
        return "_".repeat(25) +
                "\nМодель: " + model + ", Цвет: " + color +
                "\nДиагональ дисплея: " + displayDiagonal + "\"" +
                ", Частота ЦП: " + frequencyCpu + "ГГц" + ", Объём диска: " + diskSize + "Гб" + "\n";
    }
}
