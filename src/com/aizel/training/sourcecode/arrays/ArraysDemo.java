package com.aizel.training.sourcecode.arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        System.out.println("==============================================");
        System.out.println("             JAVA ARRAY DEMO                  ");
        System.out.println("==============================================");

        //double accountBalance1 = 10000.0;
        //double accountBalance2 = 20000.0;

        double[] accountBalances = {10000.0, 20000.0, 15000.0, 25000.0, 30000.0};

        System.out.println("\n First account balance:");
        System.out.println("PHP" + accountBalances[0]);

        System.out.println("\n Third account balance:");
        System.out.println("PHP" + accountBalances[2]);

        System.out.println("\n Number of accounts: " + accountBalances.length);

        accountBalances[2] = 17500.0;
        System.out.println("\n Updated third account balance:");
        System.out.println("PHP" + accountBalances[2]);


        System.out.println("\n==============================================");
        System.out.println("        Processing Array with For Loop        ");
        System.out.println("==============================================");

        for(int index = 0; index < accountBalances.length; index++){
            System.out.println("Account " + (index + 1) + ":PHP " + accountBalances[index]);
        }

//        System.out.println("\n==============================================");
//        System.out.println("      ArrayIndexOutOfBoundsException          ");
//        System.out.println("==============================================");
//
//        for(int index = 0; index <= accountBalances.length; index++){
//            System.out.println("Account " + (index + 1) + ":PHP " + accountBalances[index]);
//        }


        System.out.println("\n==============================================");
        System.out.println("    Processing Array with Enhanced For Loop   ");
        System.out.println("==============================================");

        double total = 0;

        for (double balance : accountBalances){
            total += balance;
        }

        System.out.println("\nTotal Balance of All accounts: PHP " + total);
    }
}