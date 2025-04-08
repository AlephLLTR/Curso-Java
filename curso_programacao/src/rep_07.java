import java.util.Scanner;

public class rep_07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double val1, val2;
        int read = sc.nextInt();
        
        for (int i = 0; i < read; i++) {
            double result = 0;
            val1 = sc.nextDouble();
            val2 = sc.nextDouble();
            if (val2 == 0) {
                System.out.println("divisão impossível");
            } else {
                result = val1/val2;
                System.out.printf("%.1f%n", result);    
            }
        }
        sc.close();
        }
}