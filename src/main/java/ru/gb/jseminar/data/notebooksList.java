package ru.gb.jseminar.data;

import java.util.*;
import java.util.stream.Collectors;

public class notebooksList {
    private List<model> models = List.of(model.values());
    private final List<color> colors = List.of(color.values());
    private List<os> osList = List.of(os.values());
    private List<cpu> cpus = List.of(cpu.values());
    private final List<Integer> ramSizes = new ArrayList<>(Arrays.asList(4, 8, 16, 32));
    private final List<Integer> memorySizes = new ArrayList<>(Arrays.asList(1, 2, 4, 8));
    private Double cost;

    public List<Notebook> initListNotebooks(Double minPCCost, Double minMacCost,
                                            Double minRamCost, Double minMemoryCost) {
        Random random = new Random();
        List<Notebook> notebooks = new ArrayList<>(
                List.of(
                        new Notebook(
                                model.ACER,
                                color.GRAY,
                                os.LINUX,
                                cpu.AMD,
                                4,
                                1,
                                minPCCost)));
        for (model model: models) {
            if (model.equals(model.APPLE)) {
                Integer ram = ramSizes.get(random.nextInt(ramSizes.size()));
                Integer memory = memorySizes.get(random.nextInt(memorySizes.size()));
                notebooks.add(
                        new Notebook(
                                model.APPLE,
                                colors.get(random.nextInt(colors.size())),
                                os.MACOS,
                                cpu.APPLE,
                                ram,
                                memory,
                                minMacCost + (double) ram * minRamCost + (double) memory * minMemoryCost));
            } else {
                models = models.stream().filter(item -> !item.equals(model.APPLE)).collect(Collectors.toList());
                osList = osList.stream().filter(item -> !item.equals(os.MACOS)).collect(Collectors.toList());
                cpus = cpus.stream().filter(item -> !item.equals(cpu.APPLE)).collect(Collectors.toList());
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