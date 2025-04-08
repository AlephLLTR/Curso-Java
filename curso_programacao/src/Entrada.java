import java.util.Scanner;

public class Entrada {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String x;
    int y;
    double z;

    x = sc.next();
    y = sc.nextInt();
    z = sc.nextDouble();
    System.out.println("Você digitou:");
    System.out.printf("x: %s\ny: %d\nz: %.2f", x, y, z);

    sc.close();
  }
}
