/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 18
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise18;
/*
Scanner myOBJ
Println(Enter C/F to pick what to convert from)
string user answer
Println(You chose: +answer)
if(chose celsius)--> enter temp in celsius
c*9/5   + 32 for conversion to fahrenheit
if(chose fahrenheit)--> enter temp in fahrenheit
F-32* 5/9 for conversion to celsius
round both answers with Math.ceil(ans*100.0)/100.0
 */

import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args){
        Scanner myObj = new Scanner(System.in);

        System.out.println("Type C if you would like to convert from Celsius to fahrenheit.");
        System.out.println("Type F if you would like to convert from Fahrenheit to Celsius.");
        String str1 = myObj.nextLine();

        System.out.println("You chose: "+str1);

        if(str1.equals("C") || str1.equals("c")){
            System.out.println("Enter the temperature in Celsius");
            double C = myObj.nextDouble();
            double ConversionC = (C * 9 / 5) + 32;
            double RoundC = Math.ceil(ConversionC*100.0)/100.0;
            System.out.println("The temperature in Fahrenheit is "+RoundC);
        }
        else if(str1.equals("F")  || str1.equals("f")){
            System.out.println("Enter the temperature in Fahrenheit");
            double F = myObj.nextDouble();
            double ConversionF = (F-32)*5/9;
            double RoundF = Math.ceil(ConversionF*100.0)/100.0;
            System.out.println("The temperature in Celsius is "+RoundF);
        }
    }
}
