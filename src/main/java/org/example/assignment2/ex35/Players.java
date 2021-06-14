package org.example.assignment2.ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Players {
    private static final Scanner scan = new Scanner(System.in);
    public ArrayList<String> players = new ArrayList<String>();
    public int length = 0;

    public int randomnumber()
    {
        Random rand = new Random();
        int randy = rand.nextInt(this.length);
        return randy;
    }
    public void readnames()
    {
        System.out.print("Enter a name: ");
        String name = scan.nextLine();

        for(int i=0; !name.isBlank(); i++)
        {
            this.length ++;
            players.add(name);
            System.out.print("Enter a name: ");
            name = scan.nextLine();
        }
    }

    public String winner(int randy)
    {
        String dubski = ("The Winner is... " + this.players.get(randy) + ".");
        return dubski;
    }
}
