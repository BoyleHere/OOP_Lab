/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

import java.util.Scanner;

class Box {
    double width;
    double height;
    double depth;
    // This is the constructor for Box.
    Box() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Constructing box...");
        width = sc.nextInt();
        height = sc.nextInt();
        depth = sc.nextInt();
    }
// compute and return volume
    double volume() {
        return width * height * depth;
    }
}
    public class volumefn {
        public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
// declare, allocate, and initialize Box objects
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        double vol;
// get volume of first box
        vol = mybox1.volume();
        System.out.println("Volume of box 1 is " + vol);
// get volume of second box
        vol = mybox2.volume();
        System.out.println("Volume of box 2 is " + vol);
    }
}


