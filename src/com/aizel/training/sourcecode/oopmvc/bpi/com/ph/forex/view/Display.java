package com.aizel.training.sourcecode.oopmvc.bpi.com.ph.forex.view;
import com.aizel.training.sourcecode.oopmvc.bpi.com.ph.forex.model.Customer;

public class Display {
    public static void showMenu() { //static or class method
        System.out.println("List foreign currency - method overload 1");
        System.out.println("1 - USD");
        System.out.println("2 - EUR");
        System.out.println("3 - JPY");
        System.out.println("4 - AUD");
        System.out.print("Select foreign currency: ");
    }

    public static void showMenu(String message) { //static or class method
        System.out.println("List foreign currency - method overload 2");
        System.out.println("1 - USD");
        System.out.println("2 - EUR");
        System.out.println("3 - JPY");
        System.out.println("4 - AUD");
        System.out.println(message);
    }

    public static void showTransaction(Customer kustomer) {
        //output
        if (kustomer.isValid()) {
            System.out.println("\nCustomer Name: " + kustomer.getName());
            System.out.println("Philippine Peso: Php " + kustomer.getPesoAmount());
            System.out.println("Foreign Currency Equivalent: "
                    + kustomer.getCurrencyEquivalent()+kustomer.getConvertedAmount());
        } else {
            System.err.println("\nInvalid selection of foreign currency target. Please try again.");
        }
    }
}
