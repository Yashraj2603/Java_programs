package com.company;
import java.util.Scanner;
public class Sum
{
    public static void main(String[]args)
    {
        int sum=0;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number of numbers ,you want to print");
        int n=s.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the following Numbers:");
        for(int i=0;i<n;i++)
        {
           num[i]=s.nextInt();
           sum=num[i]+sum;
        }
        System.out.println("The sum="+sum);
    }
}