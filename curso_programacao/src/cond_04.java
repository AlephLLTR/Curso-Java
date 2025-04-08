import java.util.Scanner;

public class cond_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h_i, h_f;
        h_i = sc.nextInt();
        h_f = sc.nextInt();
        sc.close();
        // System.out.println(24 + h_i - h_f);
        // System.out.println(24 + h_f - 24 - h_i);

        if (h_i >= h_f) {
            System.out.printf("O JOGO DUROU %d HORA(S)", ((24 - h_i) + h_f));            
        } else {
            System.out.printf("O JOGO DUROU %d HORA(S)", ((24 + h_i) - (24 - h_f)));
        }

    }

}
