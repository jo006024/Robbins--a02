/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 10
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise10;
/*
Scanner myOBJ
finalize the tax = 5.5%
Print(enter price) print(enter quantity)
double price, int quantity for merch 1,2, and 3
subtotal = sum of prices1,2,3
round the subtotal up : Math.Ceil
print(rounded subtotal)
account for taxes: tax*subtotal+subtotal
round the total now with Math.ceil
print(rounded total)
 */

import java.util.Scanner;

public class Solution10 {

    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);
        final double tax = 0.055;

        System.out.println("Enter the price of item 1:");
        double item1 = myOBJ.nextDouble();
        System.out.println("Enter the quantity of item 1:");
        int quantity1 = myOBJ.nextInt();

        System.out.println("Enter the price of item 2:");
        double item2 = myOBJ.nextDouble();
        System.out.println("Enter the quantity of item 2:");
        int quantity2 = myOBJ.nextInt();

        System.out.println("Enter the price of item 3:");
        double item3 = myOBJ.nextDouble();
        System.out.println("Enter the quantity of item 3:");
        int quantity3 = myOBJ.nextInt();

        double Subtotal = item1+item2+item3;

        double roundOff1 = Math.round(Subtotal*100.0)/100.0;

        System.out.println("Subtotal: "+roundOff1);

        double TaxRate = Subtotal*tax;
        double roundOff2 = Math.round(TaxRate*100.0)/100.0;
        System.out.println("Taxes: "+roundOff2);

        double Total = Subtotal+TaxRate;
        double roundOff3 = Math.round(Total*100.0)/100.0;
        System.out.println("Total: "+roundOff3);
    }
}

