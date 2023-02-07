package org.debugtutorial.problemsolving.problems.advanced.dicegame;

public class GameRunner {
    private int round=1,wins,losses =0;

    public GameRunner(int round, int wins, int losses) {
        this.round = round;
        this.wins = wins;
        this.losses = losses;
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
