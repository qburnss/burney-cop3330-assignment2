/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex32;

import java.util.Random;
import java.util.Scanner;

public class solution32 {
    private final Scanner in = new Scanner(System.in);
    public static void main(String[] args)
    {
        solution32 done = new solution32();
        System.out.println("Let's play a guessing game. WooHoo -_-\n");
        done.loop();
    }
    public int levelSelect()
    {
        int level = 0;
        System.out.print("Enter the level you wanna play -> 1, 2, 3: ");

        while(!in.hasNextInt())
            in.next();
        level = in.nextInt();
        return level;
    }
    public void play()
    {
        int number = 0;
        int guesses = 0;
        boolean stop = false;
        int level = levelSelect();
        number = getrandomnumber(level);
        System.out.print("What's your guess? ");
        while(!stop)
        {
            while (!in.hasNextInt()) {
                guesses++;
                System.out.print("Nah.Again: ");
                in.next();
            }

            int guess = in.nextInt();

            if (guess > number)
            {
                System.out.print("Too high. Again: ");
                guesses++;
            }
            else if (guess < number)
            {
                System.out.print("Too low. Again: ");
                guesses++;
            }
            else if (guess == number)
            {
                guesses++;
                System.out.println("You got it in " + guesses + " guesses!");
                stop = true;
            }
        }
    }
    public void loop()
    {
        String pass = "y";
        boolean stop = false;

        do {
            play();
            System.out.println();
            System.out.print("Do you wish to play again (Y/N)? ");
            pass = in.next();

            if(pass.equals("n") || pass.equals("N"))
                stop = true;
        } while(!stop);
    }

    public int getrandomnumber(int level)
    {
        Random rand = new Random();
        int i = 1, select = 1;

        switch(level) {
            case 1:
                select = rand.nextInt((10-i) + 1) + i;
                break;
            case 2:
                select = rand.nextInt((100-i) + 1) + i;
                break;
            case 3:
                select = rand.nextInt((1000-i) + 1) + i;
                break;
        }

        return select;
    }


}
