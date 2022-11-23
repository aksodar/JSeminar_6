package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import ru.gb.jseminar.data.Notebook;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class HomeworkTest {

    @org.junit.jupiter.api.Test
    void filterSucces() {
        List<Notebook> notebooks = new ArrayList<>();
        Map<String, Object> filterMap = new HashMap<>();
        filterMap.put("name","apple");
        filterMap.put("ram",1024);
        notebooks.add(new Notebook(17000,"s2506","ASUS",2048,"Windows"));
        notebooks.add(new Notebook(25000,"macbookPro","apple",2048,"macOS"));
        notebooks.add(new Notebook(20000,"macbookAir","apple",1024,"macOS"));

        List<Notebook> expect = new ArrayList<>();
        expect.add(new Notebook(20000,"macbookAir","apple",1024,"macOS"));


        Homework hw = new Homework();
        List<Notebook> actual = hw.filter(filterMap,notebooks);

        Assertions.assertEquals(expect.toString(),actual.toString());

    }
}
