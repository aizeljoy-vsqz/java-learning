# 📝 Java Fundamentals Assessment:

These topics are AI assisted to assess my learnings in java fundamentals.

*Notes: I will update this base on what I have finished in this assessments by putting complete marks ✅.*  

**Topics Covered:**
- Java fundamentals - variables, data types,  operators, input/output.  
- Logic and control flow - conditions, loops and nested loops.   
- Arrays - traversal, searching, calculations
- Methods - parameters, return values, decomposition

<br/>

### PART 1: 👩🏻‍💻Java Fundamentals (4 Challenges)

--- 

- [x] **1. Predict the output** 

*Without running the code first, write down the output. Then run it in your IDE to verify your answer.*  

```java
public class Main {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a / b);
        System.out.println(a % b);
        System.out.println(a + b * 2);

        double result = (double) a / b;
        System.out.println(result);
    }
}
```
---
- [x] **2. User Input and Calculation**  

*Create a program named BasicCalculator*  

Requirements:
- Ask the user to enter two numbers.
- Display their sum, difference, product, and quotient.
- Use Scanner for input.
- Prevent division by zero.
- Display the quotient with decimal precision when appropriate.

---

- [x] **3.Data Types and Conversion**  

*Write a program that asks for a student's name and three subject grades.*  

Requirements:
- Store the name as a String.
- Store the grades as numeric values.
- Calculate the average.
- Display the student's name and average.
- Explain why using int versus double can affect the result.  

---

- [x] **4. Debugging**  

*Find and correct the errors in this code.*  

```java
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = input.nextInt();

        if (age = 18) {
            System.out.println("You are 18 years old.");
        }

        System.out.println("Your age is " + Age);
    }
}
```

---

<br/>

### PART 2: 👩🏻‍💻Logic and Control Flow  (5 Challenges)

---

- [ ] **1. Grade calculator**  

*Create GradeCalculator*

Ask the user to enter a score from 0 to 100.  
Use conditional statements to display the corresponding grade:  

| Score	   | Result             |
|---------|--------------------|    
| 90–100	  | Excellent          |
| 80–89	   | Very Good          |
| 75–79	   | Passed             |
| 0–74	    | Failed             |
| Outside | 0–100	Invalid score |

Requirements:
- Use if, else if, and else.
- Handle invalid input values.
- Test boundary values such as 74, 75, 89, 90, and 100.  

---

- [ ] **2. Number classification**  

*Create NumberClassifier*  

Ask the user for an integer and determine whether it is:
- Number Type: Positive, negative, or zero.
- Parity: Even or odd.  

---

-[ ] **3. Loop challenge**  

Create MultiplicationTable  

*Ask the user for a number and display its multiplication table from 1 to 10.*  

```
Enter a number: 5

5 x 1 = 5
5 x 2 = 10
5 x 3 = 15
...
5 x 10 = 50
```  

---

- [ ] **4. Nested loop pattern**  

*Create NumberPattern*   

Ask the user for the number of rows and print the following pattern when the input is 5:  
``` 
1
12
123
1234
12345
```

Requirements:
- Use nested loops.
- The number of rows must depend on user input.
- Do not hardcode each line.  

---

- [ ] **5. FizzBuzz**  

*Create FizzBuzz*  

Print the numbers from 1 to 100, following these rules:
- Multiples of 3: print Fizz.
- Multiples of 5: print Buzz.
- Multiples of both 3 and 5: print FizzBuzz.
- Otherwise, print the number.  

``` 
1
2
Fizz
4
Buzz
...
14
FizzBuzz
16
```

---

<br/>

### PART 3: 👩🏻‍💻Array (5 Challenges)

---

- [ ] **1. Array statistics**

*Create ArrayStatistics*  

Given this array:
```  
int[] numbers = {12, 5, 8, 20, 3, 15};
```

Write code to calculate and display:
- The sum of all elements.
- The average.
- The largest value.
- The smallest value.
  Expected results:

```
Sum: 63
Average: 10.5
Largest: 20
Smallest: 3
```

---

- [ ] **2. Find a number**  

*Create LinearSearch*  

Given an integer array, ask the user to enter a number to search for.  

``` 
int[] numbers = {10, 25, 30, 45, 50};
```

Expected output when searching for 30:  

```
Number found at index: 2
```

Requirements:
- Use a loop.
- Use a boolean variable or another clear way to track whether the number was found.
- Remember that array indexes start at 0.  

---

-[ ] **3. Reverse an array**  

*Create ReverseArray*  

Given:
```
int[] numbers = {1, 2, 3, 4, 5};
```  

Display the elements in reverse order:

``` 
Original: [1, 2, 3, 4, 5]
Reversed: [5, 4, 3, 2, 1]
```

Challenge: Reverse the array in place without creating a second array.  

---

- [ ] **4. Find the second-largest number**  

*Create SecondLargest*  

Given:  
```  
int[] numbers = {10, 5, 20, 8, 20, 15};
```

Expected output:
``` 
Second largest distinct number: 15
```

Requirements:
- Do not sort the array.
- Handle duplicate values correctly.
- Consider what should happen if the array has fewer than two distinct values.  

---

- [ ] **5. Count even and odd numbers**  

*Create EvenOddCounter*  

Given an array, count the even and odd elements.  
``` 
int[] numbers = {1, 2, 3, 4, 5, 6, 8};
```

Expected Output:  
```
Even numbers: 4
Odd numbers: 3 
```

--- 

<br/> 

### PART 4: 👩🏻‍💻Methods (4 Challenges)

--- 

- [ ] **1. Create reusable methods**  

*Create MethodCalculator*  

Write separate methods for:
```
static int add(int a, int b)
static int subtract(int a, int b)
static int multiply(int a, int b)
static double divide(double a, double b)
``` 

Requirements:
- Each method must return its result.
- Call each method from main().
- Handle division by zero appropriately.
- Do not place all the calculations directly inside main().  

---

- [ ] **2. Method for checking prime numbers**  

*Create PrimeChecker*  

Write a method:  
``` 
static boolean isPrime(int number)
```

It should return true if the number is prime and false otherwise.  

| Input	 | Expected return |
|-------|-----------------|
| 2	     | true            |
| 7	     | true            |
| 9	     | false           |
| 1	     | false           |
| -5	    | false           |  

Call your method several times from main() to test it.  

---

- [ ] **3. Factorial using a method**  

*Create FactorialCalculator*  

Write a method:  
```
static long factorial(int n)
```

Calculate the factorial of a non-negative integer using a loop.

For example:
``` 
5! = 5 x 4 x 3 x 2 x 1 = 120
```

Expected output:  
```
Factorial of 5: 120
Factorial of 0: 1 
``` 
Requirements:
- Handle 0 correctly.
- Reject negative input.
- Consider the range of long to avoid integer overflow. 

---

- [ ] **4. Method that processes an array**  

*Create ArrayMethodChallenge*  

Write these methods:  
``` 
static int findMax(int[] numbers)
static int countEven(int[] numbers)
static double calculateAverage(int[] numbers)
```

Requirements:
- Each method must accept an array as a parameter.
- Each method must return the correct result.
- Test the methods using at least two different arrays.
- Decide how your methods should handle an empty or null array, and implement that behavior consistently.  

---

<br/> 

### PART 5:  👩🏻‍💻Final coding challenge  

- [ ] **Student Score Management System**  

*Create a small console application named StudentScoreManager*  

Your program must combine fundamentals, control flow, arrays, and methods.

Requirements
1. Ask the user how many students they want to record.
2. Store each student's name in a String array.
3. Store each student's score in an int array.
4. Use a loop to collect the information.
5. Write methods to calculate the average score, find the highest score, and determine whether a student passed.
6. Display all students, their scores, and their results.
7. Display the class average and the highest score.
8. Validate scores so they are between 0 and 100.  

Use 75 as the passing score.  

Example output:  
``` 
=== Student Score Manager ===

Enter number of students: 3

Enter student name: Ana
Enter score: 90

Enter student name: Ben
Enter score: 70

Enter student name: Carla
Enter score: 85

=== Student Results ===

Ana - 90 - Passed
Ben - 70 - Failed
Carla - 85 - Passed

Class Average: 81.67
Highest Score: 90
```
