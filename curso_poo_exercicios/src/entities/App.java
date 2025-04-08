package entities;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        String name;
        int quantity;
        double price;

        System.out.println("Insira os dados do produto");
        System.out.print("Nome: ");
        name = sc.nextLine();
        System.out.print("Preço: ");
        price = sc.nextDouble();
        System.out.print("Quantidade: ");
        quantity = sc.nextInt();

        Product foo = new Product();
        foo.registerProduct(name, price);
        foo.addProducts(quantity);

        System.out.println("Informações do Registro: " + foo);
        sc.close();

    }
}
