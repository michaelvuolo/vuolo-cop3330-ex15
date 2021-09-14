/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Michael Vuolo
 */

package edu.ucf;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {
        // create new scanner
        Scanner input = new Scanner(System.in);

        // setup correct password
        String correctPassword = "abc$123";

        // record password
        System.out.print("What is the password? ");
        String enteredPassword = input.nextLine();

        // output result
        if (correctPassword.equals(enteredPassword))
            System.out.print("Welcome!");
        else
            System.out.print("I don't know you.");
    }
}
