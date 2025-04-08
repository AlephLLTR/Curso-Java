package Aula2;
import java.util.Locale;
import java.util.Scanner;

public class Aula2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        

        int n = sc.nextInt();
        Produto[] vect = new Produto[n];

        for (int i = 0; i < n; i++) {
            sc.nextInt();
            String name = sc.nextLine();
            double price = sc.nextDouble();
            vect[i] = new Produto(name, price);
        }
        sc.close();
    }
}
