package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.gb.jseminar.data.Notebook;

class HomeworkTest {
    @Test
    void filterSuccessful() {
        Map<String, String> searchInfo = new HashMap<>();
        searchInfo.put("RAM", "16");
        searchInfo.put("SSD", "256");
        searchInfo.put("OS", "Windows");
        searchInfo.put("price", "700");

        List<Notebook> listOfnotebooks = new ArrayList<>();
        listOfnotebooks.add(new Notebook("MSI", 8, 126, "Linux", "Intel", 600));
        listOfnotebooks.add(new Notebook("Huawei", 16, 256, "Windows", "Intel", 700));
        listOfnotebooks.add(new Notebook("Xiaomi", 8, 256, "Linux", "NVidia", 1900));
        listOfnotebooks.add(new Notebook("Asus", 8, 512, "Windows", "AMD", 750));
        listOfnotebooks.add(new Notebook("Intel", 8, 256, "Windows", "Intel", 850));

        List<Notebook> expectOfNotebooks = new ArrayList<>();
        expectOfNotebooks.add(new Notebook("Huawei", 16, 256, "Windows", "Intel", 700));
        List<Notebook> actualListOfNotebooks = (new Homework()).filter(searchInfo, expectOfNotebooks);

        Assertions.assertIterableEquals(expectOfNotebooks, actualListOfNotebooks);
    }

}