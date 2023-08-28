/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

//Q5

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double n1, n2, ans;
        char oper, ch;
        do {
            System.out.print("\nEnter first number, operator, second number : ");
            n1 = myObj.nextDouble();
            oper = myObj.next().charAt(0);
            n2 = myObj.nextDouble();
            switch (oper) {
                case '+':
                    ans = n1 + n2;
                    break;
                case '-':
                    ans = n1 - n2;
                    break;
                case '*':
                    ans = n1 * n2;
                    break;
                case '/':
                    ans = n1 / n2;
                    break;
                default:
                    ans = 0;
            }
            System.out.println("Answer = " + ans);
            System.out.print("\nDo another(Enter 'y' or 'n') ? ");
            ch = myObj.next().charAt(0);
        } while (ch != 'n');
    }
}

