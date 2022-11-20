package ru.gb.jseminar.data.Notebook.Properties;

import java.util.Random;

public class Price implements Property {
    private int value;

    @Override
    public void init(int value) { this.value = value; }
    @Override
    public void randInit() {
        Random random = new Random();
        this.value = 50000 + random.nextInt(100000);
    }
    @Override
    public String toString() { return  "Цена: " + value + " руб"; }
    @Override
    public void setValue(int value) { this.value = value; }
    @Override
    public String getValue() { return Integer.toString(value); }
}
