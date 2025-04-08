package entities;

public class Product {

    private String name;
    private double price;
    private int quantity;


    private void setName(String name) {
        this.name = name;
    }
    
    private String getName() {
        return this.name;
    }

    private void setPrice(double price) {
        this.price = price;
    }
    
    private double getPrice() {
        return this.price;
    }

    private void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    private int getQuantity() {
        return this.quantity;
    }


    public double totalValueInStock(){
        return getPrice() * getQuantity();
    }


    public void registerProduct(String name, double price){
        this.setName(name);
        this.setPrice(price);
    }

    public void addProducts(int quantity){
        this.setQuantity(getQuantity() + quantity);
    }

    public void removeProducts(int quantity){
        this.setQuantity(getQuantity() - quantity);
    }

    public String toString(){
        return getName() + ", $" + getPrice() + ", " + getQuantity() + " units, Total: $" + totalValueInStock();
    }
}
