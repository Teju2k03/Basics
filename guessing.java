import java.util.Scanner;
import java.util.Random;
 public class guessing{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int randomNumber = random.nextInt(100)+1;
        int userGuess;
        int attempts = 0;
        System.out.println("Guess a number between the 1 to 100 ");
        while(true){
            System.out.println("Enter your guess");
            userGuess = sc.nextInt();
            attempts++;
            if(userGuess > randomNumber){
                System.out.println("Entered number is too high ! Try again");
             }
             else if(userGuess <  randomNumber){
                System.out.println("Entered number is too low! Try again");

             } else {
                System.out.println("Congratulations! You guessed the correct number");
                break;
            }

        }

    }
 }
