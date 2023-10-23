/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lab10.prashast;

/**
 *
 * @author student
 */
import java.util.*;
public class numformat {
    public static void main(String[] args) {
        String s;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter string");
        s=sc.nextLine();
        int n;
        try
        {
            n = Integer.parseInt(s);
            System.out.println("n="+n);
        }
        catch(Exception e)
            {
                    
                    e.printStackTrace();
            }
    }
}

