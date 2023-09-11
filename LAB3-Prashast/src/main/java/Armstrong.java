//Q1

import java.util.Scanner;
import java.lang.Math;

public class Armstrong {
    public static void main(String[] args) {
        int num, a, b, n=0, sum = 0;
        System.out.println("Enter a number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        b = num;
        while (num != 0){
            num /= 10;
            n++;
        }
        num = b;
        while (num != 0){
            a = num%10;
            num = num/10;
            sum += (int) Math.pow(a,n);
        }
        if(sum == b)
            System.out.println(b+" is an Armstrong number.");
        else
            System.out.println(b+" is not an Armstrong number.");
        
    }
}

