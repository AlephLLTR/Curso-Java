package Aula1.application;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import Aula1.entities.ComparableProduct;
import Global.Product;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("With Comparable");
        List<ComparableProduct> listComparableProducts = new ArrayList<>();

        listComparableProducts.add(new ComparableProduct("TV", 900.00));
        listComparableProducts.add(new ComparableProduct("Notebook", 1200.00));
        listComparableProducts.add(new ComparableProduct("Tablet", 450.00));

        Collections.sort(listComparableProducts);

        for (ComparableProduct product : listComparableProducts) {
            System.out.println(product);
        }

        System.out.println("\nWithout Comparable");

        List<Product> listProducts = new ArrayList<>();

        listProducts.add(new Product("TV", 900.00));
        listProducts.add(new Product("Notebook", 1200.00));
        listProducts.add(new Product("Tablet", 450.00));

        Comparator<Product> comp = (o1, o2) -> o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());


        listProducts.sort(comp);

        for (Product product : listProducts) {
            System.out.println(product);
        }

    }
}
