/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 16
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise16;
/*
Scanner myOBJ
Println(How old are you?)
int user answer
String result = if age>=16 can drive:if not, cannot drive
println(result)
 */

import java.util.Scanner;

public class Solution16 {

    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);

        System.out.println("How old are you?");
        int age = myOBJ.nextInt();

        String result = (age>=16)?"You are old enough to legally drive.":"You are not legally old enough to drive.";
        System.out.println(result);
    }
}
