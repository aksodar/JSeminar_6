package ru.gb.jseminar;

import org.junit.jupiter.api.Test;
import ru.gb.jseminar.data.Notebook;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class HomeworkTest {
    @Test
    public void filterTest(){
        //Создаём объекты класса Ноутбук
        Notebook nb1 = new Notebook("XP", 4000, 8000, "red");
        Notebook nb2 = new Notebook("Ubuntu", 5000, 4000, "black");
        Notebook nb3 = new Notebook("Mint", 3000, 4000, "white");
        Notebook nb4 = new Notebook("Kali", 4500, 16000, "green");
        Homework hwt = new Homework();
        List<Notebook> actualNotebooks = hwt.initListNotebooks(nb1, nb2, nb3, nb4);

        //Создаём мапу с параметрами фильтрации для ноутбуков
        Map<String, String> propertys = new HashMap<String, String>();
        propertys.put("OS", "Kali");
        propertys.put("CPU", "4000");
        propertys.put("RAM", "8000");
        propertys.put("COLOR", "red");

        //Создаём List отфильтрованных ноутбуков
        List<Notebook> gNotebooks = new ArrayList<Notebook>();
        gNotebooks.add(new Notebook("XP", 4000, 8000, "red"));
        gNotebooks.add(new Notebook("Ubuntu", 5000, 4000, "black"));
        gNotebooks.add(new Notebook("Mint", 3000, 4000, "white"));
        gNotebooks.add(new Notebook("Kali", 4500, 16000, "green"));

        assertEquals(gNotebooks, hwt.filter(propertys, actualNotebooks));

        
    }

}