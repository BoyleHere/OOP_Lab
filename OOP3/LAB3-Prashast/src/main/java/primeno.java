/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

public class primeno {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the range of numbers: \n");
        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        System.out.println("The prime numbers in the given range are: ");
        for (int i = a1; i <= a2; i++){
            for (int j = 2; j <= (i/2); j++){
                if (i%j == 0) break; else if (j == (i/2))
                    System.out.println(i);
            }
            
        }
    }
}
