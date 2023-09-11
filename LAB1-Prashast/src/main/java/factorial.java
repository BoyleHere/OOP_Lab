import java.util.Scanner;
public class factorial{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number to calculate the factorial of:");
        int a=sc.nextInt();
        int val=1;
        for(int i=1;i<=a;i++){
            val*=i;
        }
        System.out.println(val);
    }
}
