package ru.gb.jseminar;

import ru.gb.jseminar.data.ANSIConstants;
import ru.gb.jseminar.data.Notebook;
import java.util.*;

public class Homework {
    public static void main(String[] args) {
        Homework nb = new Homework();
        Set laptops = nb.getFullSetOfLaptops();
        Set foundLaptops = nb.displayMenu(laptops);
        System.out.println("------------------------------------");
        System.out.println();
        Set foundLaptops1 = new LinkedHashSet();
        Set foundLaptops2 = new LinkedHashSet();
        Set foundLaptops3 = new LinkedHashSet();;
        Set foundLaptops4 = new LinkedHashSet();;
        if (!(foundLaptops.isEmpty())) {
            nb.printResult(foundLaptops);
            if (foundLaptops.size() > 1) {
                foundLaptops1 = nb.additionalDisplayMenu(foundLaptops);
                nb.printResult(foundLaptops1);
                if (foundLaptops1.size() > 1) {
                    foundLaptops2 = nb.additionalDisplayMenu(foundLaptops1);
                    nb.printResult(foundLaptops2);
                    if (foundLaptops2.size() > 1) {
                        foundLaptops3 = nb.additionalDisplayMenu(foundLaptops2);
                        nb.printResult(foundLaptops3);
                        if (foundLaptops3.size() > 1) {
                            foundLaptops4 = nb.additionalDisplayMenu(foundLaptops3);
                            nb.printResult(foundLaptops4);
                        }
                    }
                }
            }
        }
        if (foundLaptops1.size() == 1 || foundLaptops2.size() == 1 || foundLaptops3.size() == 1 || foundLaptops4.size() == 1) {
            System.out.println(ANSIConstants.ANSI_GREEN + "Done" + ANSIConstants.ANSI_RESET);
        }
        if (foundLaptops1.isEmpty()) {
            System.out.println(ANSIConstants.ANSI_RED + "Laptops for desired parameters not found or incorrect choice! Please try again! " + ANSIConstants.ANSI_RESET);
        }
    }
    public Set getFullSetOfLaptops() {
        Notebook l1 = new Notebook(1, "Apple MacBook Pro", (float)16.2, (float)64.0, (float)512, "grey cosmic", (float)360000.0);
        Notebook l2 = new Notebook(2, "MSI CreatorPro Z17", (float)17.0, (float)64.0, (float)256, "silver", (float)99000.0);
        Notebook l3 = new Notebook(3, "GIGABYTE Aero 16", (float)16.0, (float)32.0, (float)512, "grey", (float)55000.0);
        Notebook l4 = new Notebook(4, "MSI Vector GP66", (float)15.6, (float)16.0, (float)256, "black", (float)47000.0);
        Notebook l5 = new Notebook(5, "Huawei MateBook D 16", (float)16.0, (float)16.0, (float)512, "pink", (float)77000.0);
        Notebook l6 = new Notebook(6, "TECNO MegaBook T1", (float)15.6, (float)16.0, (float)512, "grey", (float)39000.0);
        Notebook l7 = new Notebook(7, "Lenovo V15 G2 ITL", (float)15.6, (float)8.0, (float)256, "black", (float)44000.0);
        Notebook l8 = new Notebook(8, "ASUS Vivobook 15", (float)17.5, (float)8.0, (float)512, "silver", (float)50000.0);
        Set laps = new LinkedHashSet<>(Arrays.asList(l1,l2,l3,l4,l5,l6,l7,l8));
        return laps;
    }
    public Set displayMenu(Set<Notebook> notebooks) {
        Map parameters = new HashMap<>();
        Scanner in = new Scanner(System.in);
        System.out.println("\n"+ANSIConstants.ANSI_WHITE_BACKGROUND+ANSIConstants.ANSI_BLACK+"LAPTOPS SEARCH MODE"+ANSIConstants.ANSI_RESET);
        System.out.println("----------------------------------------");
        System.out.println("Choose option/options for further search: ");
        System.out.println("----------------------------------------");
        System.out.println("1.Display size");
        System.out.println("2.CPU type");
        System.out.println("3.SSD type");
        System.out.println("4.Color");
        System.out.println("5.Price");
        System.out.println("6.See full list of laptops available");
        System.out.println("-------------------------------------");
        System.out.print("Provide your choice here: ");
        int choice = in.nextInt();
        in.nextLine();
        System.out.println("-------------------------------------");
        Set findSet = new LinkedHashSet<>();
        switch (choice) {
            case 1:
                System.out.print("Display size from: ");
                Float d = in.nextFloat();
                parameters.put("displaySize", d);
                for (Notebook item : notebooks) {
                    if ((float)parameters.get("displaySize") <= item.getDisplaySize()) {
                        findSet.add(item);
                    }
                }
                break;
            case 2:
                System.out.print("CPU capacity from: ");
                Float c = in.nextFloat();
                parameters.put("cpuType", c);
                for (Notebook item : notebooks) {
                    if ((float)parameters.get("cpuType") <= item.getCpuType()) {
                        findSet.add(item);
                    }
                }
                break;
            case 3:
                System.out.print("SSD capacity from: ");
                Float s = in.nextFloat();
                parameters.put("ssdSize", s);
                for (Notebook item : notebooks) {
                    if ((float)parameters.get("ssdSize") <= item.getSSDSize()) {
                        findSet.add(item);
                    }
                }
                break;
            case 4:
                System.out.print("Color desired: ");
                String cl = in.nextLine();
                parameters.put("color", cl);
                for (Notebook item : notebooks) {
                    if (parameters.containsValue(item.getColor())) {
                        findSet.add(item);
                    }
                }
                break;
            case 5:
                System.out.print("Price upto: ");
                Float p = in.nextFloat();
                parameters.put("price", p);
                for (Notebook item : notebooks) {
                    if ((float)parameters.get("price") >= item.getPrice()) {
                        findSet.add(item);
                    }
                }
                break;
            case 6:
                findSet = getFullSetOfLaptops();
                break;
        }
        return findSet;
    }
    public Set additionalDisplayMenu(Set<Notebook> notebooks) {
        Set findSet1 = new LinkedHashSet<>();
        System.out.println("-------------------------------------");
        System.out.println(ANSIConstants.ANSI_YELLOW+"Continue filtering current list? "+ANSIConstants.ANSI_RESET);
        Scanner in = new Scanner(System.in);
        System.out.println("-------------------------------------");
        System.out.println("1.Yes");
        System.out.println("2.No");
        System.out.print("Provide your choice here: ");
        int choice = in.nextInt();
        in.nextLine();
        switch (choice) {
            case 1:
                findSet1 = displayMenu(notebooks);
                break;
            case 2:
                System.exit(0);
        }
    return findSet1;
    }

    public void printResult(Set<Notebook> notebooks) {
        System.out.println("====================================");
        System.out.println(ANSIConstants.ANSI_WHITE_BACKGROUND+ANSIConstants.ANSI_BLACK+"List of laptops found: "+ANSIConstants.ANSI_RESET);
        System.out.println(notebooks);
        System.out.println("");
    }
}
