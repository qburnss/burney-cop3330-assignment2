/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Quentin_Burney
 */
package org.example.assignment2.ex27;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.Scanner;

public class solution27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.print("Enter the first name: ");
            String firstname = scan.nextLine();
            System.out.print("Enter the last name: ");
            String lastname = scan.nextLine();
            System.out.print("Enter the ZIP code: ");
            String zipcode = scan.nextLine();
            System.out.print("Enter the employee ID: ");
            String id = scan.nextLine();
            validateInput(firstname, lastname, zipcode, id);


    }
    public static int validateNames(String input) {
        if (input.length() < 1) {
            return 1;
        } else if (!input.matches("[a-zA-Z]+") || input.length() < 2) {//
            return 2;
        }
        return 0;
    }
    public static boolean validateID(String identification) {
        if (identification.length() != 7) return false;

        for (int i = 0; i < 7; i++) {
            char c = identification.charAt(i);
            if (!Character.isLetter(c) && (i == 0 || i == 1)) {
                return false;
            }
            if (!(c == '-') && (i == 2)) {
                return false;
            }
            if (!Character.isDigit(c) && (i > 2)) {
                return false;
            }
        }
        return true;
    }
    public static boolean validateZipCode(String zip) {
        return ((zip.length() == 5) && (NumberUtils.isNumber(zip)));
    }

    public static int validateInput(String firstname, String lastname, String zipcode, String id) {
        String messages = "";
        boolean allow = true;

        if (validateNames(firstname) != 0) allow = false;
        if (validateNames(firstname) == 1)
            messages += "The first name must be at least 2 characters long.\nThe first name must be filled in.\n";

        else if (validateNames(firstname) == 2) messages += "The first name must be at least 2 characters long.\n";

        if (validateNames(lastname) != 0) allow = false;
        if (validateNames(lastname) == 1)
            messages += "The last name must be at least 2 characters long.\nThe last name must be filled in.\n";

        else if (validateNames(lastname) == 2) messages += "The last name must be at least 2 characters long.\n";

        if (!validateID(id)) {
            allow = false;
            messages += "The employee ID must be in the format of AA-1234.\n";
        }

        if (!validateZipCode(zipcode)) {
            allow = false;
            messages += "The zipcode must be a 5 digit number.\n";
        }

        if (allow) messages = "There were no errors found.";

        System.out.println(messages);

        return 0;
    }
    }
