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
        Homework h1 = new Homework();
        Notebook n1 = new Notebook(10000, "Acer Aspire", 111, 1, "black", 1, "DOS");
        Notebook n2 = new Notebook(20000, "ASUS VivoBook", 222, 2, "black", 2, "Windows");
        Notebook n3 = new Notebook(30000, "ASUS VivoBookOled", 333, 2, "black", 2, "Windows");
        List<Notebook> expectedList = new ArrayList<>();
        expectedList.add(n1);
        expectedList.add(n2);
        expectedList.add(n3);

        Map<String , Integer > expectedMap = new HashMap<>();
        expectedMap.put("price", 10000);
        expectedMap.put("ram", 1);
        expectedMap.put("hd", 1);

        List<String> expectedResultList = new ArrayList<>();
        expectedResultList.add("Acer Aspire");

        List<String> actualResultList = h1.filter(expectedMap, expectedList);
        Assertions.assertEquals(expectedResultList, actualResultList);

    }
}