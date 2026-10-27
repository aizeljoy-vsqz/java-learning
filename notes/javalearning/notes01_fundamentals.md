# 👩🏻‍💻Java javalearning.fundamentals notes

### Fundamentals content:
- **Main method**
- **Statements**
- **Java comments**
- **Variables**
- **Data types**
- **Type casting**
- **Java operators**
- **Strings methods**
- **Math methods**

<br/>

### main method

``main()`` it is where the program starts running.

```java 
public static void main(String[] args){}
```

<br/>

### Statements
programming instructions are what we called statements.

```java
public class Main{
    public static void main(String[] args) {
        System.out.println("Let's learn java."); // statement
    }
}
```
// Note: Remember to end a statement with semicolon``;``

<br/>

### Java comments

```java
// Single line comment

/*
 * Multi-line comment.
 */
```

<br/>

### Variables
Variables are container for storing data values.  
**Variable Types:** ``String``, ``int``, ``float``, ``boolean``, ``char``  

```java
class Main{
    public static void main(String[] args) {
        String name; // name: is the variable, String: is the variable type. 
    }
}
```

#### Identifiers
Java **variables** must be identified with **unique names**.
**unique names** are called **identifiers**.

<br/>

### Data Types
Data types are divided into two groups:  

**Primitive data types**:  
``byte``, ``short``, ``long``, ``int``, ``double``, ``float``, ``booolean``, ``char``  

**Non-primitive data types**:  
``String``, ``Arrays``, ``Classes``  

// Note: non-primitive data type are called **reference types** because they refer to objects.  

<br/>

### Java Type Casting

#### 2 main types of casting:  

**widening casting (automatic)** - converting smaller to larger type.  
``byte`` - ``short`` - ``char`` - ``int`` - ``long`` - ``float`` - ``double`` 

```java
class Main{
    public static void main(String[] args) {
        int intNum = 2;
        double toDouble = intNum; // casting the intNum to double.
    }
}
```

**narrowing casting  (manual)** - converting larger too smaller type.
``double`` - ``float`` - ``long`` - ``int`` - ``char`` - ``short`` - ``byte``

```java
class Main{
    public static void main(String[] args) {
        double doubleNum = 2.5;
        // required to enclose type in parentheses
        int toInt = (int) doubleNum; // casting the doubleNum to int.
    }
}
```

<br/>

### Java Operators
#### Arithmetic Operators  
Used to perform mathematical operations. ``*``, ``/``,``%``, ``+``, ``-``  

#### Comparison Operators
Used to compare two values or variables. ``>``, ``<``,``>=``,``<=``,``==``,``!=``  

#### Logical Operators
Used to test if values are true or false. ``&&``, ``||``, ``!``

#### Assignment Operators
Used to assign values to variables. ``=``

**Addition Assigment** - used to assign value to variables. ``+=``

#### Precedence
Orders of operations. ``()``, ``*``, ``/``, ``%``,``+``,``-``,``>``,``<``,``>=``,``<=``,``==``,``!=``,``&&``,``||``,``!``,``=``

<br/>

### Strings
String is a collection of characters surrounded by double quotes. ``""``

#### String methods
``lenth()`` method that returns the length of strings.  
``trim()`` method that removes the white space from the beginning and the end of strings.  
``toUpperCase()`` method that converts string to upper case.  
``toLowerCase()`` method that converts string to lower case.  
``indexOf()`` method that returns the index of the first occurrence of specified text.   
``charAt()`` methods that returns the specific character at specific position in a string.  
``equals()`` methods that compares twos string.

<br/>

### Math methods
Math methods performs mathematical task on numbers.  

``Math.min(x, y)`` method that finds the lowest value of x and y.  
``Math.max(x,y)`` method that finds the largest value of x and y.  
``Math.sqrt(x)`` method that returns the square root of x.  
``Math.abs(x,y)`` method that returns the positive value.  
``Math.round(x)`` method that returns the round of value of x.  
``Math.pow(x,y)`` method that returns the x to the power of y.  
``Math.random()`` method that returns random number.  
``Math.ceil(x)`` method that return the round up value of x.  
``Math.floor(x)`` method that returns the round down value of x.








