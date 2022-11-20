package ru.gb.jseminar.data;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Notebook {
    private String model;
    private int diagonal;
    private String videoCard;
    private String hardDrive;
    private String OperatingSystem;
    private String color;

    public Notebook (String string, int i, String string2, String string3, String string4, String string5) {
        this.model = model;
        this.diagonal = diagonal;
        this.videoCard = videoCard;
        this.hardDrive = hardDrive;
        this.color = color;
        this.OperatingSystem = OperatingSystem;

    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(Integer diagonal) {
        this.diagonal = diagonal;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getVideoCard() {
        return videoCard;
    }

    public void setVideoCard(String videoCard) {
        this.videoCard = videoCard;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public void setHardDrive(String hardDrive) {
        this.hardDrive = hardDrive;
    }

    public String getOperatingSystem() {
        return OperatingSystem;
    }

    public void setOperatingSystem(String OperatingSystem) {
        this.OperatingSystem = OperatingSystem;
    }
    
    
    @Override
    public String toString() {        
        return "Notebook:" + "model - " + model+"; diagonal - "+diagonal+"; videoCard - "+videoCard+"; hardDrive = "+hardDrive+"; color - "+color+"; OperatingSystem -"+OperatingSystem;
    }

    
}
