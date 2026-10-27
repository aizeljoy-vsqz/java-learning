# 👩🏻‍💻Java method and array notes

### Content:
- **Arrays**
- **Methods**

<br/>

### Arrays
**Java Arrays**
- Arrays used to store multiple values in one variable.  
- To declare an array in Java you need to define a variable type with square brackets ``[]``.
    ``` 
    String[] names;
    ```
  
**Access the Elements of an Array**
- Accessing elements in array refers to its index.
- Array indexes starts with 0, it refers to the first element of an array.   
    ``` java
    String[] names = {"Aiz", "Zel"};
    System.out.println(names[0]); // result: Aiz
    ```
  
**Length in an Array**
  - ``length``Used to find out how many elements in an array.
    ``` java
    String[] names = {"Aiz", "Zel"};
    System.out.println(names.length); // result: 2
    ```
    
**Loop through an Array**
- You can loop through an array using ``for`` loop or ``for each`` loop.
- You can use the ``length`` property to specify hor many times the loop.

**Multidimensional Array**
- Multidimensional array is an array that contains another arrays.  
- To create a two-dimensional array, write each row inside its own curly braces.
    ``` java
    int[][] num = {{1,2}, {3,4}};
    // first row: {1,2}
    // second row: {3,4}
    ```
  
**Access the Elements of Dimensional Array**  
- To access the element of 2d array, first you need two indexes: first for row second is for the column.
    ```java
    int[][] num = {{1,2}, {3,4}};
    System.out.println(num[0][1]); // result 1
    ```

<br/>

### Method  
- Method are used to perform a certain actions.
- Method is a block of code, which runs when it is called.
- You can pass a parameter into a method.

**Create a Method**
Method must be declared within a class.
```java
class Main{
    static void methodName(){
        // code to be executed
    }
}
```
``static`` - means the method belongs to the Main class and not an object of the Main class.  
``void`` - means nothing to return.  
``return`` - if you want to return a value used return keyword instead of void.

**Call a Method**  
- To call a method you need to write the method name followed by ``()`` inside the main method.
    ```java
    class Main{
        static void methodName(){
        // CODE
        }
        public static void main(String[] args){
            // call the methodName 
            methodName();
        }
    }
    ```
  
**Parameters and Arguments**
- Parameters is the one you pass into a method, parameters act as a variable inside the method.  
- Arguments is the one you pass when you called the methods.

    ```java
    class Main{
        // name is the parameter
        static void greet(String name){
            System.out.println("Hello " + name);
        } 
  
        public static void main(String[] args){
          greet("Aiz"); // Aiz is the arguments.
        }
    } 
    ```
  
**Method Overloading**
- Method overloading is a multiple method with the same name but different parameters.
- Note: Multiple methods can have the same name as long as the number and/or type of parameters are different.

    ```
    int num(int num1)
    int num(int num1, int num2)
    ```
  
**Recursion**  
- Recursion is a technique where a function call itself.  
- Halting condition is a condition where the method stop calling itself.
- This technique provides a way to break complicated problems down into simpler problems which are easier to solve.
    ```java
    class Main{
        static int totalSum(int num){
            if (num == 0) return 0; // halting condition
            return num + totalSum(num-1);
        } 
        main{
            System.out.println(totalSum(5)); // recursion
        }
    }
    ```
