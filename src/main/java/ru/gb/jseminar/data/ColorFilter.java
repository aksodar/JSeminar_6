package ru.gb.jseminar.data;

public class ColorFilter implements Filter {

    public String color;

    public ColorFilter(String color) {
        this.color = color;
    }

    @Override
    public boolean Check(Notebook notebook) {
        return notebook.color.equals(this.color);
    }
}
