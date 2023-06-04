package ru.gb.jseminar.sem1;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Main {
    /**
     * @param args
     */
    public static void main(String[] args) {
        List<Product> prodList = new ArrayList<>(
            Arrays.asList(
                new Product("Snikers", 25.00),
                new Product("Mars", 24.50),
                new Product("Bounty", 23.00)
            )
        );
        

        VendingMachine machine = new VendingMachine(prodList);

        String key = "Mars";

        var res = machine.getProductByName(key);

        System.out.println(res);


        List<Product> bottleList = new ArrayList<>(
            Arrays.asList(
                new Bottle("AquaMinerale", 10.00, 0.5),
                new Bottle("Esentuki", 14.50, 0.5)
            )
        );

        BottleMachine bottleMachine = new BottleMachine(bottleList);

        String check = "Esentuki";

        var result = bottleMachine.getProductByName(check);

        System.out.println(result);

    }
}
