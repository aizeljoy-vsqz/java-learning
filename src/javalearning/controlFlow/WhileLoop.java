package javalearning.controlFlow;
/*
*   While Loop - repeats a block of code while condition is true.
*              - if condition is false, the block of code inside the loop will never run.
* */
public class WhileLoop {
    public static void main(String[] args) {
        // ---> while loop
        System.out.println("---> While Loop <---");

        int num = 1;
        while (num <= 5){
            System.out.println(num);
            num++;
        }
    }
}
