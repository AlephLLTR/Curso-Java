package Aula8v2.application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import Aula8v1.model.enums.Color;
import Aula8v2.model.entities.AbstractShape;
import Aula8v2.model.entities.Circle;
import Aula8v2.model.entities.Rectangle;

public class App {
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);

        List<AbstractShape> list = new ArrayList<>();

        AbstractShape s1 = new Circle(Color.ORANGE, 2.0);
        AbstractShape s2 = new Rectangle(Color.BLUE, 4.0, 3.0);

        list.add(s1);
        list.add(s2);

        for (AbstractShape shape : list) {
            System.out.println(shape);
        }

    }
}
