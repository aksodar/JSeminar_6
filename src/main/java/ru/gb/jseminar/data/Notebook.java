package ru.gb.jseminar.data;

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
        return "Notebook " + " {" +
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
