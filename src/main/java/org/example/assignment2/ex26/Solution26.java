/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex26;

import java.util.Scanner;

public class Solution26 {
    private double balance;
    private double APR;
    private double monthlyPayment;



    public static void main(String[] args){

        Solution26 app = new Solution26();
        app.ask();
        app.Calc();


    }
      public void ask(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your balance");
         balance = scan.nextDouble();
          //balance = Double.parseDouble(scan.nextLine());
        Scanner ban = new Scanner(System.in);
        System.out.println("What is the APR on the card (as a percent)?");
         APR = ban.nextDouble();
         // APR = Double.parseDouble(ban.nextLine());
        Scanner stan = new Scanner(System.in);
        System.out.println("What is the monthly payment you can make");
         monthlyPayment = stan.nextDouble();
          //monthlyPayment = Double.parseDouble(stan.nextLine());
    }
    public void Calc(){
        PaymentCalculator result = new PaymentCalculator();
        int months = (int) result.calculateMonthsUntilPaidOff();
        System.out.println("It will take you " + months + " months to pay off this card.");
    }
}
