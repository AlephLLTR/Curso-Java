package Aula7.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Aula7.model.entities.Product;

public class App {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();

        products.add(new Product("TV", 9000));
        products.add(new Product("Notebook", 12000));
        products.add(new Product("Tablet", 4000));
        
        Product prod = new Product("Notebook", 12000);

        System.out.println(products.contains(prod));

    }
}
