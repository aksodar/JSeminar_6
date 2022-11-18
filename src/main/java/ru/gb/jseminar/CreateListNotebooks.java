package ru.gb.jseminar;

import ru.gb.jseminar.data.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class CreateListNotebooks {
    private List<Model> models = List.of(Model.values());
    private final List<Color> colors = List.of(Color.values());
    private List<OS> osList = List.of(OS.values());
    private List<CPU> cpus = List.of(CPU.values());
    private final List<Integer> ramSizes;
    private final List<Integer> memorySizes;
    Double minPCCost;
    Double minMacCost;
    Double minRamCost;
    Double minMemoryCost;

    public CreateListNotebooks(List<Integer> ramSizes,
                               List<Integer> memorySizes,
                               Double minPCCost,
                               Double minMacCost,
                               Double minRamCost,
                               Double minMemoryCost) {
        this.ramSizes = ramSizes;
        this.memorySizes = memorySizes;
        this.minPCCost = minPCCost;
        this.minMacCost = minMacCost;
        this.minRamCost = minRamCost;
        this.minMemoryCost = minMemoryCost;
    }

    public List<Notebook> initListNotebooks() {
        Random random = new Random();
        List<Notebook> notebooks = new ArrayList<>(
                List.of(
                        new Notebook(
                                Model.ACER,
                                Color.GRAY,
                                OS.LINUX,
                                CPU.AMD,
                                Collections.min(ramSizes),
                                Collections.min(memorySizes),
                                minPCCost)));
        for (int i = 0; i < (random.nextInt(5) + 1); i++) {
            for (Model model : models) {
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
        }
        return notebooks;
    }
}
