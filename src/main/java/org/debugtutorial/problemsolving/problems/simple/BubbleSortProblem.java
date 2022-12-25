package org.debugtutorial.problemsolving.problems.simple;

public class BubbleSortProblem {
    public static void main(String args[]) {
        int data[] = {45, 2, 33, 11, 5, 9, 7, 21, 10, 67, 99, 123, 42, 81, 100, 54};

        System.out.println("input numbers:");
        printArray(data, 0, 15);
        System.out.println();

        performBubbleSort(data, 0, 15);

        System.out.println("numbers after sorting:");
        printArray(data, 0, 15);
        System.out.println();
    }

    public static void printArray(int[] arr, int startIndex, int endIndex) {
        int i;
        for (i = startIndex; i <= endIndex; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void performBubbleSort(int[] arr, int startIndex, int endIndex) {
        int i, j, temp;

        for (i = endIndex; i > startIndex; i--) {
            for (j = startIndex; j < i; i++) {
                if (arr[j] > arr[j + 1]) {
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
