package ru.gb.jseminar;

import ru.gb.jseminar.data.Notebook;

import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;

public class Decision implements Task{
    @Override
    public List<Notebook> filter(Map<String, String> params, List<Notebook> notebooks) {
        return notebooks.stream()
                .filter(notebook -> {
                    int size = params.size();
                    AtomicInteger count = new AtomicInteger(0);
                    params.forEach((a, b) -> {
                                if(getter(a, notebook).equals(b.toLowerCase()))
                                    count.getAndIncrement();
                            });
                    return size == count.get();
                })
                .collect(Collectors.toList());
    }

    private String getter(String key, Notebook notebook) {
        switch (key) {
            case "model":
                return notebook.getModel().toString().toLowerCase();
            case "color":
                return notebook.getColor().toString().toLowerCase();
            case "os":
                return notebook.getOs().toString().toLowerCase();
            case "cpu":
                return notebook.getCpu().toString().toLowerCase();
            case "ram":
                return notebook.getRam().toLowerCase();
            case "memory":
                return notebook.getMemory().toLowerCase();
        }
        throw new IllegalStateException("Key not found");
    }
}
