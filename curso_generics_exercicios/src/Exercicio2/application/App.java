package Exercicio2.application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> studentSetA = new HashSet<>();
        Set<Integer> studentSetB = new HashSet<>();
        Set<Integer> studentSetC = new HashSet<>();
        

        System.out.print("Quantos estudantes no curso A? ");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            studentSetA.add(sc.nextInt());
        }
        System.out.print("Quantos estudantes no curso B? ");
        qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            studentSetB.add(sc.nextInt());
        }
        System.out.print("Quantos estudantes no curso C? ");
        qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            studentSetC.add(sc.nextInt());
        }

        Set<Integer> total = new HashSet<>(studentSetA);
        total.addAll(studentSetB);
        total.addAll(studentSetC);

        System.out.println("Total de estudantes: " + total.size());
    }
}
