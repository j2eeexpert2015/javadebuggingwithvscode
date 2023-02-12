package org.debugtutorial.problemsolving.solutions.advanced.dicegame;

import java.util.ArrayList;
import java.util.List;

public class Dice {

    private int value = 0;

    public Dice() {
        roll();
    }

    public void roll()
    {
        int min = 1; // Minimum value of range
        int max = 6; // Maximum value of range
        int random_int = (int)Math.floor(Math.random() * (max - min + 1) + min);
        this.value = (int)Math.floor(Math.random() * (max - min + 1) + min);
    }
    public void show()
    {
        String displayStr = "";
        switch (this.value) {

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
        System.out.println(displayStr);
    }

    public static List<Dice> createDice(int count)
    {
        List<Dice> dices = new ArrayList<>();
        for (int i = 0; i < count; i++)
        {
            dices.add(new Dice());
        }
        return dices;

    }
}
