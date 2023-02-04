package org.debugtutorial.problemsolving.problems.advanced;

/**
 *
 * There are  boxes in front of you. For each , box  contains  red balls,  green balls, and  blue balls.
 *
 * You want to separate the balls by their color. In each operation, you can pick a single ball from some box and put it into another box. The balls are separated if no box contains balls of more than one color.
 *
 * Debug the given function min_operations and compute the minimal number of operations required to separate the balls.
 *
 * Note: In this problem you can modify at most six lines of code and you cannot add any new lines.
 *
 * To restore the original code, click on the icon to the right of the language selector.
 *
 * Input Format
 *
 * The first line contains a single integer . The next  lines  contain three space-separated integers, , , and , respectively.
 *
 * Constraints
 *
 */
public class DiceGameProblem {
    public static String createDice(int option)
    {
        String displayStr = "";
        switch (option) {

            case 1:  displayStr = "---------\n|       |\n|   *   |\n|       |\n---------";
                break;
            case 2:  displayStr = "---------\n|*      |\n|       |\n|      *|\n---------";
                break;
            case 3:  displayStr = "---------\n|*      |\n|   *   |\n|      *|\n---------";
                break;
            case 4:  displayStr = "---------\n|*     *|\n|       |\n|*     *|\n---------";
                break;
            case 5:  displayStr = "---------\n|*     *|\n|   *   |\n|*     *|\n---------";
                break;
            default: displayStr = "---------\n|*     *|\n|*     *|\n|*     *|\n---------";
                break;
        }
        return displayStr;

    }

    public static void run()
    {
        while (true)
        {

        }

    }

    public static int roll()
    {
        int min = 1; // Minimum value of range
        int max = 6; // Maximum value of range
        // Print the min and max
        System.out.println("Random value in int from "+ min + " to " + max + ":");
        // Generate random int value from min to max
        int randomInt = (int)Math.floor(Math.random() * (max - min + 1) + min);
        return randomInt;

    }
    public static void main(String[] args) {
        System.out.println("Add the values of the dice");

        System.out.println(createDice(1));
    }
}
