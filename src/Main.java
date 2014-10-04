import java.util.Scanner;
/**
 * CS476 Lab1
 * Guessing Game - Now tracks number of guesses!
 * 
 * @author Brandon Hebel
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)((Math.random()*10)+1);
        int guess;
        int attempts = 1;
        while(true){
            System.out.print("Please guess a number from 1 to 10: ");
            guess = input.nextInt();
            if(guess == number) {
                System.out.println("You have guessed the correct number in " + attempts + " attempt(s)! It is " + number + "!");
                break;
            }
            else
                System.out.println("You have guessed incorrectly. The number is not " + guess +".");
            attempts++;
        } 
    } 
}