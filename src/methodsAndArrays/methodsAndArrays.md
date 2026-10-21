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

### Multidimensional Array
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


  
