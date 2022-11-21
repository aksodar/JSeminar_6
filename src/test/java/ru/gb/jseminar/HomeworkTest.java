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
    void filterSuccessfull() {
        List<Notebook> notebooks = new ArrayList<>();
        Notebook n1 = new Notebook("Msi", 4, 1024, "Windows", "White");
        Notebook n2 = new Notebook("Asus", 4, 1024, "Windows", "Gray");
        Notebook n3 = new Notebook("Hp", 8, 256, "Linux", "Silver");
        Notebook n4 = new Notebook("Acer", 16, 512, "MacOs", "Gold");
        notebooks.add(n1);
        notebooks.add(n2);
        notebooks.add(n3);
        notebooks.add(n4);
        Map<String, String> params = new HashMap<>();
        params.put("RAM", "4");
        params.put("HDD", "1024");

        List<Notebook> expected = new ArrayList<>();
        expected.add(n1);
        expected.add(n2);

        Homework hw = new Homework();
        List<Notebook> actual = hw.filter(params, notebooks);

        Assertions.assertIterableEquals(expected, actual);
        ;
    }
}