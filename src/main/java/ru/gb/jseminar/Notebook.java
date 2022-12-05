package ru.gb.jseminar;

public class Notebook {
    String name;
    int model;
    String operatingSystem;
    String color;
    int ozu;
    int valueZhD;
    int price;
    
    public Notebook(String name, int model, int price, String color, String operatingSystem,int ozu, int valueZHD) {
        this.name = name;
        this.price = price;
        this.model = model;
        this.operatingSystem = operatingSystem;
        this.color = color;
        this.ozu = ozu;
        this.valueZhD = valueZHD;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getModel() {
        return model;
    }
    public void setModel(int model) {
        this.model = model;
    }

    public String getOperatingSystem() {
        return operatingSystem;
    }
    
    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getOzu() {
        return ozu;
    }
    public void setOzu(int ozu) {
        this.ozu = ozu;
    }

    public int getValueZhD() {
        return valueZhD;
    }
    public void setValueZhD(int valueZhD) {
        this.valueZhD = valueZhD;
    }

    @Override
    public String toString() {
        return String.format("%s, %d, %d, %s, %s, %d, %d", name, price, model, operatingSystem, color, ozu, valueZhD);
    }


}