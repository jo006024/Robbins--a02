/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 11
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise11;
/*
Scanner myObj
Print(How many euros are you exchanging?)
double user answer
Print(What is the exchange rate?)
double rate = user input rate
equation = rate*euros
round with Math.Ceil to round up
Print(AMT of euros at an exchange rate of (rate) is (round) us dollars)
 */

import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);


        System.out.println("How many Euros are you exchanging?");
        double c_from = myObj.nextDouble();
        System.out.println("What is the exchange rate?");
        double rate = myObj.nextDouble();
        double c_to = rate*c_from;
        double RoundOff = Math.ceil(c_to*100.0)/100.0;
        System.out.println(+c_from+" Euros at an exchange rate of "+rate+" is "+RoundOff+ " U.S. Dollars.");
    }
}
