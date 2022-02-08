package com.company;

public class Circle extends Shape{
    private double radius;

    public Circle(){
        setRadius(1.0);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Circle(double radius){
        setRadius(radius);
    }

    public Circle(double radius, String color, boolean filled) {
        setRadius(radius);
        setColor(color);
        setFilled(filled);
    }

    public double getArea() {
        return 3.14*Math.pow(radius, 2);
    }

    public double getPerimeter() {
        return 2*3.14*radius;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius + " which is a subclass of " + super.toString();
    }
}
