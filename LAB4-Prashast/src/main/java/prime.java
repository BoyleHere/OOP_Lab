/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */
public class prime{ 
    public static void main(String args[]){

        int a[]={10,15,11,23,66,3};

        for(int i=0;i<a.length;i++) {
                int found=1;
                for(int j=2;j<a[i];j++){
                        if(a[i]%j==0) found=0;
                }
                if(found==1) System.out.println(a[i]);
        }
    }
}