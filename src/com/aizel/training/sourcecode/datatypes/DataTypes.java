package com.aizel.training.sourcecode.datatypes;
/*********************
 * This application demonstrates the 8 primitive types.
 *
 * @author christian.r.zalameda
 * @since 10/27/2026
 * @version 1.0
 ***************/
public class DataTypes {
    /*
          The main() method is the entry-point of execution.

          Return: void
          Parameter: String[] args
         */
    public static void main(String[] args) {

        // Types of variable declarations
        //  1. local/automatic variable (owned by the function)
        //	2. instance variable (owned by the object)
        //  3. class/static variable (owned by the class)

        //implicit
        //explicit

        //integral data types
        byte numberOne = 50;
        short number2 = 100;
        int number3 = 125_550 + numberOne + number2; //implicit or widening or upcasting
        long number4 = (long) 1_500_000 + number3;

        System.out.println("number1: " + numberOne);
        System.out.println("number2: " + number2);
        System.out.println("number3: " + number3);
        System.out.println("number4: " + number4);

        //floating-point literals
        float numberFive = (float) 5.63; //explicit/narrowing/downcasting
        double numberSix = 535_456.89 + numberFive + number4 + number3;

        System.out.println("numberFive: " + numberFive);
        System.out.println("numberSix: " + numberSix);

        //character-literal
        char myFaveChar = 'M';
        int equivalentIntChar = (int) myFaveChar;

        System.out.println("\nMy Fave Character: " + myFaveChar);
        System.out.println("integer character equivalent: " + equivalentIntChar);

        System.out.println("Adding 5 to 77 character equivalent? " + ((char) (equivalentIntChar + 5)));

        //System.out.println("DEC\tSymbol");
		/*for (int counter=0;counter <=255; counter++) {
			System.out.println(counter + "\t" + (char)counter);
		}*/

        //boolean literal
        boolean isOct30Payday = true;
        boolean isOneDayMillionaire = true;

        //sample ternary operator
        String message = (isOct30Payday)
                ? "\nYes. This October 30 is our payday."
                : "\nNo. It could be earlier or on November 3.";

        System.out.println(message);

        //sample if-else condition
        if (!isOneDayMillionaire) {
            System.out.println("Always save 10-20% of your monthly salary as emergency fund.");
        } else {
            System.out.println("You need to be mindful of your spending.");
        }

        String myMessage = new String("Welcome to ASE Reinvention Java Backend com.aizel.training");
        System.out.println(myMessage);

        //use of instrospection
        if (args instanceof String[]) {
            System.out.println("\nargs is of type String[].");
        } else {
            System.out.println("\nargs is NOT of type String[].");
        }

        if (args instanceof Object) {
            System.out.println("\nargs is of type Object.");
        } else {
            System.out.println("\nargs is NOT of type Object.");
        }

        boolean condition1 = true;
        boolean condition2 = false;
        boolean condition3 = true;

        //use of & (without lazy evaluation)
        if (condition2 & condition1 & condition3) {
            System.out.println("T1 condition2 & condition1 & condition3: " + (condition2 & condition1 & condition3));
        } else {
            System.out.println("F1 condition2 & condition1 & condition3: " + (condition2 & condition1 & condition3));
        }

        //use of && (lazy evaluation)
        if (condition2 && condition1 && condition3) {
            System.out.println("T2 condition2 && condition1 && condition3: " + (condition2 && condition1 && condition3));
        } else {
            System.out.println("F2 condition2 && condition1 && condition3: " + (condition2 && condition1 && condition3));
        }

        //use of | (without lazy evaluation)
        if (condition1 | condition2 | condition3) {
            System.out.println("T1 condition1 | condition2 | condition3: " + (condition1 | condition2 | condition3));
        } else {
            System.out.println("F1 condition1 1 condition2 1 condition3: " + (condition1 | condition2 | condition3));
        }

        //use of || (with lazy evaluation)
        if (condition1 || condition2 || condition3) {
            System.out.println("T2 condition1 || condition2 || condition3: " + (condition1 || condition2 || condition3));
        } else {
            System.out.println("F2 condition1 || condition2 || condition3: " + (condition1 || condition2 || condition3));
        }

        //use of shorthand notation
        int numberValue = 5;
        numberValue += 10; //numberValue = numberValue + 10;
        System.out.println("numberValue: " + numberValue);

        String valueMessage = "The resulting value is ";
        valueMessage += numberValue;
        System.out.println(valueMessage);

        System.out.println("8 | 2: " + (8 | 2));
        System.out.println("8 & 2: " + (8 & 2));
    }

}


