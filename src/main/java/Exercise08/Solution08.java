/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 08
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise08;
/*
Scanner myOBJ
Print(How many people are at the pizza party?)
int people = people input
Print(How many pizzas are there?)
int pizza# = user input pizza#
Print(How many slices are there per pizza?)
int slice count = user input slice per pizza
find total slices = slice count*pizza count
print(x people with x pizzas and x total slices)
pizza ratio = total slices/people
leftovers = total slices%people

print(Each person gets +pizza ratio+ slices of pizza. There are +leftovers+ leftovers)

 */

import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);
        System.out.println("How many people are at the pizza party?");
        int people = myOBJ.nextInt();
        System.out.println("How many pizzas are there?");
        int PizzaCount = myOBJ.nextInt();
        System.out.println("How many slices are there per pizza?");
        int SliceCount = myOBJ.nextInt();

        int CombinedSlice = SliceCount*PizzaCount;

        System.out.println(people+ " people with "+PizzaCount+ " pizza(s) "+"("+CombinedSlice+ " Slices"+")");

        int pizzaRatio = CombinedSlice/people;

        int leftover = CombinedSlice%people;

        System.out.println("Each person gets "+pizzaRatio+ " slices of pizza. There are "+leftover+ " leftovers.");

    }
}

