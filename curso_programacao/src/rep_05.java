import java.util.Scanner;

public class rep_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int read, val, in, out;
        in = 0;
        out = 0;
        read = sc.nextInt();

        for (int i = 0; i < read; i++) {
            val = sc.nextInt();
            if (10 <= val && val <= 20) {
                in++;
            } else {
                out++;
            }
        }

        System.out.printf("%d in\n%d out", in, out);
        sc.close();
    }
}
