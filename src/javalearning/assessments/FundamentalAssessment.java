package javalearning.assessments;

import java.util.Scanner;

public class FundamentalAssessment {
    public static void main(String[] args) {

        // NOTES: uncomment to call the methods
        // predictTheOutput();
        // calculation();
        // datatypeConversion();
        debugging();
    }

    // Assessment Fundamentals (DONE 4 FUNDAMENTALS CHALLENGES)

    // ---> FUNDAMENTALS: Predict the output (score: 3/4) ✅
    // Without running the code first, write down the output. Then run it in your IDE to verify your answer.
    static void predictTheOutput(){
        int a = 10;
        int b = 3;

        System.out.println(a / b); // answer: 3 ✔️
        System.out.println(a % b); // answer: 1 ✔️
        System.out.println(a + b * 2); // answer: 16 ✔️

        double result = (double) a / b;
        System.out.println(result); // answer: 3.5 ❌ correct answer: 3.3333333333333335
    }


    // --->  FUNDAMENTALS: User input and calculation ✅
    // Create a program named BasicCalculator
    static void calculator(){
        //  Requirements:
        //  - Ask the user to enter two numbers.
        //  - Display their sum, difference, product, and quotient.
        //      - Use Scanner for input.
        //      - Prevent division by zero.
        //      - Display the quotient with decimal precision when appropriate.

        Scanner s = new Scanner(System.in);
        int num1;
        int num2;

        System.out.print("Enter first number: ");
        num1 = s.nextInt();

        System.out.print("Enter second number: ");
        num2 = s.nextInt();

        System.out.println("Sum: " + (num1 + num2));
        System.out.println("Difference: " + (num1 - num2));
        System.out.println("Product: " + (num1 * num2));
        if(num1 > 0){
            System.out.println("Quotient: " + ((double) num1 / num2));
        }else{
            System.out.println("0 is not divisible by " + num2);
        }
        s.close();
    }


    // ---> FUNDAMENTALS: Data types and conversion ✅
    // Write a program that asks for a student's name and three subject grades.
    static void datatypeConversion(){
        //Requirements:
        //  - Store the name as a String.
        //        - Store the grades as numeric values.
        //        - Calculate the average.
        //  - Display the student's name and average.

        String name = "Aiz";
        int gradeA = 85;
        int gradeB = 88;
        int gradeC = 90;
        double total = (gradeA + gradeB + gradeC);

        System.out.println("Student Name: " + name);
        System.out.println("Average: " + (total / 3));
    }


    // ---> FUNDAMENTALS: Debugging ✅
    // Find and correct the errors in this code.
    static void debugging(){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        // add else
        if (age == 18) { // from: age = 18 , to: age == 18 ✔️
            System.out.println("You are 18 years old.");
        } else System.out.println("Your age is " + age); // from: Age , to:age✔️  and add else✔️
    }
}
