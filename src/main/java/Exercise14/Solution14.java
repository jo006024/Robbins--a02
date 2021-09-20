/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 14
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise14;
/*
Scanner myOBJ
Print(What is the order number in $?)
double x = user input
Print(What state?)
String State (s)

if(state is WI) set tax to 0.055
finalize tax rate
tax*order + order
print(The total is +total cost)
 */

import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("What is the order number($)?");
        double x = myObj.nextDouble();
        System.out.println("What state?");
        String S = myObj.next();


        double Total = x;

        if(S.equals("WI")){
            final double tax = 0.055;
            Total = x+(tax*x);}
        double Round = Math.ceil(Total*100.0)/100.0;
        System.out.println("The total is $"+Round);

    }
}

