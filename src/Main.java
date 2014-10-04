import java.util.Scanner;
/**
 * CS476 Lab1
 * Guessing Game - Now with unlimited guesses!
 * 
 * @author Brandon Hebel
 */
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = (int)((Math.random()*10)+1);
        int guess;
        
        while(true){
            System.out.print("Please guess a number from 1 to 10: ");
            guess = input.nextInt();
            if(guess == number) {
                System.out.println("You have guessed the correct number! It is " + number + "!");
                break;
            }
            else
                System.out.println("You have guessed incorrectly. The number is not " + guess +".");
        } 
    } 
}