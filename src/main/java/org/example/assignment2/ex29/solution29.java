/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex29;

import java.util.Scanner;

public class solution29 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double rate;

        while(true) {

            try
            {
                System.out.print("What is the rate of return? ");
                String Return = scanner.next();
                rate = Double.parseDouble(Return);
                if(rate == 0)
                    throw new Exception();
                break;
            }
            catch(Exception f)
            {
                System.out.println("Sorry. That's not a valid input.");
            }

        }
        int time = (int)(72/rate);
        System.out.println("It will take "+time+" years to double your initial investment.");
    }
        }

