/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

//Q4

import java.util.Scanner;

public class searching {
    public static void main(String[] args) {
        int search, index=0;
        int a[] = {1,2,3,1,2,1,5,6,7}; 
        
        System.out.println("Enter the value to be searched: ");
        Scanner sc = new Scanner(System.in);
        search=sc.nextInt();
        
        for( int i : a){
            if(i==search){
                System.out.println("a["+index+"]");
            }
            index++;
        }
    }
}
