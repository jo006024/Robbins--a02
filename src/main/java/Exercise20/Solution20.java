/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 21
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise20;

/*
Scanner myOBJ = get scanner input
Println(What state do you live in)
string the state
Println(Ask what county)
string the county
get order amount and double value type
initialize tax
if(Wisconsin) add 5% tax and then ask what county
if(in Eau Claire county) add.5% to wisconsin tax
if(in Dunn county) add .4% to wisconsin tax
if(In Illinois) add 8% tax
if(any other state) no tax added
multiply tax with order number, then add to order number for total cost
round up: Math.ceil
println(Tax and total cost) in one output statement
 */

import java.util.Scanner;

public class Solution20 {

    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);

        System.out.println("What state do you live in?:");
        String state = myOBJ.nextLine();
        System.out.println("What county?");
        String county = myOBJ.nextLine();
        System.out.println("What is the order number?");
        double order = myOBJ.nextDouble();


        double tax = 0;
        if(state.equals("Wisconsin")){
            tax = 0.05;
            if(county.equals("Eau Claire") || county.equals("eau claire")){
                tax = tax+0.005;
            }
            else if(county.equals("Dunn") || county.equals("dunn")){
                tax = tax+0.004;
            }
        }
        else if(state.equals("Illinois") || state.equals("illinois")){
            tax = 0.08;
        }

        double taxAmount = tax*order;
        double FinalCost = (order*tax)+order;
        double round = Math.ceil(FinalCost*100.0)/100.0;
        double roundTax = Math.ceil(taxAmount*100.0)/100.0;

        System.out.println("The tax is: $"+roundTax+"\n" +"The total cost is: $"+round);
    }
}
