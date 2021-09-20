/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 21
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise21;

/*Scanner myOBJ
Println(Enter number of the month)
int M for entered number
switch(M) after stringing month
switch numbered month with the name of corresponding month
println(THe name is +month)
 */

import java.util.Scanner;

public class Solution21 {
    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);

        System.out.println("Enter the number of the month: ");
        int M = myOBJ.nextInt();

        String Month;
        switch(M){
            case 1: Month = "January";
                break;
            case 2: Month = "February";
                break;
            case 3: Month = "March";
                break;
            case 4: Month = "April";
                break;
            case 5: Month = "May";
                break;
            case 6: Month = "June";
                break;
            case 7: Month = "July";
                break;
            case 8: Month = "August";
                break;
            case 9: Month = "September";
                break;
            case 10: Month = "October";
                break;
            case 11: Month = "November";
                break;
            case 12: Month = "December";
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + M);
        }
        System.out.println("The month is "+Month);
    }
}
