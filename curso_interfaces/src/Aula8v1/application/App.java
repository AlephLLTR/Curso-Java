package Aula8v1.application;

import Aula8v1.model.entities.Circle;
import Aula8v1.model.entities.Rectangle;
import Aula8v1.model.entities.Shape;
import Aula8v1.model.enums.Color;

public class App {
    public static void main(String[] args) {
        
        Shape circ = new Circle(Color.BLACK, 2.0);
        Shape rect = new Rectangle(Color.RED, 3.0, 4.0);

        System.out.println(circ);
        System.out.println(rect);

    }
}
