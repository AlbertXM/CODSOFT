import java.util.Random;
import java.util.Scanner;

/**
 * Main class that contains the main method to execute the guessing game.
 * 
 * @author Manamela Machuene Albert
 * @version codeSoft task 1
 */
public class Main 
{
    public static void main(String[] args) 
    {
    	guessingGame();
    }
    
    public static void guessingGame() 
    {

    	//instantiation of the Random class and the Scanner class 
        Random randNumber = new Random();
        Scanner scan = new Scanner(System.in);
        
        // Generating a random number between 1 and 100 to be guessed.
        int randomGuess = randNumber.nextInt(100) + 1;
        int numberOfAttempts = 0;
        int myGuess = 0;
        // Maximum number of attempts allowed.
        int attemptsLimit = 5;

        boolean success = false;

        //While loop will be the correct choice since it will keep looping until the user finds the value or the loop reaches its maximum
        while (!success && numberOfAttempts < attemptsLimit) 
        {
        	//prompt the user to guess the number randomly generated.
            System.out.println("Guess a number between 1 and 100:");
            
            //reads users input
            myGuess = scan.nextInt();	
            
            //Incrementing  the number of tries.
            numberOfAttempts++;			

            // Checking weather the user's guess matches the random number.
            if (myGuess == randomGuess) 
            {
                //if user guesses right then the value is true
            	success = true; 
                
            } 
            else if (myGuess < randomGuess) 
            {
            	//if the guess is too low user gets the output
                System.out.println("Your guess is too low");
                
            } 
            else if (myGuess > randomGuess) 
            {
            	//if the guess is too high user gets the output
                System.out.println("Your guess is too high");
                
            }
        }
        //displaying that the user has (won), if and only if the user has guessed the random number correctly.
        if(success)
        {
	        System.out.println("************YOU WIN!**************");
	        System.out.println("The number was " + randomGuess);
	        System.out.println("It took you " + numberOfAttempts + " tries to get to it");
        }else
        {
        	 // Displaying a message indicating that the user has lost due 
        	 //to number attempts exceeded the attempt limits.
            System.out.println("************YOU LOSE************** \n You've exhausted all " + attemptsLimit +
            		" attempts. The correct random number was " + randomGuess + ".");
        }
        
        scan.close();
        
    }
}