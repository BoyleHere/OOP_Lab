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

public class negroot
{
    public static void main(String[] args) throws ArithmeticException

    {

        try{
            Scanner input = new Scanner(System.in);

            int num;
          System.out.println("Enter the number: ");

            num = input.nextInt();

            if(num >= 0)
            {

                double root = Math.sqrt(num);
                System.out.println("The square root of " + num + " is " + root);
         }

            else if(num <0)
            {
                throw new ArithmeticException();
            }

        } 
        catch(ArithmeticException e) 
        {
            System.out.println("Can't take the square root from a negative number");
        }

    }
}

