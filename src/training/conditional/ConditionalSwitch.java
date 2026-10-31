package training.conditional;

import java.util.Scanner;

public class ConditionalSwitch {
    public static void main(String[] args) {
        //IPO

        Scanner scanner = new Scanner(System.in);

        //input variables (local)
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();

        System.out.println("List foreign currency");
        System.out.println("1 - USD");
        System.out.println("2 - EUR");
        System.out.println("3 - JPY");
        System.out.println("4 - AUD");
        System.out.print("Select foreign currency: ");
        String currencySelected = scanner.nextLine();

        System.out.print("Enter Philippine peso amount: Php");
        double pesoAmount = scanner.nextDouble();

        //computed variables (local)
        double convertedAmount = 0;
        String currencyEquivalent = "";
        boolean isValid = true;

        //process
        switch(currencySelected) {
            case "1":
                convertedAmount = pesoAmount / 64.35;
                currencyEquivalent = "USD$";
                break;
            case "2":
                convertedAmount = pesoAmount / 73.3531;
                currencyEquivalent = "€";
                break;

            case "3":
                convertedAmount = pesoAmount / 0.4166;
                currencyEquivalent = "¥";
                break;
            case "4":
                convertedAmount = pesoAmount / 46.1469;
                currencyEquivalent = "AUD$";
                break;
            default:
                isValid = false;
                break;
        }

        //output
        if (isValid) {
            System.out.println("\nCustomer Name: " + name);
            System.out.println("Philippine Peso: Php " + pesoAmount);
            System.out.println("Foreign Currency Equivalent: " + currencyEquivalent+convertedAmount);
        } else {
            System.err.println("\nInvalid selection of foreign currency target. Please try again.");
        }
        scanner.close();
    }
}
