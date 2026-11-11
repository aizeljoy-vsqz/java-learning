package com.aizel.training.practice.string;

/*
Given a string, return true if the number of appearances of "is" anywhere
in the string is equal to the number of appearances of "not" anywhere
in the string (case-sensitive).


equalIsNot("This is not") → false
equalIsNot("This is notnot") → true
equalIsNot("noisxxnotyynotxisi") → true
*/

public class EqualIsNot {
     static boolean equalIsNot(String str) {
        String isArray[] = str.replace(" ", "").split("is", -1);
        String notArray[] = str.replace(" ", "").split("not", -1);

        if((isArray.length) == (notArray.length)){
            return true;
        }else{
            return false;
        }
    }
}
