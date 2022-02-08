package com.company;

public class Main {
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape("pink", false);

        System.out.println(shape1.toString());
        System.out.println(shape2.toString() + "\n");

        Circle circle1 = new Circle();
        Circle circle2 = new Circle(2.5);
        Circle circle3 = new Circle(1.5, "pink", false);

        System.out.println("Area is " + circle1.getArea() + " and perimeter " + circle1.getPerimeter());
        System.out.println("Area is " + circle2.getArea() + " and perimeter " + circle2.getPerimeter());
        System.out.println("Area is " + circle3.getArea() + " and perimeter " + circle3.getPerimeter());
        System.out.println(circle3.toString() + "\n");

        Rectangle rec1 = new Rectangle();
        Rectangle rec2 = new Rectangle(1.5, 3.0);
        Rectangle rec3 = new Rectangle(6.2, 3.5, "cyan", false);

        System.out.println("Area is " + rec1.getArea() + " and perimeter " + rec1.getPerimeter());
        System.out.println("Area is " + rec2.getArea() + " and perimeter " + rec2.getPerimeter());
        System.out.println("Area is " + rec3.getArea() + " and perimeter " + rec3.getPerimeter());
        System.out.println(rec3.toString() + "\n");

        Square square1 = new Square();
        Square square2 = new Square(1.7);
        Square square3 = new Square(4.0, "red", true);

        System.out.println("Area is " + square1.getArea() + " and perimeter " + square1.getPerimeter());
        System.out.println("Area is " + square2.getArea() + " and perimeter " + square2.getPerimeter());
        System.out.println("Area is " + square3.getArea() + " and perimeter " + square3.getPerimeter());
        System.out.println(square3.toString() + "\n");
    }
}
