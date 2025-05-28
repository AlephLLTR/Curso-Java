package Aula3.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import Aula3.util.ProductPredicate;
import Global.Product;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        System.out.println("Lista Original");
        for (Product product : list) {
            System.out.println(product);
        }

        double min = 100.0;
        Predicate<Product> pred = p -> p.getPrice() >= min;

        list.removeIf(p -> p.getPrice() >= min);

        System.out.println("\nLista Modificada");
        for (Product product : list) {
            System.out.println(product);
        }

    }
}
