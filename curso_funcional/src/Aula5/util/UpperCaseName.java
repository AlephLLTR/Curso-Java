package Aula5.util;

import java.util.function.Function;

import Global.Product;

public class UpperCaseName implements Function<Product, String> {

    @Override
    public String apply(Product product) {
        return product.getName().toUpperCase();
    }
    
}
