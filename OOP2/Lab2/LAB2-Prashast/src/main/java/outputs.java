/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
public class outputs {
    public static void main(String[] args){
        //part a -> 10.0
        int x = 10;
        double y = x;
        System.out.println(y);
        //part b -> error
        /*double p = 10.5;
        int q = p;
        System.out.println(q);*/
        //part c -> 10.0 is converted to 10
        double p = 10.5;
        int q = (int) p;
        System.out.println(q);
    }
}
