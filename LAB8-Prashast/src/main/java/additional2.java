/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
interface S {
    double computeArea();
}

class Sq implements S {
    private double side;

    public Sq(double side) {
        this.side = side;
    }

    @Override
    public double computeArea() {
        return side * side;
    }
}

class T implements S {
    private double base;
    private double height;

    public T(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double computeArea() {
        return 0.5 * base * height;
    }
}


public class additional2 {
    public static void main(String[] args) {
        S sq = new Sq(5.0);
        S t = new T(4.0, 3.0);

        double squareArea = sq.computeArea();
        double triangleArea = t.computeArea();

        System.out.println("Area of Square: " + squareArea);
        System.out.println("Area of Triangle: " + triangleArea);
    }
}