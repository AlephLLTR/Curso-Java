import java.util.Scanner;

public class beecrowd_1008 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int NUMBER, HOURS;
        double SALARY;

        NUMBER = sc.nextInt();
        HOURS = sc.nextInt();
        SALARY = sc.nextDouble();

        System.out.printf("NUMBER = %d\n", NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", HOURS * SALARY);
        sc.close();
    }
}
