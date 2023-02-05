package org.debugtutorial.problemsolving.problems.advanced;
import java.util.*;

/**
 *
 * There are n boxes in front of you. For each i, box i contains r[i] red balls, g[i] green balls,
 * and b[i] blue balls.
 * You want to separate the balls by their color. In each operation, you can pick a single ball from
 * some box and put it into another box.
 * The balls are separated if no box contains balls of more than one color.
 * Debug the given function minOperations and compute the minimal number of operations required
 * to separate the balls.
 * Note: In this problem you can modify at most six lines of code and you cannot add any new lines.
 *
 * Input Format
 * The first line contains a single integer n.
 * The next n lines i contain three space-separated integers,r[i], g[i], and b[i], respectively.
 * Print the minimal number of operations required to separate the balls.
 * If this is impossible, return -1.
 * Sample Input
 *
 *  3
 *  1 1 1
 *  1 1 1
 *  1 1 1
 *  Sample Output
 *
 *  6
 *  Explanation
 *
 *  Each box contains 1 ball of each color.
 *  In this explanation, the goal will be to let the first box contain only red balls,
 *  the second box only blue balls, and the third box only green balls.
 *  Move 1 blue ball and 1 green ball from the first box to the second and third boxes.
 *  Move 1 red ball and 1 green ball from the second box to the first and third boxes.
 *  Move 1 red ball and 1 blue ball from the third box to the first and second boxes.
 *  The number of operations is 6.
 */
public class MinimumOperations
{
    private static final Scanner scan = new Scanner(System.in);
    int n, r ,g, b;
    int[][] dp = new int[110][1<<3];

    Vector<Integer> red = new Vector();
    Vector<Integer> green = new Vector();
    Vector<Integer> blue = new Vector();

    public void get() {
        n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            r = scan.nextInt();
            g = scan.nextInt();
            b = scan.nextInt();
            red.add(r);
            green.add(g);
            blue.add(b);
        }
    }

    public void minOperations() {
        int i, j;
        for (i = 0; i < n; i++) {
            for (j = 0; j < 7; j++) {
                dp[i][j] = (1<<30);
            }
        }
        dp[0][0] = 0;
        for (i = 0; i < n; i++){
            for (j = 0; j < 7; j++){
                dp[i + 1][j | 1] = Math.min(dp[i + 1][j | 1], dp[i][j] + green.get(i) + blue.get(i));
                dp[i + 1][j | 2] = Math.min(dp[i + 1][j | 2], dp[i][j] + red.get(i) + blue.get(i));
                dp[i + 1][j | 4] = Math.min(dp[i + 1][j | 4], dp[i][j] + blue.get(i) + green.get(i));
            }
        }
        j = 0;
        for (i = 0; i < n; i++){
            if (green.get(i) != 0) j |= 1;
            if (red.get(i) != 0) j |= 2;
            if (blue.get(i) != 0) j |= 4;
        }
        if (dp[n][j] >= (1<<30)) dp[n][j] = -1;
        System.out.println(dp[n][j]);
    }
}
class Solution {
    public static void main(String[] args) {
        MinimumOperations obj = new MinimumOperations();
        obj.get();
        obj.minOperations();
    }
}
