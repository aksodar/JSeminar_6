package ru.gb.jseminar.data.Notebook;

import ru.gb.jseminar.data.Notebook.Properties.*;
import ru.gb.jseminar.data.ProductFactory;
import ru.gb.jseminar.data.Notebook.Properties.Property;

public class NotebookFactory implements ProductFactory {

    @Override
    public Property getProperty(PropertiesConfig prop) {
        switch (prop) {

            case PRICE:
                return new Price();
            case MODEL:
                return new Model();
            case COLOR:
                return new Color();
            case CPU:
                return new Cpu();
            case RAM:
                return new Ram();
            case STORAGE:
                return new Storage();
            case GPU:
                return new Gpu();
            case OS:
                return new Os();
            default:
                return null;
        }
    }
}
