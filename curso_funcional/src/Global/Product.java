package Global;

public class Product {
    private String name;
    private Double price;

    public Product() {
    }

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static boolean staticProductPredicate(Product product) {
        return product.getPrice() >= 100;
    }

    public boolean nonStaticProductPredicate() {
        return price >= 100;
    }

    public static void staticUpdatePrice(Product product) {
        product.setPrice(product.getPrice() * 1.1);
    }

    public void nonStaticUpdatePrice() {
        price *= 1.1;
    }

    public static String staticUpperCaseName(Product product) {
        return product.getName().toUpperCase();
    }

    public String nonStaticUpperCaseName() {
        return name.toUpperCase();
    }

    @Override
    public String toString() {
        return "Product [name=" + name + ", price=" + price + "]";
    }

}
