/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

public class Matrixmulti {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of rows of matrix A: ");
        int ra = sc.nextInt();
        
        System.out.println("Enter the number of columns of matrix A (which will be the number of rows for matrix B): ");
        int cab = sc.nextInt();
        
        System.out.println("Enter the number of columns of matrix B: ");
        int cb = sc.nextInt();
        
        int[][] a = new int[ra][cab];
        int[][] b = new int[cab][cb];
        int[][] c = new int[ra][cb];
        
        System.out.println("\nEnter values for matrix A : ");
        for (int i = 0; i < ra; i++) {
        for (int j = 0; j < cab; j++) a[i][j] = sc.nextInt();
        }
    
        System.out.println("\nEnter values for matrix B : ");
        for (int i = 0; i < cab; i++) {
        for (int j = 0; j < cb; j++) b[i][j] = sc.nextInt();
        }
        
        for (int i = 0; i<ra; i++){
            for (int j = 0; j<cb; j++){
                c[i][j] = 0;
                for (int k = 0; k<cab; k++){
                    c[i][j] += a[i][k]*b[k][j];
                }
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}
