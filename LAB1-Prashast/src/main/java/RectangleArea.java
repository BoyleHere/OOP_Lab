/**
 *
 * @author student
 */
import java.util.Scanner;
public class RectangleArea {
    public static void main(String[] args){
        float l, b, area, cir;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length: ");
        l = sc.nextFloat();
        System.out.println("Enter the breadth: ");
        b = sc.nextFloat();
        area = l*b;
        cir = 2*(l+b);
        System.out.println("Area of rectangle is: " + area);
        System.out.println("Circumference of rectangle is: " + cir);
    }
}


