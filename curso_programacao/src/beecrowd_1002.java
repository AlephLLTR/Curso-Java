import java.util.Scanner;

public class beecrowd_1002 {
    
    public static double area(double raio){
        return  Math.pow(raio, 2) * 3.14159;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        System.out.printf("A=%.4f\n",area(x));
        sc.close();
    }
}
