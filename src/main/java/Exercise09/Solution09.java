/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 09
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise09;
/*
Scanner myObj
Print(What is the length of your ceiling?)
double l = user length
Print(What is the width of your ceiling?)
double w = user width
final double area = w*l
int remainder = (int) Math.round
print(You will need to buy x gallons of paint to cover x area)
 */

import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args){
        final int PaintCover = 350;

        Scanner myObj = new Scanner(System.in);

        System.out.println("What is the length of your ceiling?");
        double l = myObj.nextDouble();

        System.out.println("What is the width of your ceiling?");
        double w = myObj.nextDouble();

        final double area = w*l;
        //PaintCover/area

        int remainder = (int) Math.round(area/PaintCover);
        System.out.println("You will need to buy " +remainder+ " gallons of paint to cover "+area+ " square feet.");
    }



}
