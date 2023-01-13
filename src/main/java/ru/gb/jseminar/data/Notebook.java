package ru.gb.jseminar.data;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Notebook {


     String brand;
     String model;
     Integer ssdSize;
     Integer ramSize;
     String os;
     String color;
     Integer price;

    @Override
    public String toString() {
        String str;
        str = "============================\n" + brand + " " + model + "\n" + ssdSize + "Gb\n" + ramSize + "Gb\n" +
                os + "\n" + color + "\n" + price + "rub" + "\n";
        return str;
    }

    public Notebook(String brand, String model, Integer ssdSize, Integer ramSize, String os, String color, Integer price) {
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.os = os;
        this.ramSize = ramSize;
        this.ssdSize = ssdSize;
        this.model = model;
    }

    public  Map<String, Object> paramNotebook() {
//        Scanner scanner = new Scanner(System.in);
        Map<String, Object> param = new HashMap<>();
        param.put("brand", brand);
        param.put("model", model);
        param.put("os", os);

        param.put("ram", ramSize.toString());
        param.put("ssd", ssdSize.toString());
        param.put("color", color);
        param.put("price", price.toString());
        Scanner scanner = new Scanner(System.in);
        return param;
    }
}



