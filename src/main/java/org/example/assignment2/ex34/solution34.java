/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex34;

import java.util.Scanner;

public class solution34 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Hokage konoha = new Hokage();
        konoha.create();
        konoha.print();
        System.out.printf("%nEnter an Hokage's name to remove: ");
        String hokage = in.nextLine().trim();
        String byehokage = konoha.remove(hokage);
        System.out.println(byehokage);
        konoha.print();
    }
}
