package com.andrewmpierce._7kyu;

// Factorial of Input

public class Factorial {
    public static long factorial(int n) {
        long result = 1;
        long factorial = 1;
        if (n == 0) {
            return 1L;
        }
        do {
            result *= factorial;
            factorial++;
        } while (factorial <= n);
        return result;
    }
}
