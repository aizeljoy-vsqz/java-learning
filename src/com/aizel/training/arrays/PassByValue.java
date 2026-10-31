package com.aizel.training.arrays;

public class PassByValue {
    public static void main(String[] args) {
        System.out.println("==============================================");
        System.out.println("            PASS BY VALUE                     ");
        System.out.println("==============================================");

        double accountBalance = 5000.0;

        System.out.println("\nBalance before the service fee: ");
        System.out.println("PHP: " + accountBalance);

        applyServiceFee(accountBalance);

        System.out.println("\nBalance after the service fee method:");
        System.out.println("PHP: " + accountBalance);
    }

    static void applyServiceFee(double balance){
        System.out.println("\nInside applyServiceFee:");
        balance -= 10.0;

        System.out.println("Balance inside method: PHP " + balance);
    }
}