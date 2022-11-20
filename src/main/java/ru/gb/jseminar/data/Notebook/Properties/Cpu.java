package ru.gb.jseminar.data.Notebook.Properties;

import java.util.Random;

public class Cpu implements Property {
    public enum Config{
        INTEL,
        AMD
    }
    private Config value;

    @Override
    public void init(int value) { this.value = Config.values()[value]; }
    @Override
    public void randInit() {
        Random random = new Random();
        this.value = Config.values()[random.nextInt(Config.values().length)];
    }
    @Override
    public String toString() { return  "Процессно: " + this.value.name(); }
    @Override
    public void setValue(int value) { this.value = Config.values()[value]; }
    @Override
    public String getValue() { return this.value.name(); }
}
