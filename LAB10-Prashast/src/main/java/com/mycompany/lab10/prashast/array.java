/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10.prashast;

/**
 *
 * @author student
 */
public class array{  
  
    public static void main(String[] args) {  
String[] arr = {"Rohit","Ishan","Virat","Gambhir"};   
        try{                             
        for(int i=0;i<=arr.length;i++) {       

             System.out.println(arr[i]);      
        
        }  
        }
        catch(Exception e)
        {
            System.out.println("Exception: ");
            e.printStackTrace();
            
        }
  
    }
}
