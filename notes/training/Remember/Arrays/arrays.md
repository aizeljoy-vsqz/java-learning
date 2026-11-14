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


