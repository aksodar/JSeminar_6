package ru.gb.jseminar.data;

public class Notebook {
    private String processor;
    private String color;
    private Double screen;
    private Integer memory;
    private Integer hardDrive;
    private Double price;
    private Integer quantity;

    public Notebook() {
        processor = null;
        color = null;
        screen = null;
        memory = null;
        hardDrive = null;
        price = null;
        quantity = 0;
    }

    public Notebook(String processor, String color, Double screen, Integer memory, Integer hardDrive, Double price) {
        this.processor = processor;
        this.color = color;
        this.screen = screen;
        this.memory = memory;
        this.hardDrive = hardDrive;
        this.price = price;
        quantity = 0;
    }

    public void setQuantity(Integer quantity) {
        if (quantity > 0) {
            this.quantity = quantity;
        }
    }

    public String getProcessor() {
        return processor;
    }

    public String getColor() {
        return color;
    }

    public Double getScreen() {
        return screen;
    }

    public Integer getMemory() {
        return memory;
    }

    public Integer getHardDrive() {
        return hardDrive;
    }

    public Double getPrice() {
        return price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void decreaseQuantity(Integer decrease) {
        if (decrease > 0 && this.quantity - decrease >= 0) {
            this.quantity = this.quantity - decrease;
        }
    }

    @Override
    public String toString() {
        return "\n--------------------->\n" + processor + "\n" + color + "\n" + screen + "\"\n" + memory + "GB\n"
                + hardDrive + "GB\n"
                + price
                + "rub";
    }

    @Override
    public boolean equals(Object obj) {
        Notebook objToCompare = (Notebook) obj;
        return this.processor.equals(objToCompare.processor) && this.color.equals(objToCompare.color)
                && this.screen.equals(objToCompare.screen) && this.memory.equals(objToCompare.memory)
                && this.hardDrive.equals(objToCompare.hardDrive) && this.price.equals(objToCompare.price);
    }

    @Override
    public int hashCode() {
        return price.intValue() * screen.intValue() * memory * hardDrive * color.length() * processor.length();
    }
}
