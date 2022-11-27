package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.Notebook;

import java.util.*;

class HomeworkTest {

    @Test
    void filterSuccessful() {
        Homework HW6 = new Homework();
        List<Notebook> notebookstest = new ArrayList<>();
        notebookstest.add(new Notebook(35000,"ASUS","N56VZ",16,1000, "WIN11","Brown"));
        notebookstest.add(new Notebook(11000,"Samsung","r418",4,480, "WIN7","Black"));

        Map<String, String> filterMaptest = new HashMap<>();
        filterMaptest.put("RAM", "16");

        List<Notebook> actual = HW6.filter(filterMaptest, notebookstest);
        List<Notebook> expected = new ArrayList<>();
        expected.add(new Notebook(35000,"ASUS","N56VZ",16,1000, "WIN11","Brown"));

        Assertions.assertIterableEquals(expected,actual);
    }

    @Test
    void filterNullException() {
        Homework HW6 = new Homework();
        Assertions.assertThrows(NullPointerException.class, () -> HW6.filter(null,null));
    }
}