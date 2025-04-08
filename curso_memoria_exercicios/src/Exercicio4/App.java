package Exercicio4;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int size, qtd;
        qtd = 0;
        System.out.print("Quantos números você vai digitar? ");
        size = sc.nextInt();
        int[] vetor = new int[size];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um número: ");
            vetor[i] = sc.nextInt();
        }


        System.out.println("\nNÚMEROS PARES: ");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0) {
                qtd++;
                System.out.printf("%d ", vetor[i]);
            }
        }
        System.out.println("\nQUANTIDADE DE PARES = " + qtd);
        sc.close();
    }
}
