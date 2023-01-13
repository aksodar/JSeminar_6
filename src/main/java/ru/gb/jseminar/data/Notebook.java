package ru.gb.jseminar.data;

public class Notebook {
    Integer id;
    String model;
    Float displaySize;
    Float cpuType;
    Float ssdSize;
    String color;
    Float price;

    public Notebook(Integer id, String m, Float d, Float cpu, Float ssd, String c, Float p) {
        this.id = id;
        this.model = m;
        this.displaySize = d;
        this.cpuType = cpu;
        this.ssdSize = ssd;
        this.color = c;
        this.price = p;
    }

    public Float getDisplaySize() {
        return displaySize;
    }
    public Float getCpuType() {
        return cpuType;
    }
    public Float getSSDSize() {
        return ssdSize;
    }
    public String getColor() {
        return color;
    }
    public Float getPrice() {
        return price;
    }

    @Override
    public String toString() {
        String laptop = "\n"+"====================================\n"+"ID:            "+id+"\n"+"Model:         "+model+"\n"+"Display size:  "+displaySize+"\n"+"CPU type:      "+cpuType+"\n"+"SSD type:      "+ssdSize+"\n"+"Color:         "+color+"\n"+"Price (RUB):   "+price;
        return laptop;
    }
}