/**
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Austin Mathew
 */

package org.example;

import java.util.Locale;
import java.util.Scanner;

public class App 
{
    public static double C(double temp){
        return ((temp-32) * 5.0/9.0);
    }

    public static double F(double temp){
        return (( temp * 9.0/5.0)+32);
    }

    public static void main( String[] args ) {
        String choice;
        boolean CF=false;
        double temp;
        Scanner input = new Scanner(System.in);
        System.out.print("Press C to convert from Fahrenheit to Celsius.\nPress C to convert from Fahrenheit to Celsius.\n" +
                "Your choice: ");
        choice = input.next();
        if (choice.equalsIgnoreCase("c")) {
            CF = true;
        }
        else if (choice.equalsIgnoreCase("f")) {
            CF = false;
        }
        System.out.print("Please enter the temperature in " + ((!CF)? "Celsius":"Fahrenheit") + ": ");
        temp=(CF? C(input.nextDouble()):F(input.nextDouble()));
        System.out.printf("The temperature in %s is %.2f.",(CF? "Celsius":"Fahrenheit"), temp);
        }

    }

