package ex_4;

import java.util.Locale;
import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        double deposito;
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ContaBanco conta;
        System.out.print("Insira o número da conta: ");
        int id = sc.nextInt();
        
        System.out.print("Insira o nome do titular da conta: ");
        sc.nextLine();
        String nome = sc.nextLine();
        
        System.out.print("Será realizado um depósito inicial? (Y/n)");
        char option = sc.nextLine().charAt(0);

        if (option == 'Y') {
            System.out.print("Insira o valor do depósito inicial");
            deposito = sc.nextDouble();
            conta = new ContaBanco(nome, id, deposito);
        } else {
            deposito = 0.0;
            conta = new ContaBanco(nome, id, deposito);
        }
        
        System.out.println("Criando conta...");
        System.out.println(conta);
    }

}