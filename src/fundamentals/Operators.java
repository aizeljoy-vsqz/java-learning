package fundamentals;
/*
* Java Operators
*   - Arithmetic Operators (* / + - % ++ --)
*       -> used to perform mathematical operations.
*   - Assignment Operators (=)
*       -> used to assign values to variables/identifiers.
*       -> addition assignment (+=)
*           -> used to assign value to variables
*   - Comparison Operators (> < >= <= == !=)
*       -> used to compare two values or variables/identifiers
*   - Logical Operators (&& || !)
*       -> used to test for true or false values with logical operators
*   - Precedence (() * / % + - > < >=  <= == !=  && || =)
*       -> order of operations
* */

public class Operators {
    public static void main(String[] args) {
        // ---> Arithmetic Operators <---
        int num1 = 5;
        int num2 = 2;

        System.out.println("---> Arithmetic Operators (num1 = 5, num2 = 2) <---");
        System.out.println("multiplication: " + (num1 * num2));
        System.out.println("division: " + (num1 / num2));
        System.out.println("addition: " + (num1 + num2));
        System.out.println("subtraction: " + (num1 - num2));
        System.out.println("remainder: " + (num1 % num2));
        System.out.println("preIncrement: " + (++num1));
        System.out.println("postIncrement: " + (num1++));
        System.out.println("postDecrement: " + (num1--));
        System.out.println("preDecrement: " + (--num1) + "\n");


        // ---> Assignment Operators <---
        System.out.println("---> Assignment Operator <---");
        String name = "Aizel";
        System.out.println("Assigment Operator name = Aizel: " + name + "\n");


        // ---> Comparison Operators <---
        System.out.println("---> Comparison Operator <---");
        int a = 2;
        int b = 3;

        if (a == b){
            System.out.println("the value of a is equal to the value of b. \n");
        }else{
            System.out.println("the value of a is NOT equal to the value of b. \n");
        }


        // ---> Logical Operators <---
        System.out.println("---> Logical Operator <---");
        boolean val1 = true;
        boolean val2 = false;

        if (true){
            System.out.println(val1);
        }else{
            System.out.println(val2);
        }

    }
}
