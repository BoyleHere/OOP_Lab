import java.util.Scanner;
public class numtable{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to print the table of:");
        int n = sc.nextInt();
        for(int i=1; i<11; i++){
            System.out.println("5*"+i+" = "+n*i);
        }
    }
}
