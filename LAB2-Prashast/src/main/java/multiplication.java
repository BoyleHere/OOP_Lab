
/*Write a Java program to multiply and divide a number by 2 using bitwise operator. [Hint:
use left shift and right shift bitwise operators]*/

//Q3

import java.util.Scanner;

public class multiplication {
    public static void main(String[] args) {
        int a,b;
    System.out.println("Enter a number:");
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    int anew = a<<1;
    int bnew = a>>1;
        System.out.println(a+" multiplied by 2 is " +anew);
        System.out.println(a+" divided by 2 is "+bnew);
    }
}
