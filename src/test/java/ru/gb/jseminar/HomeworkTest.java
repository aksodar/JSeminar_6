package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class HomeworkTest {
    @Test
    void filter(){
        List<Notebook> notebooks = new ArrayList<>();
        Notebook notebook1 = new Notebook("APPLE", 12345, "black", 900, 16, "MacOS", 150000);
        Notebook notebook2 = new Notebook("DELL", 67890, "silver", 950, 16, "Windows", 125000);
        Notebook notebook3 = new Notebook("HP", 13570, "silver", 750, 8, "Windows", 100000);
        notebooks.add(notebook1);
        notebooks.add(notebook2);
        notebooks.add(notebook3);

        Map<String, String> params = new HashMap<>();
        params.put("OS", "Windows");
        params.put("color", "silver");

        List<Notebook> expected = new ArrayList<>();
        expected.add(notebook2);
        expected.add(notebook3);

        Homework hmw = new Homework();
        List<Notebook> actual = hmw.filter(params, notebooks);
        
        Assertions.assertEquals(expected, actual);
    }
}