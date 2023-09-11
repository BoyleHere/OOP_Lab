import java.util.Scanner;

public class coversions {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter int: ");
        int intnum = myObj.nextInt();
        System.out.println("Enter double: ");
        double doublenum = myObj.nextDouble();
        System.out.println("Enter char: ");
        char charnum = myObj.next().charAt(0);
        byte byteconv = (byte) intnum;
        int charconv = (int) charnum;
        byte doubleconv = (byte) doublenum;
        int intconv = (int) doublenum;
        System.out.println("Converted byte value from int: " + byteconv);
        System.out.println("Converted int value from char: " + charconv);
        System.out.println("Converted byte value from double: " + doubleconv);
        System.out.println("Converted int value from double: " + intconv);
    }
}
