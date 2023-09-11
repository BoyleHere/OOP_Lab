//Q5

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1, n2, ans;
        char oper, ch;
        do {
            System.out.println("Enter first number, operator, second number : ");
            n1 = sc.nextDouble();
            oper = sc.next().charAt(0);
            n2 = sc.nextDouble();
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
            ch = sc.next().charAt(0);
        } while (ch != 'n');
    }
}

