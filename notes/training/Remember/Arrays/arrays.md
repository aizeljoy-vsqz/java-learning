# Java Arrays

## 1. Introduction
### | Array |
- a data structure
- store multiple values
- same data type

### | Why do we use Arrays |
- Store multiple values of the same type
- Organize related data
- Access values using their indexes
- Loop through multiple values
- Perform searching and sorting operations

<br>

## 2. Declaring and Initializing
### | Declaring an Array |
- recommended convention
    ```java
    int[] numbers;
    ```

### | Initializing an Array |
- creating the array and giving it its initial values
- size is fixed after creation
    ```java
    int[] numbers = {10, 20, 30, 40, 50};
    
    // automatically determines the size based on the number of values
    ```
    ```java
    // declare first, initialize later (new)
    int[] numbers;
    numbers = new int[]{10, 20, 30, 40, 50};
    ```
    ```java
    // initialize using the new keyword with a size
    int[] numbers = new int[5];
    ```

<br>

## 3. Accessing and Modifying Elements
### | Accessing Array Elements |
- retrieving or reading
- use index inside square brackets []
- indexes start at 0
- `.length` tells you how many elements the array contains
    ```java
    int[] numbers = {10, 20, 30, 40, 50};
    
    System.out.println(numbers[0]); // 10
    System.out.println(numbers[1]); // 20
    System.out.println(numbers[2]); // 30
    ```

### | Modifying Array Elements |
- changing the value stored at a particular index
- modify an element using the assignment operator `=`

    ```java
    int[] numbers = {10, 20, 30, 40, 50};
    
    numbers[0] = 100;
    numbers[2] = 300;
    ```

### | Accessing an Invalid Index |
- it will throw an exception: `ArrayIndexOutOfBoundsException`


<br>

## 4. Looping Through Arrays
- a loop allows you to execute the same block of code repeatedly
- making it easier to process every element in an array

### | Traditional for Loop |
- access array elements using their indexes
- use `.length` instead of manually writing length
    ```java
    int[] numbers = {10, 20, 30, 40, 50};
    
    for (int i = 0; i < numbers.length; i++) {
        System.out.println(numbers[i]);
    }
    ```

### | Enhanced for Loop (For-Each) |
- do not need to manage indexes manually
- can't modify elements

    ```java
    int[] numbers = {10, 20, 30, 40, 50};
    
    // number – temporary variable that receives each element
    // numbers – the array being traversed
    for (int number : numbers) {
        System.out.println(number);
    }
    ```

<br>

## 5. Array Properties and Utility Methods in Java
- Java provides a utility class called `Arrays`
- which contains methods that make working with arrays easier
- **Array properties** – information about an array
- **Array utility methods** - predefined operations, used on arrays


### | Array Property: `length` |
- returns the number of elements
- `length` is a property, not a method

    ```java
    int[] numbers = {10, 20, 30, 40, 50};
    
    System.out.println(numbers.length); // 5
    ```

### | Arrays Utility Class |
- Java provides the `java.util.Arrays` class
- to use:  `import java.util.Arrays;`

    #### Arrays.toString()
    - converts an array into a readable String representation
    - display all array elements quickly, especially when debugging

    ```java
    import java.util.Arrays;
    
    int[] numbers = {10, 20, 30};
    
    System.out.println(Arrays.toString(numbers)); // [10, 20, 30]
    ```

  #### Arrays.sort()
    - sorts array elements in ascending order
    - ***important:*** it modifies the original array

    ```java
    import java.util.Arrays;

    int[] numbers = {50, 20, 40, 10, 30};
    
    Arrays.sort(numbers); // [10, 20, 30, 40, 50]
    ```















