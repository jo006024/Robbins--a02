/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 07
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise07;
/*
Scanner myOBJ
double feet1, feet2;
final double v = 0.09290304

Print(What is the length of the room in ft?)
feet1 = user input
Print(What is the width of the room in feet?)
feet2 = user input
double FT = l*w
area in meters = v*FT
print(You entered the dimensions of +feet1+ by +feet2+
print(The area is +areaFT+ sq feet)
print(M+ sq meters)
 */

import java.util.Scanner;

public class Solution07 {

    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);
        double feet1;
        double feet2 ;

        final double v = 0.09290304;


        System.out.println("What is the length of the room in feet?");
        feet1 = myOBJ.nextFloat();
        System.out.println("What is the width of the room in feet?");
        feet2 = myOBJ.nextFloat();
        double areaFT = (feet1*feet2);
        final double M = v*(areaFT);

        System.out.println("You entered dimensions of " +feet1+ " by " +feet2+ ".");
        System.out.println("The area is");
        System.out.println(areaFT+ " Square Feet.");
        System.out.println(M+ " Square Meters.");


        //final area = b*h;
    }
}

