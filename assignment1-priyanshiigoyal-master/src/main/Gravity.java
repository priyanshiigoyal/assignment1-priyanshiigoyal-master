/*
 * @author Priyanshi Goyal
 * @version 1.0
 * */
package main;

// import java.util.Scanner;
// uncomment the above line to use input in your program.

import java.util.Scanner;

public class Gravity {
    // TODO 1: Create the main method
    public static void main(String[] args) {
        /* TODO 2:
         *   a. Declare all your necessary variables inside main method.
         *   b. Declare a constant for 'gravity', assume the value to be 9.8
         *   c. Calculate the result and print it to the screen.
         * */
        double distance, time, speed, g = 9.8;
        Scanner scanner = new Scanner(System.in);
        time = scanner.nextDouble();
        distance = 0.5 * g * time * time;
        speed = g * time;
        System.out.println("The speed of the object at " + time + " seconds after its release is " + speed + " 10" +
                " and the distance the object travelled is " + distance + " sq.meters");

    }
    // P.S: Refer to the README.md file for the problem statement, input & output.
}
