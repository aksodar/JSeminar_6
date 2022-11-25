package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.Notebook;

import java.util.*;

class HomeworkTest {
    @Test
    void filterSuccessful() {
        Homework hwTest = new Homework();
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("apple", 16, 'M', "UHD Graphics 630", 150000));
        notebooks.add(new Notebook("acer", 8, 'n', "gtx1050ti", 80000));
        Map<String, String> params = new HashMap<>();
        params.put("os", "M");

        List<Notebook> expected = new ArrayList<>();
        expected.add(new Notebook("apple", 16, 'M', "UHD Graphics 630", 150000));

        List<Notebook> actual = hwTest.filter(params, notebooks);

        Assertions.assertEquals(expected.toString(), actual.toString());

    }

    @Test
    void filterParamsEmpty(){
        Homework hwTest = new Homework();
        List<Notebook> notebooks = new ArrayList<>();
        notebooks.add(new Notebook("apple", 16, 'M', "UHD Graphics 630", 150000));
        notebooks.add(new Notebook("acer", 8, 'n', "gtx1050ti", 80000));
        Map<String, String> params = new HashMap<>();

        List<Notebook> expected = new ArrayList<>();
        expected.add(new Notebook("apple", 16, 'M', "UHD Graphics 630", 150000));
        expected.add(new Notebook("acer", 8, 'n', "gtx1050ti", 80000));

        List<Notebook> actual = hwTest.filter(params, notebooks);

        Assertions.assertEquals(expected.toString(), actual.toString());
    }

    @Test
    void filterListEmpty(){
        Homework hwTest = new Homework();
        List<Notebook> notebooks = new ArrayList<>();

        Map<String, String> params = new HashMap<>();
        params.put("os", "M");

        List<Notebook> actual = hwTest.filter(params, notebooks);

        // а вот тут мне уже не хватило соображалки, чтобы прокинуть исключение в тест
        // понял, что это делается через Assert.throw, но все попытки "подобрать" нужный код не увенчались успехом
    }
}