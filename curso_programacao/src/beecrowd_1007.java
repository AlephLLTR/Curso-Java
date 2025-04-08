import java.util.Scanner;

public class beecrowd_1007 {
 
    public static int diferenca(int A, int B, int C, int D){
        return (A * B) - (C * D);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("DIFERENCA = %d", diferenca(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
        sc.close();
 }
}
