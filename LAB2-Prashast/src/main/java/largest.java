import java.util.Scanner;

class largest {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter value for a");
        int a=sc.nextInt();
        System.out.println("Enter value for b");
        int b=sc.nextInt();
        System.out.println("Enter value for c");
        int c=sc.nextInt();

        int max=(a>b)?(Math.max(a, c)):(Math.max(b, c));
        int min=(a<b)?(Math.min(a, c)):(Math.min(b, c));
        System.out.println("The Largest No is "+max);
        System.out.println("The Smallest No is "+min);



    }}