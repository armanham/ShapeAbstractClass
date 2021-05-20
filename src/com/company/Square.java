package com.company;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        setSide(side);
    }

    public Square() {

    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        double area = Math.pow(getSide(), 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 4 * getSide();
        return perimeter;
    }

    public void display() {
        System.out.println("Area of square is: " + getArea());
        System.out.println("Perimeter of square is: " + getPerimeter());
    }
}
