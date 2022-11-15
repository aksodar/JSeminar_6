package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HomeworkTest {

    @Test
    void filterSuccessful() {
        Map<String, String> inputMap = new HashMap<>();
        inputMap.put("RAM", "16");
        inputMap.put("SSD", "1024");
        inputMap.put("size", "15");
        inputMap.put("color", "black");

        List<Notebook> inputList = new ArrayList<>();
        inputList.add(new Notebook("Acer", 8, 512, "Ubuntu", 15, "black", 60000));
        inputList.add(new Notebook("Asus", 16, 1024, "Windows", 15, "black", 100000));
        inputList.add(new Notebook("Lenovo", 16, 1024, "Windows", 15, "black", 95000));
        inputList.add(new Notebook("MSI", 16, 1024, "Windows", 14, "white", 90000));

        List<Notebook> expectedList = new ArrayList<>();
        expectedList.add(new Notebook("Asus", 16, 1024, "Windows", 15, "black", 100000));
        expectedList.add(new Notebook("Lenovo", 16, 1024, "Windows", 15, "black", 95000));

        List<Notebook> actualList = (new Homework()).filter(inputMap, inputList);

        Assertions.assertIterableEquals(expectedList, actualList);
    }
}