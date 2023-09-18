/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
interface Calculator{
    double area();
}

class Rectangle implements Calculator{
    double length, breadth;
    Rectangle(double l, double b){
        length=l;
        breadth=b;
    }
    public double area(){
        return length*breadth;
    }
}

class Circle implements Calculator{
    double radius;
    Circle(double r){
        radius=r;
    }
    public double area(){
        return 3.14*radius*radius;
    }
}

public class areafigs2{
    public static void main(String args[]){
        Calculator r= new Rectangle(40,100);
        System.out.println(r.area());
        r= new Circle(100);
        System.out.println(r.area());
    }
}
