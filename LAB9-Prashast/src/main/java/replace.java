/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class replace {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        String str;
        char[] Array=new char[10]; 
        int k = 0;
         
        System.out.println("Enter the String: ");
        str=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(int j=i;j<str.length()-1;j++)
            {
                if(str.charAt(i)==str.charAt(j+1))
                {
                    Array[k]=str.charAt(i);
                    k++;
                }
            }
        }
        int l=k;
        System.out.println("Enter the word to replace repeated characters: ");
        String s=sc.nextLine();
        for(int i=0;i<str.length();i++)
        {
            for(k=0;k<l;k++)
            {
                if(Array[k]==str.charAt(i))
                {
                   str= str.replace(str, s);
                }
            }           
        }
        System.out.println("Replaced string is: "+str);
    }
}
