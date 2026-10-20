package controlFlow;

/*
* Do while loop - execute the code block once, before checking if the condition is true.
*               - Then it will repeat the code block as long as the condition is true.
*               - Note: Semicolon is required after the while.
*                   - the loop always runs at least once, even if the condition is false.
* */

public class DoWhileLoop {
    public static void main(String[] args) {
        // ---> do while loop
        System.out.println("---> Do while loop <---");

        int num = 5;
        do {
            System.out.println("Hello Let's Learn Java.");
            num--;
        }while (num >= 1);

    }
}
