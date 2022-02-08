package com.company;

public class Rectangle extends Shape{
    private double width;
    private double length;

    public Rectangle(){
        setLength(1.0);
        setWidth(1.0);
    }

    public Rectangle(double width, double length){
        setLength(length);
        setWidth(width);
    }

    public Rectangle(double width, double length, String color, boolean filled){
        setLength(length);
        setWidth(width);
        setColor(color);
        setFilled(filled);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getArea(){
        return width*length;
    }

    public double getPerimeter(){
        return 2*(width+length);
    }

    @Override
    public String toString() {
        return "A Rectangle with width " + width + " and length " + length + " which is a subclass of " + super.toString();
    }
}
