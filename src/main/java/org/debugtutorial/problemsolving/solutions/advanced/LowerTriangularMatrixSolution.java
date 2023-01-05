package org.debugtutorial.problemsolving.solutions.advanced;
import java.util.Arrays;

/**
 * A lower triangular matrix is a two-dimensional array with zeros above the diagonal.
 * The goal og this code is to convert a 2D array into a lower triangular matrix:
 * Input Matrix:
 * [1, 2, 3]
 * [4, 5, 6]
 * [7, 8, 9]
 * Expected output Matrix:
 * [1, 0, 0]
 * [4, 5, 0]
 * [7, 8, 9]
 */

public class LowerTriangularMatrixSolution {
    public static void main(String[] args) {
        int[][] matrix = new int[][] {
                {1, 2, 3},
                {8, 6, 4},
                {2, 4, 6}
        };
        System.out.println("Initial Matrix :");
        printMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix[i].length; j++) {
                if (j > i) {
                    matrix[i][j]=0;
                }
            }
        }

        System.out.println("Lower Triangular Matrix:");
        printMatrix(matrix);
    }
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(Arrays.toString(matrix[i]));
        }
    }
}
