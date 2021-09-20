/*
 *  UCF COP3330 Fall 2021 Assignment 2 solution 15
 *  Copyright 2021 Jonathan Robbins
 */
package Exercise15;
/*
Scanner myOBJ
Print(Enter username:)
String username
Print(Password:)
String Password
Print(What's the password?)
if(password.equals(password string))-->print(Welcome)
else(not equal)--> Print(I don't know you!)
 */

import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args){
        Scanner myOBJ = new Scanner(System.in);

        System.out.println("Enter a Username:");
        String Username = myOBJ.nextLine();
        System.out.println("Enter a password:");
        String Password = myOBJ.next();
        System.out.println("What's the password?");
        if(Password.equals(myOBJ.next())){
            System.out.println("Welcome !");
        }
        else System.out.println("I don't know you!");

    }
}

