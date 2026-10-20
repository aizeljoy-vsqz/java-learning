package controlFlow;

/*
* Switch - select one of many code blocks to be executed.
*        - the switch expression is evaluated once.
*        - the result is  compared to case value.
*        - if there's a match, the matching block of code runs.
*        - break - stops the execution & ignore the execution of all the rest after the block of code runs
*        - default - execute the block of code if there's no matching case.
* */

public class SwitchStatement {
    public static void main(String[] args) {
        // switch statement
        System.out.println("---> Switch Statement <---");

        char answer = 'b';

        switch(answer){
            case 'a':
                System.out.println("a. java");
                break;
            case 'b':
                System.out.println("b. javaScript");
                break;
            case 'c':
                System.out.println("c. python");
                break;
            default:
                System.out.println("Invalid answer");
        }

    }
}
