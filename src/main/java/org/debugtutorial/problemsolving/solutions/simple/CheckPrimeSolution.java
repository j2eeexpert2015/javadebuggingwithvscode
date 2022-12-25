package org.debugtutorial.problemsolving.solutions.simple;

/**
 * The file has TWO functions:
 * The first function should return a random number between 1 and 15.
 * The second function should check if that number is prime or composite.
 *
 * A prime number is not divisible by anything except itself and one .
 * Sample numbers are 19, 29, 41 etc.
 */
public class CheckPrimeSolution {
    public static void main(String[] args) {
        int randomNumber = getRandomNumber(15);
        System.out.println("Input Number: " + randomNumber);
        System.out.println("Prime or Composite: " + checkPrime(randomNumber));
    }

    public static int getRandomNumber(int range) {
        double random = Math.random()* range + 1;
        return (int) random;
    }
    public static String checkPrime(int input) {
        String isPrime = "";
        for (int i = 2; i < input; i++) {
            isPrime = (input % i == 0) ? "COMPOSITE" : "PRIME";
            if(isPrime.equalsIgnoreCase("COMPOSITE"))
            {
                break;
            }
        }
        return isPrime;
    }
}
