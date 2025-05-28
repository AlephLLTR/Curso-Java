package Aula4.util;

import java.util.function.Consumer;

import Global.Product;

public class PriceUpdate implements Consumer<Product> {

    @Override
    public void accept(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

}