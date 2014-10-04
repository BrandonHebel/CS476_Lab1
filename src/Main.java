import java.util.Scanner;
/**
 * CS476 Lab1
 * Guessing Game
 * 
 * @author Brandon Hebel
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int number = (int)((Math.random()*10)+1);
        int guess;
        
        System.out.print("Please guess a number from 1 to 10: ");
        guess = input.nextInt();
        if(guess == number)
            System.out.println("You have guessed the correct number!");
        else
            System.out.println("You have guessed incorrectly. The number is " + number +".");
    } 
}