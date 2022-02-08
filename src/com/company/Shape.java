package com.company;

public class Shape {
    private String color;
    private boolean filled;

    public Shape(){
        setColor("green");
        setFilled(true);
    }

    public Shape(String color, boolean filled) {
        setColor(color);
        setFilled(filled);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    @Override
    public String toString() {
        if(!filled) {
            return "A Shape with color " + color + " and not filled";
        }
        else {
            return "A Shape with color " + color + " and filled";
        }
    }
}
