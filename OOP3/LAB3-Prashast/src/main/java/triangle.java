/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

public class triangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of lines: \n");
        int n = sc.nextInt();
        System.out.println("\n");
        for (int i = 1; i <= n; i++){
            for (int j = i; j > 0; --j){
                System.out.print(i + " ");
            }
            System.out.println("\n");
        }
    }
}
