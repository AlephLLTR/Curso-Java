import java.util.Scanner;

public class rep_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeticoes, soma;
        soma = 0;
        repeticoes = sc.nextInt();
        sc.close();
        for (int i = 0; i < repeticoes; i++) {
            soma += repeticoes*i;
            System.out.printf("i: %d, soma: %d\n", i, soma);
        }
        System.out.println(soma);

    }
}
