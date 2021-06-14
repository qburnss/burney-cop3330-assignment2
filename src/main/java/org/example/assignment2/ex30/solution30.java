/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex30;

public class solution30 {
    public static void main(String[] args)
    {
        final int timesTable = 12;
        for(int i = 1; i <= timesTable; i++)
            System.out.print(area(i) + " ");
        System.out.println();
       for(int i = 1; i <= timesTable; i++)
        {
            for(int x = 1; x <= timesTable; x++)
            {
                System.out.print(area(i * x) + " ");
            }
            System.out.println();
        }
    }
    public static String area(int digit)
    {
        String d;
        if(digit < 10) d = "  " + digit;
        else if(digit < 100) d = " " + digit;
        else d = "" + digit;
        return d;
    }
}
