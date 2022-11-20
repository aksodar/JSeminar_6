package ru.gb.jseminar.data.Notebook.Properties;

import java.util.Random;

public class Model implements Property {
    public enum Config {
        ELITEBOOK,
        PROBOOK,
        ULTRABOOK
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
    public String toString() { return  "Модель: " + value; }
    @Override
    public void setValue(int value) { this.value = Config.values()[value]; }
    @Override
    public String getValue() { return this.value.name(); }
}
