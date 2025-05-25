package Aula4a.model.entities;

import Aula4a.model.interfaces.Shape;

public class Rectangle implements Shape {
    private Double width;
    private Double height;

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Rectangle(Double width, Double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area() {
        return getHeight() * getWidth();
    }

}
