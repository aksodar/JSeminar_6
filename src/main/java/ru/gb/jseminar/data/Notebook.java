package ru.gb.jseminar.data;

import java.util.Objects;

public class Notebook {
    private String ram,capacityHD,os,color;
    public Notebook(String ramValue,String capacityHDValue,String osValue,String colorValue){
    this.ram=ramValue;
    this.capacityHD=capacityHDValue;
    this.os=osValue;
    this.color=colorValue;
}
    public String getRam() {
        return ram;
    }

    public String getCapacityHD() {
        return capacityHD;
    }

    public String getOs() {
        return os;
    }

    public String getColor() {
        return color;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setCapacityHD(String capacityHD) {
        this.capacityHD = capacityHD;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram='" + ram + '\'' +
                ", capacityHD='" + capacityHD + '\'' +
                ", os='" + os + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(ram, notebook.ram) && Objects.equals(capacityHD, notebook.capacityHD) && Objects.equals(os, notebook.os) && Objects.equals(color, notebook.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, capacityHD, os, color);
    }
}
