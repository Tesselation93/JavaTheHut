import java.util.Random;
import java.util.Scanner;  


public class GuessANumber 
{	private static int rnd_number;

    public static void main(String[] args)
    {

// Pick a random number
        
        Random random = new Random();
        rnd_number = random.nextInt(100) + 1;
        
        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		
        System.out.println( "Can you guess what it is?...");
        makeAGuess();
}

    private static void makeAGuess()
    {

// Creating the Scanner object  

        Scanner scanner = new Scanner(System.in); 	 
    	
// The costumer is asked their guess 

    	System.out.println("Please type your guess: ");
        int input;
        
// Here we check if the input is numeric with hasNextInt

        if(scanner.hasNextInt())
        {

            input = scanner.nextInt();

// Then we check if the costumers input matches (int guess) the random number that in this instance is generated

            if (input == rnd_number)

// If the input is equal (==) to the random number the costumer recieves the following messsage
            {
                System.out.println("You guessed right! Yawn, how boring! ");
            }

// If the numbers do not match we give the customer a hint by checking if their number was too high or low in comparison to our randomly generated number
    // If the input is lower than the random int we print this

            else if (input < rnd_number)

                {
                System.out.println("Too low! You're too slow!");
                makeAGuess();
                }
            
            else
                System.out.println("Too high, come down, don't fly!");
                makeAGuess();

        }
    }
}