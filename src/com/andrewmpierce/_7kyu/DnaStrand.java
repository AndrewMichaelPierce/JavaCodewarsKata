package com.andrewmpierce._7kyu;

// Complementary DNA
// Compliment Nucleobases

public class DnaStrand {
    public static String makeComplement(String dna) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            switch (dna.charAt(i)) {
                case 'A' : result.append("T");
                    break;
                case 'T' : result.append("A");
                    break;
                case 'C' : result.append("G");
                    break;
                case 'G' : result.append("C");
                    break;
            }
        }
        return result.toString();
    }
}
