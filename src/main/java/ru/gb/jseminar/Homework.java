package ru.gb.jseminar;
import ru.gb.jseminar.data.Notebook;
import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Homework run = new Homework();
        run.getMenuMain();
    }
    public void getMenuMain() {
        Homework run = new Homework();
        Scanner scan = new Scanner(System.in);
        int x = -1;
        String s = "";
        System.out.println("#".repeat(125));
        System.out.println("ВЫБЕРИТЕ ПУНКТ ИЗ МЕНЮ\n");
        System.out.println("\t1 - Отобразить полный список магазина");
        System.out.println("\t2 - Отсортировать по параметру");
        System.out.println("\t" + ". ".repeat(15));
        System.out.println("\t0 - ВЫХОД");
        System.out.print("\nВведите значение: ");
        s = scan.next();

        try {
            x = Integer.parseInt(s);
        } catch (NumberFormatException e) {
            System.out.println("Не правильный ввод!");
        }
        switch (x) {
            case 1:
                System.out.println(run.initListNotebooks());
                Set notebooks = run.initListNotebooks();
                run.getMenuSort(notebooks);
                break;
            case 2:
                Set value = new LinkedHashSet<>();
                run.getSortBlackbox(value);
                break;
            case 0:
                getExitMessage();
        }
    }
    public int genOrderNumberRnd(int min, int max) {
        Random rand = new Random();
        return rand.nextInt((max - min) + 1) + min;
    }
    public void getMessageSortFail(Set<Notebook> notebooks){
        Homework run = new Homework();
        Set laptops = run.initListNotebooks();
        System.out.println("Ноутбуки по нужным параметрам не найдены или неправильный выбор! Попробуйте еще раз!");
        run.getMenuSort(laptops);
    }
    public void getMessageSortDone(){
        int orderNumber = genOrderNumberRnd(100000, 999999);
        System.out.println("Отличный выбор! Ваш номер заказа " + orderNumber + ", обратитесь к продавцу!");
        getExitMessage();
    }
    public void getExitMessage(){
        System.out.println("Вы успешно вышли из программы!");
        System.exit(0);
    }
    public Set getSortBlackbox(Set<Notebook> notebooks) {
        Homework run = new Homework();
        Set laptops = run.initListNotebooks();
        Set foundLaptops = run.getMenuSort(laptops);
        if (foundLaptops.size() == 1) {
            run.getShowResult(foundLaptops);
            run.getMessageSortDone();
        }
        if (foundLaptops.isEmpty()) {
            run.getMessageSortFail(laptops);
        }
        else {
            run.getShowResult(foundLaptops);
            while (!foundLaptops.isEmpty() || foundLaptops.size() > 1 ) {
                foundLaptops = run.getFoundStep(foundLaptops);
                if (foundLaptops.isEmpty()) {
                    run.getMessageSortFail(laptops);
                }
                run.getShowResult(foundLaptops);
                if (foundLaptops.size() == 1) {
                    run.getMessageSortDone();
                }
            }
        }
        return notebooks;
    }
    public Set initListNotebooks() {
        Notebook l1 = new Notebook(1, "Apple", (float)14.2, (float)3.0, (float)1024, "Золото");
        Notebook l2 = new Notebook(2, "Asus", (float)15.6, (float)2.8, (float)512, "Серый");
        Notebook l3 = new Notebook(3, "HP", (float)16, (float)2.8, (float)512, "Серый");
        Notebook l4 = new Notebook(4, "Dell", (float)14, (float)2.9, (float)256, "Черный");
        Set laps = new LinkedHashSet<>(Arrays.asList(l1,l2,l3,l4));
        return laps;
    }
    public Set getMenuSort(Set<Notebook> notebooks) {
        Map params = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("-".repeat(25));
        System.out.println("Сортировка по параметру:");
        System.out.println("\t1 - Диагональ дисплея");
        System.out.println("\t2 - Частота ЦП");
        System.out.println("\t3 - Объём диска");
        System.out.println("\t4 - Цвет");
        System.out.println("\t" + ". ".repeat(15));
        System.out.println("\t9 - Вернуться в главное меню");
        System.out.println("\t0 - ВЫХОД");
        System.out.println("-".repeat(25));
        System.out.print("Введите значение: ");
        int choice = in.nextInt();
        in.nextLine();
        System.out.println("-".repeat(25));

        Set nb = new LinkedHashSet<>();
        switch (choice) {
            case 1:
                System.out.print("Диагональ дисплея '>=': ");
                Float d = in.nextFloat();
                params.put("displayDiagonal", d);
                for (Notebook item : notebooks) {
                    if ((float)params.get("displayDiagonal") <= item.getDisplayDiagonal()) {
                        nb.add(item);
                    }
                }
                break;
            case 2:
                System.out.print("Частота ЦП '>=': ");
                Float c = in.nextFloat();
                params.put("frequencyCpu", c);
                for (Notebook item : notebooks) {
                    if ((float)params.get("frequencyCpu") <= item.getFrequencyCpu()) {
                        nb.add(item);
                    }
                }
                break;
            case 3:
                System.out.print("Размер диска '>=': ");
                Float s = in.nextFloat();
                params.put("diskSize", s);
                for (Notebook item : notebooks) {
                    if ((float)params.get("diskSize") <= item.getDiskSize()) {
                        nb.add(item);
                    }
                }
                break;
            case 4:
                System.out.print("Цвет: ");
                String cl = in.nextLine();
                params.put("color", cl);
                for (Notebook item : notebooks) {
                    if (params.containsValue(item.getColor())) {
                        nb.add(item);
                    }
                }
                break;
            case 9:
                getMenuMain();
            case 0:
                getExitMessage();
        }
        return nb;
    }
    public Set getMenuYN(Set<Notebook> notebooks) {
        Set nb = new LinkedHashSet<>();
        Scanner in = new Scanner(System.in);
        System.out.println("-".repeat(25));
        System.out.println("Продолжить фильтрацию текущего списка?");
        System.out.println("-".repeat(25));
        System.out.println("\t1 - ДА");
        System.out.println("\t2 - НЕТ");
        System.out.println("\t" + ". ".repeat(15));
        System.out.println("\t9 - Вернуться в главное меню");
        System.out.println("\t0 - ВЫХОД");
        System.out.print("Введите значение: ");
        int choice = in.nextInt();
        in.nextLine();
        switch (choice) {
            case 1:
                nb = getMenuSort(notebooks);
                break;
            case 2:
                System.out.println("Поиск завершён");
                System.exit(0);
            case 9:
                getMenuMain();
            case 0:
                getExitMessage();
        }
        return nb;
    }
    public Set getFoundStep(Set<Notebook> notebooks) {
        Set nb = new LinkedHashSet();
        if (notebooks.size() > 1) {
            nb = getMenuYN(notebooks);
        }
        return nb;
    }
    public void getShowResult(Set<Notebook> notebooks) {
        System.out.println("*".repeat(25));
        System.out.println("Найдены следующие модели: ");
        System.out.println("^ ".repeat(15));
        System.out.println(notebooks);
    }
}