package ru.gb.jseminar;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.*;

import java.util.*;

class DecisionTest {
    Decision decision;
    Map<String, String> request;

    @BeforeEach
    void serUp() {
        decision = new Decision();
        request = new HashMap<>();
    }

    @Test
    void filterSuccessful() {
        List<Notebook> list = new ArrayList<>(Arrays.asList(
                new Notebook(
                        Model.ACER,
                        Color.WHITE,
                        OS.LINUX,
                        CPU.AMD,
                        16,
                        2,
                        30990.00
                ),
                new Notebook(
                        Model.ASUS,
                        Color.RED,
                        OS.WINDOWS,
                        CPU.INTEL,
                        16,
                        4,
                        60990.00
                )
        ));

        request.put("color", "white");
        request.put("cpu", "amd");
        request.put("ram", "16");

        List<Notebook> expected = new ArrayList<>(List.of(
                new Notebook(
                        Model.ACER,
                        Color.WHITE,
                        OS.LINUX,
                        CPU.AMD,
                        16,
                        2,
                        30990.00
                )
        ));

        List<Notebook> actual = decision.filter(request, list);

        Assertions.assertEquals(expected, actual);
    }
}