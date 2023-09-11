/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */



public class pattern {
    public static void main(String[] args){
    int n = 5;
    int i, j, k = 1;
    for (i = 1; i <= n; i++) {
        for (j = 1; j <= i; j++) {
            System.out.print(k + " ");
            k++;
        }
    System.out.println();
        }		
    }
}