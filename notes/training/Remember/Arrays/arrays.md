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
