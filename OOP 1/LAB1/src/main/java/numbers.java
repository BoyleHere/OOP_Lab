/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

/* Write a Java program to enter 10 numbers and display the number of positive,negative
and zeros number*/
import java.util.Scanner;

public class numbers {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        int[] numbers = new int[10];
        int positive = 0;
        int negative = 0;
        int zero = 0;
        System.out.println("Enter the Numbers: \n");
        for (int i = 0; i<10; i++){
            numbers[i] = myObj.nextInt();
        }
        for(int num : numbers){
            if (num > 0){
                positive++;
            }
            else if (num < 0){
                negative++;
            }
            else{
                zero++;
            }
        }
        System.out.println("The number of positive numbers is: "+ positive);
        System.out.println("The number of negative numbers is: "+ negative);
        System.out.println("The number of zeros is: "+ zero);
    }
}
