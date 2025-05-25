package Aula8v2.model.entities;

import Aula8v1.model.enums.Color;

public abstract class AbstractShape implements Shape {

    private Color color;

    public AbstractShape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Type: " + getClass().getSimpleName() + "\nColor: " + getColor() + " Area: " + String.format("%.2f", area());
    }

}
