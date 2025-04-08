package Exercicio5;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("How many rooms will be rented? ");
        int rooms_to_rent = sc.nextInt();
        Room[] vetor = new Room[9];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = new Room(null, null, false);
        }


        for (int i = 0; i < rooms_to_rent; i++) {
            sc.nextLine();
            System.out.printf("Rent #%d\n", i+1);
            
            System.out.print("Name: ");
            String nome = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();
            
            System.out.print("Room: ");
            int room = sc.nextInt();
            
            sc.nextLine();
            vetor[room].occupy(nome, email);
        }


        System.out.println("\nBusy rooms:");
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i].isOccupied() == true) {
                System.out.printf("%d: %s, %s\n", i, vetor[i].getStudent_name(), vetor[i].getStudent_email());
            }
        }
        sc.close();
    }

}
