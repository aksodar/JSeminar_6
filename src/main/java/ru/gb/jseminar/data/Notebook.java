package ru.gb.jseminar.data;

public class Notebook {
    private String processor;
    private String color;
    private String software;
    private Double screen;
    private Integer memory;
    private Integer hard;
    private Double price;
    private Integer quantity;

    public Notebook() {
        processor = null;
        color = null;
        software = null;
        screen = null;
        memory = null;
        hard = null;
        price = null;
        quantity = 0;
    }

    public Notebook(String processor, String color, String software, Double screen, Integer memory, Integer hard,
            Double price) {
        this.processor = processor;
        this.color = color;
        this.software = software;
        this.screen = screen;
        this.memory = memory;
        this.hard = hard;
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

    public String getSoftware() {
        return software;
    }

    public Double getScreen() {
        return screen;
    }

    public Integer getMemory() {
        return memory;
    }

    public Integer getHard() {
        return hard;
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
        return "\n--------------------->\n" + processor + "\n" + color + "\n" + software + "\n" + screen + "\"\n"
                + memory + "GB\n"
                + hard + "GB\n"
                + price
                + "rub";
    }

    @Override
    public boolean equals(Object obj) {
        Notebook objToCompare = (Notebook) obj;
        return this.processor.equals(objToCompare.processor) && this.color.equals(objToCompare.color)
                && this.software.equals(objToCompare.software) && this.screen.equals(objToCompare.screen)
                && this.memory.equals(objToCompare.memory) && this.hard.equals(objToCompare.hard)
                && this.price.equals(objToCompare.price);
    }

    @Override
    public int hashCode() {
        return price.intValue() * screen.intValue() * memory * hard * color.length() * processor.length()
                * software.length();
    }
}
