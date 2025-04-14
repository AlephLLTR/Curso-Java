package Aula4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Circle;
import entities.Color;
import entities.Rectangle;
import entities.Shape;


public class App {
    public static void main(String[] args) {        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();


        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i+1) + " data:");
            System.out.print("Rectangle or Circle? (r/c): ");
            char select = sc.next().charAt(0);
            System.out.print("Color? (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (select == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color ,radius));
            }

        }

        System.out.println("\nSHAPE AREAS:");
        
        for (Shape shape : list) {
            System.out.println(shape.area());
        }


    }
}
