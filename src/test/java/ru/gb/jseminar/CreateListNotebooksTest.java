package ru.gb.jseminar;

import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.Notebook;
import ru.gb.jseminar.repository.CreateListNotebooks;

import java.util.ArrayList;
import java.util.Arrays;

class CreateListNotebooksTest {

    @Test
    void initListNotebooks() {
        CreateListNotebooks listNotebooks = new CreateListNotebooks(
                new ArrayList<>(Arrays.asList(4, 8, 16, 32)),
                new ArrayList<>(Arrays.asList(1, 2, 4, 8, 10)),
                30990.00,
                116990.00,
                1250.00,
                3800.00
        );
        for (Notebook item : listNotebooks.initListNotebooks()) {
            System.out.println(item);
        }
    }
}