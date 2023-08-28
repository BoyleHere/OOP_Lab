/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

public class nonprinciplediagonal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j;
        System.out.println("Enter the order of the matrix: ");
        n = sc.nextInt();
        
        int[][] a = new int[n][n];
        
        System.out.println("Enter matrix elements:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.println();
        System.out.println("Non principle diagonal elements: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i+j==(n-1)){
                System.out.print(a[i][j]);
                }
            }
            System.out.print("\n");
            
        }
    }
}
