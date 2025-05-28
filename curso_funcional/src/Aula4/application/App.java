package Aula4.application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import Aula4.util.PriceUpdate;
import Global.Product;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 900.00));
        list.add(new Product("Notebook", 1200.00));
        list.add(new Product("Tablet", 450.00));
        list.add(new Product("HD Case", 80.90));

        double factor = 1.1;
        Consumer<Product> cons = p -> p.setPrice(p.getPrice() * factor);

        list.forEach(cons);

        list.forEach(System.out::println);

    }
}
