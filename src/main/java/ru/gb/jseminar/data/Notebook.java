package ru.gb.jseminar.data;

import java.util.Objects;

public class Notebook {
    private final Model model;
    private final Color color;
    private final OS os;
    private final CPU cpu;
    private final Integer ram;
    private final Integer memory;
    private final Double cost;

    /**
     * Constructor for notebook
     * @param ram Gb
     * @param memory Tb
     * @param cost RUB
     */
    public Notebook(Model model, Color color, OS os, CPU cpu, Integer ram, Integer memory, Double cost) {
        this.model = model;
        this.color = color;
        this.os = os;
        this.cpu = cpu;
        this.ram = ram;
        this.memory = memory;
        this.cost = cost;
    }

    public Model getModel() {
        return model;
    }

    public Color getColor() {
        return color;
    }

    public OS getOs() {
        return os;
    }

    public CPU getCpu() {
        return cpu;
    }

    public String getRam() {
        return String.valueOf(ram);
    }

    public String getMemory() {
        return String.valueOf(memory);
    }

    @Override
    public String toString() {
        return "Notebook " + '{' +
                "model=" + model +
                ", color=" + color +
                ", os=" + os +
                ", cpu=" + cpu +
                ", ram=" + ram + "Gb" +
                ", memory=" + memory + "Tb" +
                ", cost=" + String.format("%.2f", cost) + "RUB" +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return model == notebook.model &&
                color == notebook.color &&
                os == notebook.os &&
                cpu == notebook.cpu &&
                Objects.equals(ram, notebook.ram) &&
                Objects.equals(memory, notebook.memory) &&
                Objects.equals(cost, notebook.cost);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, color, os, cpu, ram, memory, cost);
    }
}
