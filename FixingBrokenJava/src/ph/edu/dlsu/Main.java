package ph.edu.dlsu;


import acm.program.*;

public class Main extends ConsoleProgram {
    /* Reads a number from the user and reports whether or not it
     * is prime.
     */
    public void run() {

        while(true) {
        /* Get the value from the user. */
            int value = readPositiveInt();

		/* Check whether or not it is prime. */
            if (isPrime(value)) {
                println(value + " is prime.");
            } else {
                println(value + " is composite.");
            }

            if(value == 0){
                break;
            }
        }
    }

    /**
     * Given a positive integer, returns whether that integer is
     * prime.
     *
     * @param value The value to test.
     * @return Whether or not it is prime.
     */
    private boolean isPrime(int value) {
        /* Try all possible divisors of the number.  If any of them
		 * cleanly divide the number, we return that the number is
		 * composite.
		 */
        for (int divisor = 2; divisor <= value/2; divisor++) {
            if (value % divisor == 0) {
                return false;
            }
        }
        return true;

    }

    /**
     * Reads a positive integer from the user and returns it.
     *
     * @return A positive integer entered by the user.
     */
    private int readPositiveInt() {
		/* Get an initial value. */
        int value = readInt("Enter a positive integer: ");

		/* If the value was nonpositive, reprompt the user. */
        while (value <= 0) {
            println("Please enter a positive integer.");
            value = readInt("Enter a positive integer: ");
        }

        return value;
    }


    public static void main(String[] args) {
        new Main().start(args);
    }
}