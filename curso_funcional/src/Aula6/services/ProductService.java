package Aula6.services;

import java.util.List;
import java.util.function.Predicate;

import Global.Product;

public class ProductService {
    public double filteredSum(List<Product> list, Predicate<Product> criteria) {
        double sum = 0.0;
        for (Product product : list) {
            if (criteria.test(product)) {
                sum += product.getPrice();
            }
        }
        return sum;
    }
}
