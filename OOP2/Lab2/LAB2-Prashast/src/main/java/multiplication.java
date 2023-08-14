/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

/*Write a Java program to multiply and divide a number by 2 using bitwise operator. [Hint:
use left shift and right shift bitwise operators]*/

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        int a,b;
    System.out.println("Enter a number to be multiplied with 2 :");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    int anew = a<<1;
    System.out.println("Enter a number to divided by 2: ");
    b=sc.nextInt();
    int bnew =b>>1;
        System.out.println(a+" multiplied by 2 is " +anew);
        System.out.println(b+" divided by 2 is "+bnew);
    
    }
}
