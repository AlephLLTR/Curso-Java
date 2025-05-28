package Aula3.util;

import java.util.function.Predicate;

import Global.Product;

public class ProductPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product product) {
        return product.getPrice() >= 100;
    }
    
}
