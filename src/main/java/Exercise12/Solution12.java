/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 12
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise12;
/*
Scanner myOBJ
Print(Enter the principle)
double P = user input principle
Print(Enter the rate of interest)
double r = user input rate
Print(Input number of years)
int t = user input time
enter values into equation
round using Math.ceil
Print(After x years at x interest, the investment will be worth x)
 */

import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);

        System.out.println("Enter the principle:");
        double P = myOBJ.nextDouble();
        System.out.println("Enter the rate of interest:");
        double r = myOBJ.nextDouble();
        System.out.println("Input the number of years:");
        int t = myOBJ.nextInt();
        double R = r/100;

        double A = P*(1+(R*t));
        double roundOff = Math.ceil(A*100.0)/100.0;
        String str1 = "$";

        System.out.println("After "+t+" years at "+r+"% interest, the investment will be worth "+str1+roundOff+ ".");
    }
}
