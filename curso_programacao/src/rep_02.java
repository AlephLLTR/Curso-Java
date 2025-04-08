import java.util.Scanner;

public class rep_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        boolean running = true;
        
        while (running) {
            x = sc.nextInt();
            y = sc.nextInt();
            if (x == 0 || y == 0) {
                System.out.println("Encerrando");
                running = false;
            } else if (x > 0 && y > 0) {
                System.out.println("Primeiro");
            } else if (x < 0 && y > 0) {
                System.out.println("Segundo");
            } else if (x < 0 && y < 0) {
                System.out.println("Terceiro");
            } else {
                System.out.println("Quarto");
            }
        }
        sc.close();
    }
}
