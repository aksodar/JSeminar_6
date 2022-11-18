package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;
import ru.gb.jseminar.repository.CreateListNotebooks;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Starter {
    public static void main(String[] args) {
        CreateListNotebooks notebooks = new CreateListNotebooks(
                List.of(4, 8, 16, 32),
                List.of(1, 2, 4, 8, 10),
                30990.00,
                116990.00,
                1250.00,
                3800.00
        );
        List<Notebook> list = notebooks.initListNotebooks();
        list.forEach(System.out::println);

        Decision decision = new Decision();

        Map<String, String> request = new HashMap<>();
        request.put("color", "white");
        request.put("ram", "16");

        List<Notebook> result = decision.filter(request, list);
        System.out.println("--------------------------------");
        result.forEach(System.out::println);
    }
}
