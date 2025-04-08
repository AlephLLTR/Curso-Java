package ex_3;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        CurrencyConverter conversor = new CurrencyConverter();
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a cotação atual do USD?");
        double cotacao = sc.nextDouble();
        System.out.println("Qual a quantia em USD a ser convertida?");
        double quantia = sc.nextDouble();
        System.out.printf("Quantia convertida para reais: %.2f", conversor.calcular(quantia, cotacao));
        sc.close();
    }
}
