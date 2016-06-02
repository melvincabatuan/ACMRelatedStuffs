package ph.edu.dlsu;


import acm.program.*;

public class Main extends ConsoleProgram {
    public void run() {
        double a = readDouble("a: ");
        double b = readDouble("b: ");

        double c = Math.sqrt(a * a + b * b);
        println("c = " + c);
    }

    public static void main(String[] args) {
        new Main().start(args);
    }

}