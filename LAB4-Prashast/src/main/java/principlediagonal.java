/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

public class principlediagonal {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n, i, j, sum = 0;
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
        System.out.println("Principle diagonal elements: ");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i == j){
                    System.out.print(a[i][j]);
                    for (int k = 2; k<a[i][j]; k++){
                        if (a[i][j]%k == 0) break;
                        else if(a[i][j]%k != 0) sum += a[i][j];
                    }
                }
            }
            System.out.print("\n");
            
        }
        System.out.println("Sum of Prime Principle diagonal elements = " + sum);
    }
}

