package ru.gb.jseminar.data;

public class Notebook {

    private int id;
    private String name;
    private String model;
    private String typeOS;
    private int valueRAM;
    private String color;
    private String typeMemory;
    private String valueOfMemory;
    private double costRUB;
    private boolean gameType;

    public Notebook(int id, String name, String model, String typeOS, int valueRAM, 
            String color, String typeMemory, String valueOfMemory, double costRUB, boolean gameType) {
        this.id = id;      
        this.name = name;
        this.model = model;
        this.typeOS = typeOS; 
        this.valueRAM = valueRAM;
        this.color = color;
        this.typeMemory = typeMemory;
        this.valueOfMemory = valueOfMemory;
        this.costRUB = costRUB;
        this.gameType = gameType;
    }

    @Override
		public String toString() {
				return String.format("id-%d %s %s (OS:%s, RAM:%d GB, color:%s, %s:%s, price:%.2f RUB, gameType:%s)\n", id, name, model, typeOS, valueRAM, color, typeMemory, valueOfMemory, costRUB, gameType);
		}
    
}
