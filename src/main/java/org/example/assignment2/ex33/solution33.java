/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */

package org.example.assignment2.ex33;

import java.util.Random;
import java.util.Scanner;

public class solution33 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            System.out.println("What is your question?");
            System.out.print("> ");
            String question = scanner.nextLine();
            System.out.println(MagicBall());

    }
    public static String MagicBall()
    {
        Random response = new Random();
        int solution = response.nextInt(4 + 1) ;

        return switch (solution) {
            case 1 -> "Yes";
            case 2 -> "No";
            case 3 -> "Maybe";
            case 4 -> "Ask again later";
            default -> "Ask again later";
        };
    }
}
