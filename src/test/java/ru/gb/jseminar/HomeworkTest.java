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
    void filterText() {
        List<Notebook>expected = new ArrayList<>();
        expected.add(new Notebook("2", "1000","windows","blue"));
        expected.add(new Notebook("16", "2000","windows","blue"));


        Homework homework = new Homework();
        List<Notebook>n1=new ArrayList<>();
        n1.add(new Notebook("4", "500","windows","black"));
        n1.add(new Notebook("8", "1000","MacOs","white"));
        n1.add(new Notebook("16", "500","linux","black"));
        n1.add(new Notebook("2", "1000","windows","blue"));
        n1.add(new Notebook("1", "500","MacOs","yellow"));
        n1.add(new Notebook("8", "500","windows","black"));
        n1.add(new Notebook("8", "216","MacOs","red"));
        n1.add(new Notebook("4", "1000","linux","white"));
        n1.add(new Notebook("16", "2000","windows","blue"));
        n1.add(new Notebook("8", "500","MacOs","green"));
        List<Notebook>actual;
        Map<String,String> map=new HashMap<>();
        map.put("color","blue");
        actual = homework.filter(map,n1);

        Assertions.assertIterableEquals(expected,actual);

    }
}