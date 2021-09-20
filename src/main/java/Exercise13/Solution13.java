/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 13
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise13;
/*
Scanner myObj
Print(Enter principal amount:)
double P = user input value
Print(Enter rate:)
double r = input rate
Print(Enter years:)
double t = years input
Print(How many times is the interest compounded in one year?:)
int n = compound input from user
split equation up to simplify the arithmetic
Round answer up with Math.ceil
print($+P+ " invested at %"+r+ "for " +t+ "years compounded " +n+ " times in a year is $" +Roundup)

 */

import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Enter the principal amount($):");
        double P = myObj.nextDouble();
        System.out.println("Enter rate:");
        double r = myObj.nextDouble();
        System.out.println("Enter years:");
        int t = myObj.nextInt();
        System.out.println("How many times is the interest compounded in one year?");
        int n = myObj.nextInt();

        double R = r/100;
        double A = P*(Math.pow((1+(R/n)),(n*t)));
        double Roundup = Math.ceil(A*100.0)/100.0;
        String str1 = "$";
        String str2 = "%";

        System.out.println(str1+P+" invested at "+str2+r+ " for "+t+" years compounded "+n+ " times in a year is "+str1+Roundup);
    }
}
