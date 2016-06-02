package ph.edu.dlsu;

import acm.program.*;

public class AddIntegers extends ConsoleProgram {

    public void run() {
        println("This program adds two integers.");
        int n1 = readInt("Enter n1: ");
        int n2 = readInt("Enter n2: ");
        int total = n1 + n2;
        println("The total is " + total + ".");
    }

    public static void main(String[] args) {
        new AddIntegers().start(args);
    }
}
