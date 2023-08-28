/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

/*Write a Java program to find whether a given year is leap or not using boolean data type.*/

//Q1
import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int num = myObj.nextInt();
        if ( (num%4 == 0) & (num%100 != 0) ){
            System.out.println("Given year is a leap year.");
        }
        else if((num%100 == 0) & (num%400 == 0)){
            System.out.println("Given year is a leap year.");
        }
        else{
            System.out.println("Given year is not a leap year.");
        }
    }
}
