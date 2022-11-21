package ru.gb.jseminar.data;

public class Notebook {
    private final model model;
    private final color color;
    private final os os;
    private final cpu cpu;
    private final Integer ram;
    private final Integer memory;
    private final Double cost;

    /**
     * Constructor for notebook
     * @param ram Gb
     * @param memory Tb
     * @param cost RUB
     */
    public Notebook(model model, color color, os os, cpu cpu, Integer ram, Integer memory, Double cost) {
        this.model = model;
        this.color = color;
        this.os = os;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.cost = cost;
    }

    public model getModel() {
        return model;
    }

    public color getColor() {
        return color;
    }

    public os getOs() {
        return os;
    }

    public cpu getCpu() {
        return cpu;
    }

    public String getRam() {
        return String.valueOf(ram) + "Gb";
    }

    public String getMemory() {
        return String.valueOf(memory) + "Tb";
    }

    public String getCost() {
        return String.format("%.2f", cost) + "RUB";
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "model=" + model +
                ", color=" + color +
                ", os=" + os +
                ", cpu=" + cpu +
                ", ram=" + ram + "Gb" +
                ", memory=" + memory + "Tb" +
                ", cost=" + String.format("%.2f", cost) + "RUB" +
                '}';
    }
}