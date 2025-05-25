package Aula8v1.model.entities;

import Aula8v1.model.enums.Color;

public abstract class Shape {
    private Color color;

    public Shape(Color color) {
        this.color = color;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double area();

    @Override
    public String toString() {
        return "Type: " + getClass().getSimpleName() + "\nColor: " + getColor() + " Area: " + String.format("%.2f", area());
    }

    
}
