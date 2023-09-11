import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int num = sc.nextInt();
        if ( (num%4 == 0) & (num%100 != 0) ){
            System.out.println("Given year is a leap year.");
        }
        else if((num%100 == 0) & (num%400 == 0)){
            System.out.println("Given year is a leap year.");
        }
        else{
            System.out.println("Given year is not a leap year.");
        }
    }
}
