package javalearning.code.code01_fundamentals;

import java.util.ArrayList;

/*
* Variable - variables are container for storing data value.
*
* DataType - Primitive data type: byte, short, int, long, float, double, char, boolean
*          - Non-primitive data type: String, Array, Class
*               - non-primitive data type also called reference types because they refer to objects.
*          - Syntax: type variableName  = value;
* Notes:
*   final - final keyword use to make a constant variable. (cannot be change)
*
*   mixing text and numbers
*       // ex: "Hello" + 2 + 3 // result: Hello 23
*       // if you print string then add number java will treat the number as string.
*       // enclosed it with parenthesis so the number can calculate.
*       // ex: "Hi" + (2 + 3) // result: Hi 5
*
*   var - var keyword lets compiler automatically detect the type
*       - var only works when you assign value.
*       - var is useful for complex  types like ArrayList
* */
public class Variables {
    public static void main(String[] args) {
        // ---> Initializing Variables:
        System.out.println("---> Data types and variable value<---");

        int myInt = 20;
        float myFloat = 20.22f;
        double myDouble = 20.5;
        boolean myBoolean = true;
        String myString = "Hello";

        System.out.println("int: " + myInt);
        System.out.println("float: " + myFloat);
        System.out.println("double: " + myDouble);
        System.out.println("boolean: " + myBoolean);
        System.out.println("String: " + myString + "\n");


        // ---> Use final keyword to make the variable constant.
        System.out.println("---> Using final keyword <---");

        final String NAME = "Aizel";
        // NAME = "Zel"; // note: final cannot be reassigned.
        System.out.println("Name : " + NAME + "\n");


        // ---> Reassigning variable to new value.
        System.out.println("---> Reassigning variable <---");

        int age = 20;
        age = 23;
        System.out.println("Age: " + age + " years old. \n");


        // ---> Using var keyword
        System.out.println("---> Using var keyword <---");

        // not recommended for simple type like int.
        var num = 5;
        System.out.println("num: " + num);

        // instead of using ArrayList type we can use var.
        ArrayList<String> list  = new  ArrayList<>();
        System.out.println("list: " +  list);
        // var is recommended for complex types
        var numbers = new ArrayList<Integer>();
        numbers.add(1);
        numbers.add(2);

        System.out.println("numbers" + numbers + "\n");
    }
}
