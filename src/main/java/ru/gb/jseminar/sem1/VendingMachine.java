package ru.gb.jseminar.sem1;

import java.util.List;

public class VendingMachine {
    protected final List<Product> prodList;


    public VendingMachine(List<Product> prodList) {
        this.prodList = prodList;
    }

    public Product getProductByName(String name){
        for (Product product : this.prodList) {
            if (name.equals(product.getName())){
                return product;
            }
        }
        throw new IllegalStateException("Product not found");
    }

    // public Product getProductByCost(String cost){
    //     for (Product product : this.prodList) {
    //         if (cost.equals(product.getCost())){
    //             return product;
    //         }
    //     }
    //     throw new IllegalStateException("Product not found");
    // }
}
