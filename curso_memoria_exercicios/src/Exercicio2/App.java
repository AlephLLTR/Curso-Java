package Exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n;
        double sum = 0;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = sc.nextInt();
        double[] vetor = new double[n];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite um numero: ");
            vetor[i] = sc.nextDouble();
            sum += vetor[i];
        }

        System.out.print("VALORES = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("%.1f ", vetor[i]);
        }
        double avg = sum/n;
        System.out.printf("%nSOMA = %.2f%nMEDIA = %.2f", sum, avg);
        sc.close();
    }
}
