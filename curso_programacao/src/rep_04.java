import java.util.Scanner;

public class rep_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;

        x = sc.nextInt();
        sc.close();
        for (int i = 1; i < x; i++) {
            if (i%2!=0) {
                System.out.println(i);
            }            
        }
    }
}
