package com.aizel.training.practice.string;

/*

We'll say that a lowercase 'g' in a string is "happy" if there is another 'g'
immediately to its left or right. Return true if all the g's in the given string are happy.


gHappy("xxggxx") → true
gHappy("xxgxx") → false
gHappy("xxggyygxx") → false
*/

public class GHappy {
    public  static boolean gHappy(String str) {
        boolean isHappy = false;

        String notHappy[] = str.split("gg+");
        if (notHappy.length > 0){
            for(String eachNotHappy : notHappy){
                if(eachNotHappy.isEmpty() ){
                    isHappy = true;
                }
                if(eachNotHappy.contains("g")){
                    isHappy = false;
                }else{
                    isHappy = true;
                }
            }
        }else return isHappy = true;
        return isHappy;
    }
}
