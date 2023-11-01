import java.util.Scanner;
import java.util.InputMismatchException;

/**
 * Permissible Dating Age program
 *
 * @author Mr. Jaffe
 * @version 2021-06-22 Version 1.0.0
 */

public class PDA
{

    /**
     * Constructor for objects of class PDA
     */
    public PDA()
    {
        // We don't need to do anything in the constructor for
        // our program.
    }

    /**
     * This is the main event loop for our PDA program
     */
    public void runEventLoop() {
        System.out.println("Please enter age");     
        Scanner newScan = new Scanner(System.in);
        int LOWER_BOUND = 14;
        boolean shouldContinue = true;
        int QUIT = 0;
        int DIVIDE = 2;
        int ADD = 7;

        while (shouldContinue) {
            if (newScan.hasNext()) {
                try {
                    float age = newScan.nextInt();
                    if (age == QUIT) {
                        shouldContinue = !shouldContinue;
                    }
                    if (age >= LOWER_BOUND) {
                        float minAge = (age/DIVIDE) + ADD;
                        float maxAge = (age-ADD) * DIVIDE;
                        if (minAge >= maxAge) {
                            minAge = (age/DIVIDE) + ADD;
                            maxAge = (age-ADD) * DIVIDE;
                        }
                        System.out.println("Age " + Math.round(age) + " can date in the range of "+Math.round(Math.ceil(minAge))+" to "+Math.round(Math.floor(maxAge)));
                    } if (age != QUIT && age < LOWER_BOUND) {
                        System.out.println(Math.round(age)+" is TOO YOUNG!!!!!!!!");
                    }
                } catch (InputMismatchException error) {
                    newScan.next();
                    System.out.println("Please enter an integer");
                }
            }
        }

    }

    /**
     * The main method instantiates and runs the program
     */
    public static void main (String[] args) {
        PDA pda = new PDA();
        pda.runEventLoop();
    }
}

