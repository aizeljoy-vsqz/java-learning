package controlFlow;

/*
* if statement - to specify a block of code to be executed, if condition is true.
* else - to specify a block of code to be executed, if the same condition is false.
* else if - to specify new condition to test, if the first condition is false
* switch - to specify many alternatives block to code to be executed.
*
* Notes:
*   - the condition inside the if statement must result boolean value.
*   - shorthand if else:
*       variables = (condition) ? expressionTrue : expressionFalse
*   - nested if statement - you can put if statement inside another if statement
*
* */

public class IfElse {
    public static void main(String[] args) {
        //---> if statement
        System.out.println("---> if statement <---");
        if (2 > 1){
            System.out.println("Using if statement: (true) 2 is greater than 1.");
        }

        //---> if else statement
        if(1 > 2){
            System.out.println("true");
        }else System.out.println("Using if else statement: (false) 1 is less than 2");

        //---> else if statement
        int age = 16;
        if(age > 17){
            System.out.println("Age is greater than 17");
        } else if (age > 9) {
            System.out.println("Using else if: (true) age is greater than 9");
        }else System.out.println("kid.");

        //---> ternary operator
        String result = (2 < 5) ? "true: 2 < 5" : "false: 2 < 5";
        System.out.println("Using ternary operator: " + result);
    }
}
