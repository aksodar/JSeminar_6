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

        Map<String, String> searchMap = new HashMap<>();
        searchMap.put("os", "Windows");

        List<Notebook> nbLst = new ArrayList<>();
        Notebook nb1 = new Notebook("Asus TUF Gaming FX506LB", "Windows", 8, 512, "Intel Core i5 10300H", 15.6, "black", 68669);
        Notebook nb2 = new Notebook("Apple MacBook Air 13", "MacOS", 8, 256, "Apple M1", 13.3, "gray", 72280);
        Notebook nb3 = new Notebook("Lenovo IdeaPad 317ADA05", "no OS", 8, 256, "AMD Athlon Gold 3150U", 17.3, "gray", 35999);
        Notebook nb4 = new Notebook("HIPER Workbook A1568K1135WI", "Windows", 8, 512, "Intel Core i5 1135G7", 15.6, "black", 42489);
        nbLst.add(nb1);
        nbLst.add(nb2);
        nbLst.add(nb3);
        nbLst.add(nb4);

        List<Notebook> expectedLst = new ArrayList<>();
        expectedLst.add(nb1);
        expectedLst.add(nb4);

        Homework hw = new Homework();
        List<Notebook> actualLst = hw.filter(searchMap, nbLst);

        Assertions.assertIterableEquals(expectedLst, actualLst);

    }
}