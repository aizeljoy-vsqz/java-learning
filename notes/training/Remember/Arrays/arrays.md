# Java Arrays

1. [Introduction](#1-introduction)
2. [Declaring and Initializing Arrays](#2-declaring-and-initializing)
3. [Accessing and Modifying Array Elements](#3-accessing-and-modifying-elements)
4. [Looping Through Arrays](#4-looping-through-arrays)
5. [Array Properties and Utility Methods](#5-array-properties-and-utility-methods)
6. [Searching Arrays](#6-searching-arrays)

<br>

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

## [⬆](#java-arrays) [⬇](#end)
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

## [⬆](#java-arrays) [⬇](#end)

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

## [⬆](#java-arrays) [⬇](#end)

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

## [⬆](#java-arrays) [⬇](#end)

## 5. Array Properties and Utility Methods
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
    
    - To sort in descending order
    - for primitive integer arrays,
    - sort ascending and then reverse the elements manually

    ```java
    Arrays.sort(numbers);

    for (int i = 0; i < numbers.length / 2; i++) {
  
        int temp = numbers[i];
        numbers[i] = numbers[numbers.length - 1 - i];
        numbers[numbers.length - 1 - i] = temp;
  
    }
    ```

    #### Arrays.copyOf()
    - Creates a copy of an existing array with a specified length
    - ***important:*** the original remains unchanged
    - ***important:*** the copied array is a separate array
    
    ```java
    import java.util.Arrays;
    
    int[] original = {10, 20, 30};
    
    int[] copied = Arrays.copyOf(original, 3); // [10, 20, 30]
  
    // specify a different length
    int[] copied = Arrays.copyOf(original, 5); // [10, 20, 30, 0, 0]
    ```

    #### Arrays.equals()
    - checks whether two arrays contain the **same elements** in the **same order**
    - ***important:*** do not use `==` to compare the contents of two arrays
    ```java
    import java.util.Arrays;
    
    int[] first = {10, 20, 30};
    int[] second = {10, 20, 30};
    
    System.out.println(Arrays.equals(first, second)); // true
    ```

<br>

## [⬆](#java-arrays) [⬇](#end)

## 6. Searching Arrays
- 2 important searching techniques
  - ***Linear Search*** – checks elements one by one
  - ***Binary Search*** – repeatedly divides a sorted array into smaller sections

### | Linear Search |
- ***O(n)*** - 100 elements, algorithm might need to check all 100 elements
- checks each element, from first element, 
- until it finds the target value
- or reaches the end

    ```java
    // use an integer variable initialized to -1 
    // to store the result index
    int foundIndex = -1;
    
    for (int i = 0; i < numbers.length; i++) {
        if (numbers[i] == target) {
            foundIndex = i;
            break;
        }
    }
    
    System.out.println(foundIndex);
    // if element not found, result remains -1
    ```

### | Binary Search |
- ***O(log n)*** - 100 elements, at most about 7 comparisons to narrow down the search
- repeatedly divides the search area in half
- significantly faster for large, sorted arrays
- ***important requirement:*** the array must be sorted
- Java provides a built-in method through `Arrays` utility class
- returns its index if found
- ***important:*** if element isn't found, it returns a negative value

    ```java
    int[] numbers = {10, 20, 30, 40, 50, 60, 70};
    
    int target = 60;
    
    int result = Arrays.binarySearch(numbers, target); // 5
    ```

## [⬆](#java-arrays)
#### End



