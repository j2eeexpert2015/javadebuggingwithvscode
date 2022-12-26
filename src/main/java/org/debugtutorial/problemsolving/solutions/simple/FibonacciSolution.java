package org.debugtutorial.problemsolving.solutions.simple;

/**
 * In the Fibonacci sequence, each number is the sum of two numbers that precede it.
 * For example:
 * 1, 1, 2, 3, 5, 8 , 13, 21, ...
 * The following formula describes the Fibonacci sequence:
 * f(1) = 1
 * f(2) = 1
 * f(n) = f(n-1) + f(n-2) if n > 2
 */

public class FibonacciSolution
{
    public static void main(String[] args) {
        int n = 9;
        System.out.println(fib(n));
    }

    static int fib(int n)
    {
        if (n == 0)
            return 0;
        if (n == 1 || n==2)
            return 1;
        return fib(n - 1) + fib(n - 2);
    }

}
