package Aula1.application;

import Global.Product;

public class MyComparator implements java.util.Comparator<Product> {

    @Override
    public int compare(Product o1, Product o2) {
        return o1.getName().toUpperCase().compareTo(o2.getName().toUpperCase());
    }
    
}
