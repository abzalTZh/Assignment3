package com.company;

public class Square extends Rectangle{
    public Square() {
        setSide(1.0);
    }

    public Square(double side) {
        setSide(side);
    }

    public Square(double side, String color, boolean filled) {
        setSide(side);
        setColor(color);
        setFilled(filled);
    }

    @Override
    public void setLength(double side) {
        super.setLength(side);
    }

    @Override
    public void setWidth(double side) {
        super.setWidth(side);
    }

    public double getSide() {
        return getLength();
    }

    public void setSide(double side) {
        super.setLength(side);
        super.setWidth(side);
    }

    @Override
    public double getArea() {
        return Math.pow(getSide(), 2);
    }

    @Override
    public double getPerimeter() {
        return getSide()*4;
    }

    @Override
    public String toString() {
        return "A Square with side " + getSide() + " which is a subclass of " + super.toString();
    }
}
