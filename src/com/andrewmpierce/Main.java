package com.andrewmpierce;
import com.andrewmpierce._7kyu.*;
import com.andrewmpierce._8kyu.*;

public class Main {

    public static void main(String[] args) {
        // 8kyu
        System.out.println("Binary to Decimal = " +
                Converter.binToDecimal("00011"));
        System.out.println("Base can be Factored by Input = " +
                Factor.checkForFactor(10, 5));

        // 7kyu
        System.out.println("Compliment Nucleobases = " +
                DnaStrand.makeComplement("CTAATGT"));
        System.out.println("Smallest number combined from input, ignoring duplicates = " +
                Minimum.minValue(new int[]{500, 5, 23}));
        System.out.println("Factorial of Input = " +
                Factorial.factorial(9));
    }

}
