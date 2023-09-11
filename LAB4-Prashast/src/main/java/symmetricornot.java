/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

public class symmetricornot {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n,m,i,j,symm=1;
        System.out.println("Enter order of matrix:");
        n = sc.nextInt();
        int[][] a = new int[n][n];
        
        System.out.println("Enter matrix elements:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        
        System.out.print("\n");
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]);
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
        
        int[][] b = new int[n][n];
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                b[j][i]=a[i][j];
            }
        }
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(b[i][j]);
            }
            System.out.print("\n");
        }
        
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(b[i][j]!=a[i][j]){
                    symm=0;
                    break;
                }
            }
        }
        
        if(symm==1)
            System.out.println("Matrix is symmetric");
        else
            System.out.println("Matrix is asymmetric");
    }
}
