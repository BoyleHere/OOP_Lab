/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
import java.util.*;

public class trace{

    public static void main(String args[]) {

        Scanner sc= new Scanner(System.in);
        System.out.println("Enter order number ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int[][] arr=new int[50][50];
        int sum=0,Norm=0;

        System.out.println("Enter Elements");
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                arr[i][j]=sc.nextInt();
            } 
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                System.out.println(+arr[i][j]+"\t");
            }
            System.out.print("\n");
        }

        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                Norm=Norm+arr[i][j]*arr[i][j];
                if(i+j==m-1) {
                    sum=sum+arr[i][j];
                }
            }
        }

        System.out.println("The Trace is "+sum+"\nNorm "+Norm);
    }
}
