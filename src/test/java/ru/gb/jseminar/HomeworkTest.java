package ru.gb.jseminar;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import ru.gb.jseminar.data.Notebook;

class HomeworkTest {

    Homework hw = new Homework();

    @Test
    void filterTest() {
        Notebook noteb1 = new Notebook(1, "abc", "111", null, 1, null, null, null, 222.00, false);
        Notebook noteb2 = new Notebook(2, "cdb", "111", null, 1, null, null, null, 222.00, false);
        Notebook noteb3 = new Notebook(0, null, null, null, 0, null, null, null, 0, false);

        Map<String, String> map = new HashMap<>();
        map.put("model", "111");
        map.put("name", "abc");
        List<Notebook> list = new ArrayList<>();
        list.add(noteb1);
        list.add(noteb2);
        list.add(noteb3);

        List<Notebook> expList = new ArrayList<>();
        expList.add(noteb1);

        List<Notebook> actList = hw.filter(map, list);
        Assertions.assertEquals(expList, actList);
    }

}