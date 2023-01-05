package org.debugtutorial.problemsolving.problems.advanced;

import java.util.*;
import java.lang.*;

/**
 * Given an array of n distinct integers, transform the array into a zigzag sequence by permuting the array
 * elements. A sequence will be called a zigzag sequence if the first k elements in the sequence are in
 * increasing order and the last k elements are in decreasing order, where k=(n+1)/2.
 * You need to find lexicographically the smallest zigzag sequence of the given array.
 * Example.
 * a=[2,3,5,1,4]
 * Now if we permute the array as [1,4,5,3,2], the result is a zigzag sequence.
 * Debug the given function findZigZagSequence to return the appropriate
 * zigzag sequence for the given input array.
 * Sample Input
 * 1
 * 7
 * 1 2 3 4 5 6 7
 * Sample Output
 * 1 2 3 7 6 5 4
 */
public class ZigZagSequenceProblem {
    public static void main (String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
            int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
    }

    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a);
        int mid = (n + 1)/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp;

        int st = mid + 1;
        int ed = n - 1;
        while(st <= ed){
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed + 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}




