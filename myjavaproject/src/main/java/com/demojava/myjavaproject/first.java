package com.demojava.myjavaproject;
import java.io.*;

public class First {

    public static void main(String[] args) throws IOException {
        int b, h;
        float a;
        String s;

        InputStreamReader ip = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(ip);

        System.out.print("Enter base value: ");
        s = br.readLine();
        b = Integer.parseInt(s);

        System.out.print("Enter height value: ");
        s = br.readLine();
        h = Integer.parseInt(s);

        a = 0.5f * b * h;
        System.out.println("Area of triangle = " + a);
    }
}