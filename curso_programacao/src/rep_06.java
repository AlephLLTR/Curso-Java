import java.util.Scanner;

public class rep_06 {

    public static double calc(double sum, int weight){
        return sum/weight;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double avg, val1, val2, val3;

        for (int i = 0; i < n; i++) {
            val1 = sc.nextDouble();
            val2 = sc.nextDouble();
            val3 = sc.nextDouble();
            
            avg = (val1*2. + val2 * 3. + val3 * 5.)/10.;
            System.out.printf("%.1f%n", avg);
        }

        sc.close();
    }
}
