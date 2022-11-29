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
    void filterTest() {
        List<Notebook> notebooksTest = new ArrayList<>();
        Notebook product1 = new Notebook("Dell", 16, "black", "Windows", 17);
        Notebook product2 = new Notebook("Apple", 16, "silver", "macOS", 16);
        notebooksTest.add(product1);
        notebooksTest.add(product2);


        Map<String, String> filterMapTest = new HashMap<>();
        filterMapTest.put("color", "silver");

        Homework homework = new Homework();
        List<Notebook> actual = homework.filter(filterMapTest, notebooksTest);
        List<Notebook> expected = new ArrayList<>();
        expected.add(product2);

        Assertions.assertIterableEquals(expected,actual);
    }
}