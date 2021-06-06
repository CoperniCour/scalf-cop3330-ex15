/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Courtney Scalf-Crickenberger
 */

//Exercise 15 - Password validation

package org.example;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {

        //Read in password input from user
        Scanner getPassword = new Scanner(System.in);
        System.out.print("What is the password? ");
        String password = getPassword.nextLine();
        if( password.equals("abc$123") ) {
            System.out.println("Welcome!");
        } else {
            System.out.println("I don't know you.");
        }


    }
}
