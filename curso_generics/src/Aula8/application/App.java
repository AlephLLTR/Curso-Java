package Aula8.application;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import Aula8.model.entities.Product;

public class App {
    public static void main(String[] args) {
        Set<Product> products = new TreeSet<>();

        products.add(new Product("TV", 9000));
        products.add(new Product("Notebook", 12000));
        products.add(new Product("Tablet", 4000));
        
        for (Product product : products) {
            System.out.println(product);
        }

    }
}
