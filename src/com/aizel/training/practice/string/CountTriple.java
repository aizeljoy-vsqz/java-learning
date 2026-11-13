package com.aizel.training.practice.string;

/*
We'll say that a "triple" in a string is a char appearing three times in a row.
Return the number of triples in the given string. The triples may overlap.


countTriple("abcXXXabc") → 1
countTriple("xxxabyyyycd") → 3
countTriple("a") → 0

*/

public class CountTriple {
    public static int countTriple(String str) {
        int count = 0;
        str += "  ";
        for (int i = 0; i < str.length()-2; i++){
            char c = str.charAt(i);
            char nextC = str.charAt(i+1);
            char nextNext = str.charAt(i+2);
            System.out.println(c + "" + nextC + "" + nextNext);
            if((c == nextC) && nextC == nextNext){
                count++;
            }
        }
        return count;
    }
}
