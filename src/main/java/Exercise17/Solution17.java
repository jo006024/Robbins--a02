/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 17
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise17;
/*
Before main:
validate ALC, Weight, Hours
convert those strings above into array to account for letters being wrongfully entered
return boolean answer to main when called if it contained a letter

Main:
Scanner myObj
if(you're a male, enter 1. If female, enter 2)
print(How many ounces of alcohol have you had?)
String ALC-->call string validator to check. If there is a letter: Error:System.exit(0)
Print(What is your weight in the nearest pound)
String Weight--> repeat what ALC string did
Print(How long has it been since you last had a drink?)
String Hours--> repeat the same checking process

if(male) r = 0.73
if(female) r = 0.66
parseDouble the string values as A, W, H for alcohol weight and hours
double BAC = (A * 5.14 / W * r) - 0.015 * H;
round up--> Math.Ceil()
println(if(under0.08BAC)->good to go)(if over 0.08-> not good)

 */

import java.util.Scanner;

public class Solution17 {
    public boolean validateString(String ALC) {
        ALC = ALC.toLowerCase();
        char[] charArray = ALC.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ((ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public boolean validateString1(String Weight) {
        Weight = Weight.toLowerCase();
        char[] charArray = Weight.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if ((ch >= 'a' && ch <= 'z')) {
                return false;
            }
        }
        return true;
    }

    public boolean validateString2(String Hours) {
        Hours = Hours.toLowerCase();
        char[] charArray = Hours.toCharArray();
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

        System.out.println("Enter a 1 if you are a male, enter a 2 if you are a female:");
        String gender = myOBJ.nextLine();


        System.out.println("How many ounces of alcohol have you had?");
        String ALC = myOBJ.nextLine();
        Solution17 obj = new Solution17();
        boolean bool = obj.validateString(ALC);
        if(!bool){
            System.out.println("Error! Please enter a number");
            System.exit(0);
        }
        else{
            System.out.println("\n");
        }


        System.out.println("Enter your body weight to the nearest whole pound:");
        String Weight = myOBJ.nextLine();
        Solution17 obj1 = new Solution17();
        boolean bool1 = obj1.validateString1(Weight);
        if(!bool1){
            System.out.println("Error! Please enter a number");
            System.exit(0);
        }
        else{
            System.out.println("\n");
        }


        System.out.println("How many hours has it been since you last drank?");
        String Hours = myOBJ.nextLine();
        Solution17 obj2 = new Solution17();
        boolean bool2 = obj2.validateString2(Hours);
        if(!bool2){
            System.out.println("Error! Please enter a number");
            System.exit(0);
        }
        else{
            System.out.println("\n");
        }

        int gen = Integer.parseInt(gender);
        double A = Double.parseDouble(ALC);
        double W = Double.parseDouble(Weight);
        double H = Double.parseDouble(Hours);





        double r = 0;
        if (gen == 1) {
            r = 0.73;
        } else if (gen == 2) {
            r = 0.66;
        }

        double BAC = (A * 5.14 / W * r) - 0.015 * H;


        System.out.println("Your BAC level is: " + BAC);

        if (BAC < 0.08) {
            System.out.println("You are legal to drive.");
        } else if (BAC >= 0.08) {
            System.out.println("You are not legal to drive.");
        }

    }
}
