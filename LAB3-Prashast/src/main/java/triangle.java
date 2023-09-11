/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

//Q2

import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: ");
        int n = sc.nextInt();
        System.out.println();
        for (int i = 1; i <= n; i++){
            for (int j = i; j > 0; --j){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
