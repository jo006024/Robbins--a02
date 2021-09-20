/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 22
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise22;
/* scanner myOBJ
println(enter number1)
int x=number 1
println(enter number2)
int y = number 2
println(enter number3)
int z = number 3
if(x is largest) --> print(largest is +x)
if(y is largest) --> print(largest is +y)
if(z is largest) --> print(largest is +z)
*/
import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int x = myOBJ.nextInt();
        System.out.println("Enter the second number:");
        int y = myOBJ.nextInt();
        System.out.println("Enter the third number:");
        int z = myOBJ.nextInt();

        if(x>y && x>z){
            System.out.println("The largest number is: "+x);}

        if(y>x && y>z){
            System.out.println("The largest number is: "+y);
        }

        if(z>y && z>x){
            System.out.println("The largest number is: "+z);
        }
    }
}
