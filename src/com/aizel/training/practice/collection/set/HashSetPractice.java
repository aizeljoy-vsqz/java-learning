package com.aizel.training.practice.collection.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* NOTES
- useful for finding duplicates, repeated element
* */

public class HashSetPractice {
    public static String practice(String str){
        Set<String> names = new HashSet<>();
        names.add("Aiz");
        names.add("Zel");
        names.add("Joy");

        System.out.println("duplicate result false: " + names.add("Joy"));


        System.out.println("\n=====>> traverse using enhanced for loop");
        for(String n : names){
            System.out.println(n);
        }
        System.out.println("\n=====>> traverse using enhanced for loop");
        Iterator<String> iterator = names.iterator();
        while (iterator.hasNext()){
            String n = iterator.next();

            System.out.println(n);
        }


        return str;
    }
}
