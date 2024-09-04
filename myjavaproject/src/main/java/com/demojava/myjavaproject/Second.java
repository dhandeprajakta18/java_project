package com.demojava.myjavaproject;
import java.util.Scanner;

public class Second 
{
    public static void main(String[] ar) 
    {
        Scanner sc = new Scanner(System.in);
        int n, s = 0;
        
        for (int i = 1; i <= 10; i++)
        {
            System.out.print("Enter a number: ");
            n = sc.nextInt();
            if (n > 0) 
            {
                s = s + n;
            }
        }
        System.out.println("Sum of positive numbers = " + s);
        sc.close();
    }
}