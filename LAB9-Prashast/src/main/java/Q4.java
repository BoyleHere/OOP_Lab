/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.*;
public class Q4 {
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
        int c;
        System.out.println("Enter String:");
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        int n1 =s1.length();
        int n2 =s2.length();
        System.out.println("Enter option:"
                + "\n 1 - Compare"
                + "\n 2 - Uppercase to lower and vice versa"
                + "\n 3 - SubString or not"
                + "\n 4 - Replace with hello");
        
        c=sc.nextInt();
        switch(c){
            case 1: 
            {
                System.out.println(s1.equals(s2));
                break;
            }
            case 3:
            {
                boolean result = s1.contains(s2);
                if(result) {
                    System.out.println(s2 + " is present in the string.");
                }
                else {
                    System.out.println(s2 + " is not present in the string.");
                }
                break;
            }
            case 4:
            {
                
            }
        }
    }
}
