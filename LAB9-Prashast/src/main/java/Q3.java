/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.Arrays;
import java.util.Scanner;
public class Q3 {
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.println("Enter the String:");
        str=sc.nextLine();
        int choice;
        int n=str.length();
        System.out.println("""
                           Enter option:
                            1. Palindrome or not
                            2. String in Alphabetical order
                            3. Reverse the String
                            4. Concate the String""");
        System.out.println("Enter the choice:");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1 -> {
                int flag = 0;
                for(int i=0;i<n/2;i++)
                {
                    if(str.charAt(i)!=str.charAt(n-i-1))
                        flag=1;
                }
                if(flag==0)
                    System.out.println("String is PALINDROME");
                else
                    System.out.println("String is not PALINDROME");
            }
            case 2 -> {
                char charArray[] = str.toCharArray();
                for(int i = 0; i < n; i++ ) {
                    for(int j = i+1; j < n; j++) {
                        if(charArray[i]>charArray[j]) {
                            char temp = charArray[i];
                            charArray[i] = charArray[j];
                            charArray[j] = (char) temp;
                        }
                    }
                }
                System.out.println("Sorted Array is: "+Arrays.toString(charArray));
            }
            case 3 -> {
                String reversedStr="";
                for(int i = str.length()-1; i >= 0; i--){
                    reversedStr = reversedStr + str.charAt(i);    
                }
                System.out.println("Reversed String is: "+reversedStr);
            }
            case 4 -> {
                System.out.println("Enter the String to concatenate:");
                String s=sc.nextLine();
                System.out.println("Concatenated String is: "+str.concat(s));
            }
        }
        
    }
}

