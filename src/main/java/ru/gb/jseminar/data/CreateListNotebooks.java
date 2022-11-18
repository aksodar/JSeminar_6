package ru.gb.jseminar.data;

import java.util.*;
import java.util.stream.Collectors;

public class CreateListNotebooks {
    private List<Model> models = List.of(Model.values());
    private final List<Color> colors = List.of(Color.values());
    private List<OS> osList = List.of(OS.values());
    private List<CPU> cpus = List.of(CPU.values());
    private final List<Integer> ramSizes = new ArrayList<>(Arrays.asList(4, 8, 16, 32));
    private final List<Integer> memorySizes = new ArrayList<>(Arrays.asList(1, 2, 4, 8));
    private Double cost;

    public List<Notebook> initListNotebooks(Double minPCCost, Double minMacCost,
                                            Double minRamCost, Double minMemoryCost) {
        Random random = new Random();
        List<Notebook> notebooks = new ArrayList<>(
                List.of(
                        new Notebook(
                                Model.ACER,
                                Color.GRAY,
                                OS.LINUX,
                                CPU.AMD,
                                4,
                                1,
                                minPCCost)));
        for (Model model: models) {
            if (model.equals(Model.APPLE)) {
                Integer ram = ramSizes.get(random.nextInt(ramSizes.size()));
                Integer memory = memorySizes.get(random.nextInt(memorySizes.size()));
                notebooks.add(
                        new Notebook(
                                Model.APPLE,
                                colors.get(random.nextInt(colors.size())),
                                OS.MACOS,
                                CPU.APPLE,
                                ram,
                                memory,
                                minMacCost + (double) ram * minRamCost + (double) memory * minMemoryCost));
            } else {
                models = models.stream().filter(item -> !item.equals(Model.APPLE)).collect(Collectors.toList());
                osList = osList.stream().filter(item -> !item.equals(OS.MACOS)).collect(Collectors.toList());
                cpus = cpus.stream().filter(item -> !item.equals(CPU.APPLE)).collect(Collectors.toList());
                Integer ram = ramSizes.get(random.nextInt(ramSizes.size()));
                Integer memory = memorySizes.get(random.nextInt(memorySizes.size()));
                notebooks.add(new Notebook(
                        models.get(random.nextInt(models.size())),
                        colors.get(random.nextInt(colors.size())),
                        osList.get(random.nextInt(osList.size())),
                        cpus.get(random.nextInt(cpus.size())),
                        ram,
                        memory,
                        minPCCost + (double) ram * minRamCost + (double) memory * minMemoryCost
                ));
            }
        }
        return notebooks;
    }
}
