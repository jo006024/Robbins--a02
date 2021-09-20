/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 19
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise19;

/*
Before main: set up string validation
take strings, make it lowercase with .toLowercase()
make string array
check array if it has any letters so that user MUST input a number

Main function:
Scanner myOBJ
Println(Height in inches?)
String height --> check string for numbers
if string has a letter, Error, system.exit(0)
repeat for weight
double W/H = Double.parseDouble(Weight and height)
plug in W and H into equation
round up Math.Ceil
if(final answer>=18.5 && final answer<=25)
user is within good BMI
if(above) go to gym
if(below) go to doctor
 */

import java.util.Scanner;



public class Solution19 {
    public boolean validateString(String height) {
        height = height.toLowerCase();
        char[] charArray = height.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ((ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public boolean validateString1(String weight) {
        weight = weight.toLowerCase();
        char[] charArray = weight.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ((ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);


        System.out.println("What is your height in inches?");
        String height = myOBJ.nextLine();
        Solution19 obj = new Solution19();
        boolean bool = obj.validateString(height);
        if(!bool){
            System.out.println("Error! Please enter a number");
            System.exit(0);
        }
        else{
            System.out.println("\n");
        }
        System.out.println("What is your weight in pounds?");
        String weight = myOBJ.nextLine();
        Solution19 obj1 = new Solution19();
        boolean bool1 = obj1.validateString1(height);
        if(!bool1){
            System.out.println("Error! Please enter a number");
            System.exit(0);
        }
        else{
            System.out.println("\n");
        }



        //bmi = (weight / (height × height)) * 703
        double W = Double.parseDouble(weight);
        double H = Double.parseDouble(height);

        double numerator = W / (H * H);
        double bmi = numerator * 703;
        double roundBmi = Math.ceil(bmi * 100.0) / 100.0;
        System.out.println(+roundBmi);

        if (roundBmi >= 18.5 && roundBmi <= 25) {
            System.out.println("You are within the ideal weight range!");
        } else if (roundBmi > 25) {
            System.out.println("You are overweight. Cut down on the cookies and hit the gym!");
        } else if (roundBmi < 18.5) {
            System.out.println("You are underweight. You should see a doctor.");
        }
    }
}


