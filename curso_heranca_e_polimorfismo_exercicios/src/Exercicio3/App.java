package Exercicio3;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Exercicio3.entities.Company;
import Exercicio3.entities.Person;
import Exercicio3.entities.TaxFile;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<TaxFile> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Tax Payer #" + (i + 1) + " data:");
            
            System.out.print("Individual or Company? (i/c): ");
            char select = sc.next().charAt(0);

            System.out.print("Name: ");
            String name = sc.next();

            System.out.print("Annual income: ");
            Double annualIncome = sc.nextDouble();

            if (select == 'i') {
                System.out.print("Health expenditures: ");
                Double healthcareCosts = sc.nextDouble();

                list.add(new Person(name, annualIncome, healthcareCosts));
            } else {
                System.out.print("Number of employees: ");
                int numberOfEmployees = sc.nextInt();

                list.add(new Company(name, annualIncome, numberOfEmployees));
            }

        }
        Double sum = 0.;

        System.out.println("\nTAXES PAID");

        for (TaxFile taxFile : list) {
            System.out.println(taxFile);
            sum += taxFile.taxOverIncome();
        }

        System.out.printf("\nTOTAL TAXES: $%.2f", sum);
    }
}





