package ru.gb.jseminar.data.Notebook.Properties;

import java.util.Random;

public class Storage implements Property {
    private int value;

    @Override
    public void init(int value) { this.value = value; }
    @Override
    public void randInit() {
        Random random = new Random();
        this.value = (random.nextInt(4)+1)*256;
    }
    @Override
    public String toString() { return  "Объем накопителя: " + value + "гб"; }
    @Override
    public void setValue(int value) { this.value = value; }
    @Override
    public String getValue() { return Integer.toString(value); }
}
