package com.company;

public class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle() {

    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        double area = Math.PI * Math.pow(getRadius(), 2);
        return area;
    }

    @Override
    public double getPerimeter() {
        double perimeter = 2 * Math.PI * getRadius();
        return perimeter;
    }

    public void display() {
        System.out.println("Area of circle is: " + getArea());
        System.out.println("Perimeter of circle is: " + getPerimeter());
    }
}
