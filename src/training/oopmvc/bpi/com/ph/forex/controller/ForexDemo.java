package training.oopmvc.bpi.com.ph.forex.controller;

import training.oopmvc.bpi.com.ph.forex.model.Customer;
import training.oopmvc.bpi.com.ph.forex.view.Display;

import java.util.Scanner;

public class ForexDemo {

    public static void main(String[] myVariableArray) {
        Scanner scanner = new Scanner(System.in);

        //input variables (local)
        System.out.print("Enter customer name: ");
        String name = scanner.nextLine();
        Display.showMenu("Pumili ng dayuhang pera: "); //call to overloaded method
        String currencySelected = scanner.nextLine();
        System.out.print("Enter Philippine peso amount: Php");
        double pesoAmount = scanner.nextDouble();
        //<className> <objectName> = new <className>();
        //Customer myCustomer = new Customer(name, pesoAmount, currencySelected); //object instantiation
        Customer myCustomer = new Customer(name, currencySelected, pesoAmount);
        myCustomer.convertAmount(); //call the process or business logic
        Display.showTransaction(myCustomer);
        scanner.close();
    }
}
