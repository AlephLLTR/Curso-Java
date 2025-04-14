package Exercicio2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicio2.entities.ImportedProduct;
import Exercicio2.entities.Product;
import Exercicio2.entities.UsedProduct;

public class App {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        List<Product> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int numberOfProducts = sc.nextInt();


        for (int i = 0; i < numberOfProducts; i++) {
            sc.nextLine();
            System.out.println("Product #" + (i+1) + " data:");
            
            System.out.print("Common, used or imported? (c/u/i): ");
            char productType = sc.nextLine().charAt(0);
            
            System.out.print("Name: ");
            String productName = sc.nextLine();
            
            
            System.out.print("Price: ");
            Double productPrice = sc.nextDouble();

            if (productType == 'i' || productType == 'I') {
                System.out.print("Customs fee: ");
                Double productFee = sc.nextDouble();
                list.add(new ImportedProduct(productName, productPrice, productFee));
            } else if (productType == 'u' || productType == 'U') {
                System.out.print("Manufacture Date: ");
                LocalDate date = LocalDate.parse(sc.next(), pattern);
                list.add(new UsedProduct(productName, productPrice, date));
            } else {
                list.add(new Product(productName, productPrice));
            }

        }

        System.out.println();
        System.out.println("ETIQUETAS DE PREÇO:");
        for (Product product : list) {
            System.out.println(product.priceTag());
        }

        sc.close();
    }
}
