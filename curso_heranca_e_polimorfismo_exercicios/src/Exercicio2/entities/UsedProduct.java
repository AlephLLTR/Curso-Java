package Exercicio2.entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class UsedProduct extends Product{
    private LocalDate manufactureDate;
    
    private static DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public UsedProduct() {}

    public UsedProduct(String name, Double price, LocalDate manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    } 
    
    public LocalDate getManufactureLocalDate() {
        return manufactureDate; 
    } 
        
    public void setManufactureLocalDate(LocalDate manufactureLocalDate) {
        this.manufactureDate = manufactureLocalDate;
    }

    @Override
    public String priceTag() {
        return getName() 
        + " (used) $" 
        + String.format("%.2f", getPrice()) 
        + "(Manufacture date: "
        + manufactureDate.format(pattern)
        + ")";
    }

}
