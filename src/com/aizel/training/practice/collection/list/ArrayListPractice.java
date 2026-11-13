package com.aizel.training.practice.collection.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListPractice {
    public static void main(String[] args) {
        List<String> names  = new ArrayList<>();

        names.add("Aizel");
        names.addFirst("Zel");

        Iterator<String> i = names.iterator();
        while (i.hasNext()){
            String n = i.next();
            System.out.println(n);
        }

    }
}
