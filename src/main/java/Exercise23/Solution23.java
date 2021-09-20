/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution 23
 *  Copyright 2021 Jonathan Robbins
 */

package Exercise23;

/*Scanner w/ java scanner input
println: Clarify user must answer with y and n
set up PlantUML diagram from web courses
Ask if car is silent when key turns, string answer
if(yes) ask: Are the batteries corroded
if (corroded) prompt: Clean terminals and try again
if not corroded, prompt: replace cables and try again
repeat if/else code with reference to the UML tree
continue to check string.equals("Y") and else statements
*/
import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);

        System.out.println("Answer the questions with y or n for yes or no.");
        System.out.println("Is the car silent when you turn the key?");
        String silent = myOBJ.nextLine();

        if(silent.equals("Y") || silent.equals("y")){
            System.out.println("Are the battery terminals corroded?");
            String BatteryTerm = myOBJ.nextLine();

            if(BatteryTerm.equals("Y") || BatteryTerm.equals("y")){
                System.out.println("Clean terminals and try starting again.");
            }
            else{System.out.println("Replace cables and try again.");}
        }

        else{
            System.out.println("Does the car make a slicking noise?");
            String slick = myOBJ.nextLine();

            if(slick.equals("Y") || slick.equals("y")){
                System.out.println("Replace the battery.");
            }
            else{
                System.out.println("Does your car crank up, but fail to start?");
                String crank = myOBJ.nextLine();

                if(crank.equals("Y") || crank.equals("y")){
                    System.out.println("Check your spark plug connections.");
                }
                else{
                    System.out.println("Does the engine start and then die?");
                    String die = myOBJ.nextLine();

                    if(die.equals("Y") || die.equals("y")){
                        System.out.println("Does your car have fuel injection?");
                        String FuelInjection = myOBJ.nextLine();

                        if(FuelInjection.equals("Y") || FuelInjection.equals("y")){
                            System.out.println("Send the car in for service.");
                        }
                        else{System.out.println("Check to see if the choke is opening and closing.");}


                    }
                    else{
                        System.out.println("This should not be possible.");
                    }

                }
            }

        }





    }
}

