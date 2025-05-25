package Aula1.application;

import java.util.Scanner;

import Aula1.model.services.PrintService;


public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);

        PrintService<String> ps = new PrintService<>();

        System.out.print("How many values? ");
        int n = sc.nextInt();


        for (int i = 0; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }
        ps.print();
        System.out.println("First: " + ps.first());

        sc.close();
    }
}
