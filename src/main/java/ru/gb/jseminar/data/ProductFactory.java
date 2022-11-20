package ru.gb.jseminar.data;

import ru.gb.jseminar.data.Notebook.Properties.Property;
import ru.gb.jseminar.data.Notebook.PropertiesConfig;

public interface ProductFactory {
    Property getProperty(PropertiesConfig prop);
}
