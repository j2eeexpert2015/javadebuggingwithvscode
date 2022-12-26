package org.debugtutorial.problemsolving.solutions.simple;
import java.util.Scanner;

/**
 * This program implements two methods related to String which has issues
 */
public class StringUtilitySolution {
    /**
     * Main program to test the methods countOccurrences and reverseString
     *
     */
    public static void main(String[] args) {
        Scanner stdin = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = stdin.next();

        System.out.println("Enter a char: ");
        char ch = stdin.next().charAt(0);

        System.out.println("Character " + ch + " occurs "
                + countOfccurrences(str, ch) + " times in string \""
                + str + "\".");

        System.out.println("\n\nEnter another String: ");
        str = stdin.next();

        System.out.println("The reverse of string \""
                + str + "\" is " + reverseString(str));

    }

    /**
     * Counts the number of occurrences of char ch in String str.
     */
    public static int countOfccurrences(String inputStr, char c) {
        int count = 0;
        if (inputStr != null) {
            for (int i = 0; i < inputStr.length(); i++) {
                if (inputStr.charAt(i) == c) {
                    count++;
                }
            }
        }
        return count;
    }

    /**
     * Reverses the String.
     */
    public static String reverseString(String inputStr) {
        //toCharArray converts string s to an array of characters
        char[] charArray = inputStr.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            char cTmp = charArray[i];
            int endIndex=charArray.length-i-1;
            charArray[i] = charArray[endIndex];
            charArray[endIndex] = cTmp;
            if(i>=endIndex)
            {
                break;
            }
        }

        //converts the char array of characters to a String
        return new String(charArray);
    }
}
