package javalearning.controlFlow;

// for loop - recommended if you know the exact times you want to loop through a block of code.
// nested loop - is it possible to place loop inside another loop.
//             - the inner loop executed one time for each iteration of the outer loop.
//             - inner loop (row) outer loop (column)
// for each loop - used exclusively to loop an array or other data structure.
// break = stop the loop completely.
// continue = skip this round, but keep looping.

public class ForLoop {
    public static void main(String[] args) {
        // ---> For Loop
        System.out.println("---> For Loop <--- \n");

        // ---> for loop: print numbers
        System.out.println("Print numbers");
        for (int i = 1; i < 5; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        // ---> for loop: print even numbers
        System.out.println("\nEven numbers:");
        for (int i = 0; i <= 10; i+=2){
            System.out.print (i + " ");
        }

        System.out.println();

        // ---> for loop: print sum
        System.out.println("\nSum:");
        int sum = 0;
        for(int i = 0; i <=5; i++){
            sum = sum + i;
        }
        System.out.println(sum);

        System.out.println();


        //---> Nested Loop
        System.out.println("---> Nested Loop <--- ");

        for(int i = 1; i <= 2; i++){
            for (int j = 1; j <= 3; j++){
                System.out.print("inner: " + j + " ");
            }
            System.out.println();
        }

        System.out.println();


        //---> For Each Loop
        System.out.println("---> For Each Loop <---");
        String names[] = {"Aiz", "Zel", "Joy"};

        for(String n : names){
            System.out.print(n + " ");
        }
    }
}
