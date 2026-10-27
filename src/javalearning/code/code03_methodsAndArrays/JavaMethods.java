package javalearning.code.code03_methodsAndArrays;
/*
* Methods - a block of code, which runs when it is called.
*         - you can pass a parameter and argument in a method.
*         - method used to reuse code any time you need.
*
* Overloading method is a method with the same name but different parameters
* */
public class JavaMethods {
    public static void main(String[] args) {
        // call method that returns nothing but print welcome.
        System.out.println("---> method that returns nothing but print welcome");
        printWelcome();

        // call method that returns String.
        System.out.println("---> method that returns string");
        System.out.println(sayHello("Aiz"));

        // call an overloading method.
        System.out.println("---> overloading method");
        System.out.println(sayHello("Zel", 22));

        // call countdown using recursion
        System.out.println("---> recursion");
        System.out.println(totalSum(5));
        System.out.println(sum(2));
        System.out.println(factorial(5));
    }

    // ---> Methods <---

    // Method that returns nothing but prints Welcome.
    static void printWelcome(){
        System.out.println("Welcome to Java.");
    }

    // Method that returns a string to greet a person.
    static String sayHello(String name){
        name =  "Hello " + name;
        return name;
    }
    // Overloading method
    static String sayHello(String name, int age){
        String result = "Hello " + name + ", you're " + age + " years old";
        return result;
    }

    // Recursion

    static int totalSum(int num){
        if(num > 0 ){
            System.out.print(num + " ");
            return totalSum(num-1);
        }
        return 0;
    }

    // Recursion
    static int sum(int n){
        if (n == 0) return 0; // halting condition
        return n + sum(n - 1); // recursive condition;
    }

    // Recursion
    static int factorial(int n){
        if (n == 0) return 1;

        return n * factorial(n-1);
    }
}
