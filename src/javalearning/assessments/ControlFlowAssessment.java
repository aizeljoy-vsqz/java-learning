package javalearning.assessments;

import java.util.Scanner;

public class ControlFlowAssessment {
    public static void main(String[] args) {
        // Note: Uncomment to call the other method.
        // gradeCalculator();
        // numberClassification();
        // loopChallenge();
        // nestedLoopPattern();
        fizzBuzz();
    }


    // ---> CONTROL FLOW:  Grade calculator ✅
    // Ask the user to enter a score from 0 to 100.
    static void gradeCalculator(){
        /* Use conditional statements to display the corresponding grade:
        *   90 - 100          Excellent
        *   80 - 89           Very Good
        *   75 - 79           Passed
        *   0 - 74            Failed
        *   Outside 0 - 100   Invalid Score
        *
        *   Requirements:
        *       Use if, else if, and else.
        *       Handle invalid input values.
        *       Test boundary values such as 74, 75, 89, 90, and 100.
        * */

        int score;
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your score from (0-100): ");
        score = s.nextInt();

        if(score > 100){
            System.out.println("Invalid Score");
        } else if (score > 89) {
            System.out.println("Excellent");
        } else if (score > 79) {
            System.out.println("Very Good");
        } else if (score > 74){
            System.out.println("Failed");
        } else System.out.println("Invalid Score");

    }

    // ---> CONTROL FLOW: Number classification ✅
    // Ask the user for an integer and determine whether it is:
    static void numberClassification(){
        // Positive, negative, or zero.
        //Even or odd.
        int num;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = s.nextInt();

        if (num > 0){
            System.out.println("Number Type: Positive");
            String parity = (num % 2 == 0) ? "Parity: Even" : "Parity: Odd";
            System.out.println(parity);
        } else if (num < 0){
            System.out.println("Number Type: Negative");
            String parity = (!(num % 2 == 0)) ? "Parity: Odd" : "Parity: Even";
            System.out.println(parity);
        } else {
            System.out.println("Number Type: 0");
        }
    }

    // ---> CONTROL FLOW: Loop Challenge - MultiplicationTable ✅
    // Ask the user for a number and display its multiplication table from 1 to 10.
    static void loopChallenge(){
        Scanner s =  new Scanner(System.in);
        System.out.print("Enter a number to multiply: ");
        int num = s.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println(num + " *  " + i + " =  " + (num * i));
        }

        s.close();
    }

    //---> CONTROL FLOW: Nested Loop Pattern - NumberPattern ✅
    // Ask the user for the number of rows and print the following pattern when the input is 5:
    static void nestedLoopPattern(){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number of rows: ");
        int rows = s.nextInt();

        for (int i = 1; i <= rows; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }

    //---> CONTROL FLOW: FizzBuzz ✅
    // Print the numbers from 1 to 15,
    static void fizzBuzz(){
        /*  following these rules:
            Multiples of 3: print Fizz.
            Multiples of 5: print Buzz.
            Multiples of both 3 and 5: print FizzBuzz.
            Otherwise, print the number.
        * */
        for (int i = 1; i<= 15; i++){
            if((i % 3 == 0) && (i % 5 == 0)){
                System.out.println("FizzBuzz");
            }else if(i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz");
            }else System.out.println(i);
        }
    }
}


