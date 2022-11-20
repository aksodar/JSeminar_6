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
        expected.add(new Notebook("8", "1000","1500$","Acer"));
        expected.add(new Notebook("4", "500","2100$","Acer"));


        Homework homework = new Homework();
        List<Notebook>n1=new ArrayList<>();
        n1.add(new Notebook("8", "500","1000$","ASUS"));
        n1.add(new Notebook("8", "1000","1500$","Acer"));
        n1.add(new Notebook("16", "500","2000$","MacBook"));
        n1.add(new Notebook("4", "1000","1400$","HP"));
        n1.add(new Notebook("4", "500","2100$","Acer"));
        n1.add(new Notebook("8", "1000","1900$","HP"));
        n1.add(new Notebook("8", "500","1800$","Lenovo"));
        n1.add(new Notebook("16", "1000","2300$","HP"));
        n1.add(new Notebook("16", "2000","2500$","MacBook"));
        n1.add(new Notebook("8", "500","1100$","ASUS"));
        List<Notebook>actual;
        Map<String,String> map=new HashMap<>();
        map.put("brand","Acer");
        actual = homework.filter(map,n1);

        Assertions.assertIterableEquals(expected,actual);

    }
}