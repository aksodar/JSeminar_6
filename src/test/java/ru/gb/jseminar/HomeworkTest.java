package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HomeworkTest {
    Homework homework;
    Map<String, String> map;
    @BeforeEach
    void setUp() {
        homework = new Homework();
        map = new HashMap<>();
    }

    @Test
    void filterSuccessful() {
        List<Notebook> list = new ArrayList<>();
        list.add(new Notebook(0,0,0,0,2,85930,16,512));
        list.add(new Notebook(2,1,1,1,0,78583,8,512));
        list.add(new Notebook(1,0,2,2,2,168583,32,1024));

        map.put("CPU","INTEL");
        map.put("OS","WINDOWS11");
        map.put("STORAGE","1024");

        List<Notebook> expected = new ArrayList<>();
        expected.add(new Notebook(1,0,2,2,2,168583,32,1024));

        List<Notebook> actual = homework.filter(map, list);

        Assertions.assertEquals(expected, actual);
    }
}