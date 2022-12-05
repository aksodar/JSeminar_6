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
    void filterTest(){
       List<Notebook> notebookTest = new ArrayList<>();
       Notebook n1 = new Notebook("Asus", 12, "Linux", "blue", 14);
       Notebook n2 = new Notebook("DELL", 16, "Windows", "red", 16);
       notebookTest.add(n1);
       notebookTest.add(n2);

       Map<String, String> mapFilterTest = new HashMap<>();
       mapFilterTest.put("color", "blue");

       Homework homework = new Homework();
       List<Notebook> actual = homework.filter(mapFilterTest, notebookTest);
       List<Notebook> expected = new ArrayList<>();
       expected.add(n1);

       Assertions.assertIterableEquals(expected, actual);
    }
}