/*
 * Programmer: Gryphen
 * Date: November 2nd 2020
 * Purpose: to learn Array's
 */

import java.util.Scanner;

public class ArrayStuff {
    public static void main (String[] args) {
        // Create the input scanner
        Scanner input = new Scanner(System.in);

        int [] ages = new int [5];
        ages[3] = 18;
        System.err.println("Enter an integer:");
        ages[0]= input.nextInt(); 


        // TODO: Change the last element of "ages" to be the first element squared


        // TODO: Print all of the elements of "ages", one per line

        

        string [] planets = new string [8];
        planets[0] = "Mercury";
        planets[1] = "Venus";
        planets[2] = "Earth";
        planets[3] = "Mars";
        planets[4] = "Jupiter";
        planets[5] = "Saturn";
        planets[6] = "Uranus";
        planets[7] = "Neptune";
        // TODO: Print the first letter of the 7th planet from the sun


        // TODO: Change the name of our planet to be a word that the user inputs
        System.err.println("What do you want to rename Earth to be?");
        planets[2] = input.nextLong();


        // TODO: Replace the first planet with the planet at index 2, but with all
        // upper case letters.


        // TODO: Print all of the elements of "planets" in reverse order.

    }
}
