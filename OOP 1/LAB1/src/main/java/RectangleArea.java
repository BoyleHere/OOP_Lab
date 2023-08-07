/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
public class RectangleArea {
	public static void main(String args[]){
		int length, breadth;
		length = Integer.parseInt("20"); // cmd line args
		breadth = Integer.parseInt("10"); //convert string to integer
		int area = length*breadth;
                int circum = 2*(length + breadth); 
		System.out.println("length of rectangle =" + length);
		System.out.println("breadth of rectangle =" + breadth);
		System.out.println("area of rectangle =" + area);
                System.out.println("circumference of rectangle =" + circum);
	}
}

