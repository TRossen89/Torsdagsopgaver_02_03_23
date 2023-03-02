import java.util.Random;
import java.util.Scanner;  


public class GuessANumber {
	

    private static int rnd_number;

	
    public static void main(String[] args) {


        // pick a random number

        Random random = new Random();
        

        rnd_number = random.nextInt(100) + 1;


        

        System.out.println( "I'm thinking of a number between 1 and 100 (including both).");
		System.out.println( "Can you guess what it is?...");


        

        makeAGuess(0);
 	}




    private static void makeAGuess(int guess_count){

        //System.out.println(rnd_number);



        Scanner a_scanner = new Scanner(System.in);



        

        

        if (a_scanner.hasNextDouble()) {

            int user_guess = a_scanner.nextInt(); 



            if (user_guess == rnd_number) {


                System.out.println( "You guessed it!");

            }


            else {    
                
                guess_count++;


                if (guess_count < 10) {


                    if (user_guess < rnd_number) {

                        System.out.println("No, that's not the number I'm thinking of. The number I'm thinking of is higher than " + user_guess + ". Try again");

                        makeAGuess(guess_count);
                    }

                    


                    else {

                        System.out.println("No, that's not the number I'm thinking of. The number I'm thinking of is lower than " + user_guess + ". Try again");
                    
                        makeAGuess(guess_count);

                    }

                    

                }

                else { 

                    System.out.println("You have no more guesses. I was thinking of " + rnd_number);


                }

            }
        }


        else {


            System.out.println("Error: You have not typed a number. Tryg again");
            makeAGuess(guess_count);
        }



        }

		// Create a Scanner object   	 
    	// Read user input
    	
        //use hasNextDouble to check if input is numeric, 
        // if so...
        //   Compare it with the random number
        //   Let the user know the result of the comparison
        //   Let the user try again by calling this method recursively
        //   Help the user by revealing wether the guess was lower or higher than the target number
        // if input was not numeric show an error message and call this method recursively

    }
   


