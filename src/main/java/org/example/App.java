/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Julio Lopez
 */
package org.example;
import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

public class App
{
    public static void main( String[] args ) {
        System.out.println("Please enter the number of the month: ");
        Scanner s = new Scanner(System.in);
        String monthin = s.nextLine();
        Integer m = Integer.valueOf(monthin);
        String month = "";
        switch (m) {
            case 1 -> month = "January";
            case 2 -> month = "February";
            case 3 -> month = "March";
            case 4 -> month = "April";
            case 5 -> month = "May";
            case 6 -> month = "June";
            case 7 -> month = "July";
            case 8 -> month = "August";
            case 9 -> month = "September";
            case 10 -> month = "October";
            case 11 -> month = "November";
            case 12 -> month = "December";
        }
        System.out.println("The name of the month is " + month);
    }
}
