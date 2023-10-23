/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
abstract class Shape {
    abstract double computeArea();
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double computeArea() {
        return side * side;
    }
}

class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    double computeArea() {
        return 0.5 * base * height;
    }
}


public class additional1 {
    public static void main(String[] args) {
        Square square = new Square(5.0);
        Triangle triangle = new Triangle(4.0, 3.0);

        double squareArea = square.computeArea();
        double triangleArea = triangle.computeArea();

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}

