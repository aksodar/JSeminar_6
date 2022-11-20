package ru.gb.jseminar.data;

import java.util.Objects;

public class Notebook {
    private String ram, hdd, cost, brand;
    public Notebook(String ramValue, String hddValue, String costValue, String brandValue){
        this.ram = ramValue;
        this.hdd = hddValue;
        this.cost = costValue;
        this.brand = brandValue;
    }
    public String getRam() {
        return ram;
    }

    public String getHdd() {
        return hdd;
    }

    public String getCost() {
        return cost;
    }

    public String getBrand() {
        return brand;
    }

    public void setRam(String ram) {
        this.ram = ram;
    }

    public void setHdd(String hhd) {
        this.hdd = hhd;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "ram='" + ram + '\'' +
                ", HDD='" + hdd + '\'' +
                ", Cost='" + cost + '\'' +
                ", Brand='" + brand + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(ram, notebook.ram) && Objects.equals(hdd, notebook.hdd) && Objects.equals(cost, notebook.cost) && Objects.equals(brand, notebook.brand);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ram, hdd, cost, brand);
    }
}