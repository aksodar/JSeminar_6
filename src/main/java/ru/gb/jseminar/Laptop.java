package ru.gb.jseminar;

class Laptop {
    private Integer id;
    private String system;
    private String model;
    private Integer ram;
    private Integer memory;

    Laptop(int id, String model, String sys, int ram, int memory) {
        this.id = id;
        this.system = sys;
        this.model = model;
        this.ram = ram;
        this.memory = memory;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSystem() {
        return system;
    }

    public void setSystem(String system) {
        this.system = system;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getRam() {
        return ram;
    }

    public void setRam(Integer ram) {
        this.ram = ram;
    }

    public Integer getMemory() {
        return memory;
    }

    public void setMemory(Integer memory) {
        this.memory = memory;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", system='" + system + '\'' +
                ", model='" + model + '\'' +
                ", ram=" + ram + "Gb" +
                ", memory=" + memory + "Gb" +
                '}';
    }
}