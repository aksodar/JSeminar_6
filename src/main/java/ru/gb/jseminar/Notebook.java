package ru.gb.jseminar;

class Notebook {
    String name;
    Integer ram;
   Integer ssd;
    String os;
    String color;

    Notebook() {
        name = null;
        ram = null;
        ssd = null;
        os = null;
        color = null;
    }

     Notebook(String n, Integer r, Integer s,String o, String c) {
        this.name = n;
        this.ram = r;
        this.ssd = s;
        this.color = c;
        this.os = o;
    }
    @Override
    public String toString() {

        String str = "============================================================\n" + "Brand: " + this.name + "| RAM: " + this.ram + "| SSD: " + this.ssd + "| OS: " + this.os + "| Color: " + this.color;
        return str;
    }
}