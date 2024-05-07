package com.example.project5recursion_search;

public class Part1Recursion {
    public static int sum1toN(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sum1toN(n - 1);
        }
    }

    public static double power(double x, int n) {
        if (n == 0) {
            return 1;
        } else {
            return x * power(x, n - 1);
        }
    }

    public static void main(String[] args) {
        int n = 7;
        System.out.println("Sum of the first " + n + " positive integers: " + sum1toN(n));

        double x = 4.0;
        int powerValue = 5;
        System.out.println(x + " raised to the power of " + powerValue + ": " + power(x, powerValue));
    }
}