package Aula6.application;

import java.util.ArrayList;
import java.util.List;

import Aula6.services.ProductService;
import Global.Product;

public class App {
    public static void main(String[] args) {
        List<Product> list = new ArrayList<>();

        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));

        ProductService productService = new ProductService();
        double sum = productService.filteredSum(list, p -> p.getName().charAt(0) == 'T');
        System.out.println("Sum = $" + String.format("%.2f", sum));
    }
}