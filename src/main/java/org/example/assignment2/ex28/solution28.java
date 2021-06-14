/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex28;

import java.util.Scanner;

public class solution28 {
    public static void main (String[] args) {
        Scanner scan=new Scanner(System.in);
        int i = 1;
        int sum = 0;
        int numbers;

        while(i < 6)
        {
            System.out.print("Enter a number: ");
            numbers =scan.nextInt();
            sum +=numbers;
            i++;
        }
        System.out.println("The total is " + sum);
    }
}
