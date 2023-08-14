/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class rectarea {
    public static void main(String[] args){
        float l, b, area, cir;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: \n");
        l = sc.nextFloat();
        System.out.println("Enter the breadth: \n");
        b = sc.nextFloat();
        area = l*b;
        cir = 2*(l+b);
        System.out.println("Area OF rectangle is: " + area);
        System.out.println("Circumference of rectangle is: " + cir);
    }
}
