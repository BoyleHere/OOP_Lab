/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
public class large{ 
    public static void main(String args[]){

        int a[]={10,15,11,23,66};
        int small=a[0],large=a[0];

        for(int i=1;i<a.length;i++) {
            if(a[i]>large) large=a[i];}

        for(int i=0;i<a.length;i++) {
            if(a[i]<small) small=a[i];}
	
        System.out.println("The Largest Number is "+large);
        System.out.println("The Smallest Number is "+small);
    }
}