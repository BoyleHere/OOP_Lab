/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author student
 */

//Q5

import java.util.Scanner;

public class magiksq{
    public static void main(String args[])
    {
        int b[][],i,j,n,sum=0,sum1=0,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the order of the Matrix:");
        n=sc.nextInt();
        System.out.println("Enter the elements:");
        b= new int[n][n];
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        for(i=0;i<1;i++)
        {
            for(j=0;j<n;j++)
                sum+=b[i][j];
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sum1+=b[i][j];
                if(sum==sum1)
                    flag=0;
                else
                {
                      flag=1;
                break;  
                }
            }
            sum1=0;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                sum1+=b[j][i];
                if(sum==sum1)
                    flag=0;
                else
                {
                      flag=1;
                break;  
                }
            }
            sum1=0;
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i==j)
                {
                    sum1+=b[i][j];
                    if(sum==sum1)
                    flag=0;
                else
                {
                      flag=1;
                break;  
                }
                }
                    
            }
        }
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                if(i+j==n-1)
                {
                    sum1+=b[i][j];
                    if(sum==sum1)
                    flag=0;
                else
                {
                      flag=1;
                break;  
                }
                }
            }
        }
        if(flag==0)
        {
            System.out.println("Matrix is a magic square");
        }
        else if(flag==1)
            System.out.println("Matrix is not a magic square");
    }
}
