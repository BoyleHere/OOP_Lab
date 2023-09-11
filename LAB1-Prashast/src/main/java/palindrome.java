import java.util.Scanner;
public class palindrome{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int temp = n, rem, rev=0;
        while(n != 0){
            rem = n%10;
            rev = rev*10+rem;
            n /= 10;
        }
        if (temp == rev){
            System.out.println("Number is a palindrome");
        }
        else{
            System.out.println("Number is not a palindrome");
        }
    }
}
