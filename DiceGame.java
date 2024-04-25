
/***
 Dice guessing game

* @author  Aidan

* @version 1.0

* @since   03-04-2024

*/

import java.util.Random;
//Imports the random num generator
import java.util.Scanner;
//Imports the scanner for user input

public class DiceGame {
    
    public static void main (String [] args){

    
    Random rand = new Random();
    //Creates the random object for generating numbers
    Scanner sc = new Scanner(System.in);
    //Creates the scanner object

    try {
        
    int correctNumber = rand.nextInt(6) + 1;
    //Sets the int value for the program to generate a random num from 1 - 7

    System.out.println("Welcome to the dice guessing game!");
    //Greets the user to the game
    System.out.println("Please choose a number from 1 to 6");

    int userInput = sc.nextInt();
    //Allows user input
    
    if (userInput == correctNumber) {
        System.out.println("You have guessed correctly!");
        //Displays message for if the user was correct
    } else if (userInput > correctNumber) {
        System.out.println("You have guessed incorrectly. Your guess was too high!");
    } else if (userInput < correctNumber) {
        System.out.println("You have guessed incorrectly. Your guess was too low!");
    }
    
    sc.close();

    } catch (Exception e) {
        System.out.println("Please enter a valid number value.");
    }

    }
}
