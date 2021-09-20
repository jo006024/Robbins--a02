/*
 *  UCF COP3330 Fall 2021 Assignment 2 program exercise 06 solution
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise06;
/*
Import java calendar
scanner myObj
Print(How old are you?)
int x = user input age
print(What age do you plan to retire?)
int y = user input retire age
int z = y-x
Print(You have +z+ years left until your retirement
int year = Calendar.getInstance().get(Calendar.YEAR)
int retire = year+z
print(It is currently +year+ and you will retire in +retire)
 */

import java.util.Calendar;
import java.util.Scanner;

public class Solution06 {

    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);
        System.out.println("How old are you?:");
        int x = myObj.nextInt();

        System.out.println("What age do you plan to retire?:");
        int y = myObj.nextInt();

        int z = y-x;

        System.out.println("You have " +z+ " years left until your retirement.");
        int year = Calendar.getInstance().get(Calendar.YEAR);
        int retire = year+z;

        System.out.println("It is currently " +year+" and you will retire in " +retire+".");

    }
}

