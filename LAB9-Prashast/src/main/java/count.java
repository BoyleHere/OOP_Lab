/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Scanner;
public class count {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
         System.out.println("Enter the String: ");
        String s;
        int count=0,count2=0,count3=0,count4=0;
        s=sc.nextLine();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)!=' '&&s.charAt(i)!='.')    
                count++; 
        }
        for(int i=0;i<s.length();i++)
        {
            if(i+1==s.length()||s.charAt(i)==' ')
               count2++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='.')
               count3++;
        }
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U')
               count4++;
        }
        System.out.println("Number of Characters are: "+count);
        System.out.println("Number of words are: "+count2); 
        System.out.println("Number of lines are: "+count3); 
        System.out.println("Number of vowels are: "+count4);
    }
}
