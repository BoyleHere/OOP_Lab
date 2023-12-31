/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
abstract class Calculator{
    double ar;
    abstract void area();
    void printer(){
        area();
        System.out.println(ar);
    }
}

class Rectangle extends Calculator{
    double length;
    double width;
    Rectangle(double l,double w){
        length=l;
        width=w;
    }
    @Override
    void area(){
        ar = length*width;
    }
}

class Circle extends Calculator{
    double radius;
    Circle(double r){
        radius=r;
    }
    @Override
    void area(){
        ar= 3.14*radius*radius;
    }
}

public class areafigs{
    public static void main(String args[]){
        Rectangle r= new Rectangle(100,40);
        r.printer();
        Circle c=new Circle(100);
        c.printer();
    }
}
