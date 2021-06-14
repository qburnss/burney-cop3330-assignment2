/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex31;

import java.util.Scanner;

public class solution31 {
    public static boolean validNumber(String valid)
    {
        try
        {
            Integer.parseInt(valid);
        }
        catch(Exception q)
        {
            return false;
        }
        return true;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int restingHR, youRage;
        while(true)
        {
            System.out.print("Enter Resting Pulse: ");
            String input = sc.next();
            if(validNumber(input))
            {
                restingHR = Integer.parseInt(input);
                break;
            }
            else
            {
                System.out.println("This is not a valid pulse measurement.");
            }
        }
        while(true)
        {
            System.out.print("Enter Age: ");
            String input = sc.next();
            if(validNumber(input))
            {
                youRage = Integer.parseInt(input);
                break;
            }
            else
            {
                System.out.println("This is not a valid age measurement.");
            }
        }
        System.out.println("Intensity\t||\t    Rate");
        for(int i = 55 ; i <= 95 ; i += 5)
        {
            int TargetHeartRate = ((220 - youRage - restingHR) * i/100) + restingHR;
            System.out.println(i+"%\t\t    ||\t\t"+TargetHeartRate+" bpm");
        }
    }

}
