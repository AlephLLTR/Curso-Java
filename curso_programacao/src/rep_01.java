import java.util.Scanner;

public class rep_01 {
    public static void main(String[] args) {
        boolean running = true;
        int senha;
        Scanner sc = new Scanner(System.in);

        while (running) {
            senha = sc.nextInt();
            if (senha != 2002) {
                System.out.println("Senha Inválida");
            } else {
                System.out.println("Acesso Permitido!");
                running = false;
            }
        }
        sc.close();
    }
}
