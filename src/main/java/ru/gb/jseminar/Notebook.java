package ru.gb.jseminar;

public class Notebook {
    String name;
    String system;
    Integer memory;
    String colour;
    Float sizescreen;
    Integer price;

    Notebook(String nm, String syst, Integer mem, String clr, Float sizescr, Integer pr) {
        name = nm;
        system = syst;
        memory = mem;
        colour = clr;
        sizescreen = sizescr;
        price = pr;
    }

    @Override
    public String toString() {
        String str;
        str = "###############################\n" + name + "\n" + system + "\n" + memory + "\n" + colour + "\n" + sizescreen.toString() + "\n" + price + "\n";
        return str;
    }
}
