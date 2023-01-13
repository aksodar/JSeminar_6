package ru.gb.jseminar;

public class Notebook {
    String brand;
    String model;
    String category;
    Double price;
    String processor;
    String graphicCard;
    Integer ram;
    Integer hdd;
    Integer ssd;
    String os;
    Double displaySize;
    Double weight;
    Double[] dimensions;
    String colour;
  
    Notebook(String brand, String model, String cat,Double price, String proc,String graph,int ram,int hdd,int ssd,String os,Double display,Double weight,String colour) {
     this.brand =brand;
     this.model =model;
     this.category =cat;
     this.price =price;
     this.processor=proc;
     this.graphicCard =graph;
     this.ram= ram;
     this.hdd=hdd;
     this.ssd =ssd;
     this.os=os;
     this.weight =weight;
     this.colour=colour;
 }
}
