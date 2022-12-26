package org.debugtutorial.problemsolving.solutions.simple;

/**
 * The goal is to construct a right diagonal:
 *
 *         *
 *       *
 *     *
 *   *
 * *
 * However, the starter code prints the following:
 *
 * *
 * * *
 * * * *
 * * * * *
 * * * * * *
 */

public class PyramidSolution {

    public static void main(String[] args) {
        int rows = 5;
        for (int i = rows; i >=0; i--) {
            for (int j = 1; j <= i; j++) {
                if(i==j)
                {
                    System.out.print("  *");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
