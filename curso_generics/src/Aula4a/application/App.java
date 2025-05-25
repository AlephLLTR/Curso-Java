package Aula4a.application;

import java.util.ArrayList;
import java.util.List;

import Aula4a.model.entities.Circle;
import Aula4a.model.entities.Rectangle;
import Aula4a.model.interfaces.Shape;

public class App {
    public static void main(String[] args) {
        
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Rectangle(3.0, 2.0));
        shapes.add(new Circle(2.0));

        System.out.println("Total area: " + totalArea(shapes));
    }

    public static double totalArea(List<? extends Shape> list){
        double sum = 0.0;
        for (Shape shape : list) {
            sum += shape.area();
        }
        return sum;
    }
}
