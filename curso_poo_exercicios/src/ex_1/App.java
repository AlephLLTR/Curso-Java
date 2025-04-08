package ex_1;
import java.util.Locale;
import java.util.Scanner;

import ex_1.Triangle;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Triangle foo = new Triangle();
        double w, h;

        System.out.println("Insira as informações do triangulo.");
        System.out.print("Altura: ");
        h = sc.nextDouble();
        System.out.print("Largura: ");
        w = sc.nextDouble();
        foo.setMeasurements(w, h);
        System.out.println(foo);

        sc.close();
    }
}
