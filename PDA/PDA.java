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
        int lowerBound = 7;
        boolean shouldContinue = true;
        int quitNum = 0;

        while (shouldContinue) {
            if (newScan.hasNext()) {
                try {
                    int age = newScan.nextInt();
                    if (age == quitNum) {
                        shouldContinue = !shouldContinue;
                    }
                    if (age >= lowerBound) {

                        float maxAge = (age/2) + 7;
                        float minAge = (age-7) * 2;
                        System.out.println("You can date in the range of "+Math.ceil(minAge)+" to "+Math.floor(maxAge));
                    } else {
                        System.out.println(age+" is TOO YOUNG!!!!!!!!");
                    }
                } catch (InputMismatchException error) {
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

