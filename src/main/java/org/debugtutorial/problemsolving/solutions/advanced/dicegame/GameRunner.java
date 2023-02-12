package org.debugtutorial.problemsolving.solutions.advanced.dicegame;

import java.util.List;
import java.util.Scanner;

public class GameRunner {
    private int round=1,wins,losses =0;
    private static List<Dice> dices = Dice.createDice(5);

    public GameRunner() {
    }


    private void reset()
    {
        round=1;
        wins=0;
        losses=0;
    }
    private int answer()
    {
        int total =0;
        for(Dice dice:dices)
        {
            total = total+1;
        }
        return total;
    }
    public void run()
    {
        while (true)
        {
            System.out.println("Round number: "+this.round);
            for(Dice dice:dices)
            {
                dice.show();
            }
            Scanner scanner = new Scanner(System.in);  // Create a Scanner object
            System.out.println("What is your guess?: ");
            int guess = Integer.parseInt(scanner.nextLine());  // Read user input

            if(guess==this.answer())
            {
                System.out.println("Congrats, your input is correct...");
                wins++;
            }
            else
            {
                System.out.println("Sorry that's wrong");
                System.out.println("The correct answer is: "+this.answer());
                this.losses += 1;
            }
            round += 1;
            System.out.println("Wins: "+this.wins+",Losses:"+this.losses);
            System.out.println("Would you like to play again?[Y/n]: ");
            String choice = scanner.nextLine();

            if (choice.equalsIgnoreCase("y"))
            {
                continue;
            }
            else
            {
                break;
            }
        }

    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }
}
