/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */



/**
 *
 * @author student
 */
import java.util.Arrays;
import java.util.*;
public class ArrayposSwap {

    public static <T> void swapElements(T[] array, int index1, int index2) {
        if (index1 < 0 || index1 >= array.length || index2 < 0 || index2 >= array.length) {
            System.out.println("Invalid indices. Unable to swap elements.");
            return;
        }

        T temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }

    public static void main(String[] args) {
        // Example usage
        Scanner sc=new Scanner(System.in);
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Original Array: " + Arrays.toString(intArray));
System.out.println("enter the positions to exchange");
        swapElements(intArray, sc.nextInt(), sc.nextInt()); // Swap elements at index 1 and 3
        System.out.println("After Swapping: " + Arrays.toString(intArray));

        String[] strArray = {"apple", "banana", "cherry", "date"};
        System.out.println("Original Array: " + Arrays.toString(strArray));
System.out.println("enter the positions to exchange");
        swapElements(strArray, sc.nextInt(), sc.nextInt()); // Swap elements at index 0 and 2
        System.out.println("After Swapping: " + Arrays.toString(strArray));
    }
}
