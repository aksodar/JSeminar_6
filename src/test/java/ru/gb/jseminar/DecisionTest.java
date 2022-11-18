package ru.gb.jseminar;

import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.Notebook;

import java.util.*;

class DecisionTest {

    @Test
    void filter() {
        CreateListNotebooks listNotebooks = new CreateListNotebooks(
                new ArrayList<>(Arrays.asList(4, 8, 16, 32)),
                new ArrayList<>(Arrays.asList(1, 2, 4, 8, 10)),
                30990.00,
                116990.00,
                1250.00,
                3800.00
        );
        List<Notebook> list = listNotebooks.initListNotebooks();
        Decision decision = new Decision();
        Map<String, String> request = new HashMap<>();
        request.put("color", "white");
        request.put("cpu", "amd");
        request.put("ram", "4");

        for(Notebook item: decision.filter(request, list)) {
            System.out.println(item);
        }
    }
}