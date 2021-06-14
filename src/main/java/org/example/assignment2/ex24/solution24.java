/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex24;

import java.util.Scanner;

public class solution24 {

    private static final Scanner in = new Scanner(System.in);
    private static String word1;
    private static String word2;
    public static void main(String[] args){
        System.out.println("Enter two words and I'll tell you if they are anagrams:");
        readUserInput();
        AnagramDetector ad = new AnagramDetector();
        boolean result = ad.isAnagram(word1, word2);

        String output = generatedOutput(result);
        System.out.println(output);
    }
    public static void readUserInput(){
        System.out.println("Enter word 1");
        word1 = in.next();
        System.out.println("Enter word 2");
        word2 = in.next();
    }

    public static String generatedOutput(boolean isAnagram) {
        String output;
        if(isAnagram){
            output = word1 + " and " + word2 + " are anagrams.";
        }
        else{
            output= word1 + " and " + word2 + " are not anagrams.";
        }
        return output;
    }
}
