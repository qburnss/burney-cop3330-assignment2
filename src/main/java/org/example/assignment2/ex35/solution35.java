/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex35;

public class solution35 {
    public static void main(String[] args)
    {
        Players player = new Players();
        System.out.println("To stop making entries, enter a blank space.");
        player.readnames();
        String winner = player.winner(player.randomnumber());
        System.out.println(winner);
    }
}
