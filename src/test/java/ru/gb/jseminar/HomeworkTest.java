package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.Notebook;

import java.util.*;

class HomeworkTest {

    @Test
    void filter() {

        Notebook notebook1 = new Notebook("Asus", 112356, "black", 1000, 4, "Windows", 150000);
        Notebook notebook2 = new Notebook("Acer", 00236, "silver", 100, 16, "Windows", 125000);
        Notebook notebook3 = new Notebook("HP", 11350, "silver", 500, 8, "Windows", 100000);

        List<Notebook> notebooks = new ArrayList<>(Arrays.asList(notebook1, notebook2, notebook3));

        Map<String, String> params = new HashMap<>();
        //params.put("OS", "Windows");
        //params.put("color", "silver");

        List<Notebook> expected = new ArrayList<>();
        expected.add(notebook1);
        expected.add(notebook2);
        expected.add(notebook3);

        Homework hmw = new Homework();
        List<Notebook> actual = hmw.filter(params, notebooks);

        Assertions.assertEquals(expected, actual);
    }
}