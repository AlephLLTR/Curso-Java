package Aula1;
import java.util.Locale;
import java.util.Scanner;

public class Aula1 {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double[] vect = new double[n];

        for (int index = 0; index < n; index++) {
            vect[index] = sc.nextDouble();
        }

        double sum = 0.0;
        for (int i = 0; i < vect.length; i++) {
            sum += vect[i];
        }

        double avg = sum/n;
        
        System.out.printf("Average Height: %.2f%n", avg);
        sc.close();

    }
}
