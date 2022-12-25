package org.debugtutorial.problemsolving.solutions.simple;

public class CalculateRootSolution
{
    /**
     * Given a quadratic equation in the form ax2 + bx + c, find roots of it.
     * @param a
     * @param b
     * @param c
     */
    public static void printRoots(double a,double b,double c)
    {
        double root1, root2;
        double determinant = b * b - 4 * a * c;
        if(determinant<0)
        {
            System.out.println("\n As the determinant is negative the roots are not calculated ");
        }
        else
        {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.format("\n root1 = %.2f and root2 = %.2f", root1 , root2);
        }

    }

    public static void main(String[] args)
    {
        printRoots(5,10,2);
        printRoots(5,2,20);
    }
}
