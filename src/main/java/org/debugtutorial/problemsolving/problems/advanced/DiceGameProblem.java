package org.debugtutorial.problemsolving.problems.advanced;


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
