# Java 11:

### Overview:
- String class
- String equality
- String methods
- String conversion
- String Builder

<br/>

### String Class
#### Stores a sequence of Unicode characters.
- literals are enclosed in double quotes `""`
- values can be concatenated using `+` and `+=`
```java
class Main{
     public static void main(String[] args) {
        String name = "Aizel";
        String greeting = "Hello " + name;
        greeting += ", nice to meet you!";

        System.out.println(greeting);
    }
}
```

#### Strings are Immutable
Strings variables do not directly hold the string value.
- hold a reference to the instance of string.
- changes in the value create a new instance of the string.

```java
class Main{
    public static void main() {
        String message = "I"; // message: I
        message += " Love; // message update to: I Love
        message += " Java"; // message update to: I Love Java       
    }
}
```

<br/>

### String Equality
#### Comparing strings with the equality operator `==`
- checks to see if both string variables reference the same string instance

#### Comparing strings with the equals method
- performs a character by character comparison.

#### Checking string equality
- the equals method is the best choice in most cases.

#### Interning a string
- provides a canonicalized value.
- enables reliable `==` operator comparison.
- improved performance of frequently compared strings.
```java
class Main{
    public static void main() {
        String name = "Aizel";
        String name1 = "Aizel";

        name = name.intern();
        name1 = name.intern();

        if(name == name1){
            System.out.println("same name");
        } 
    }
}
```
*notes:*
- *when you intern a string you'll get a reference to the same string instance, that's you why you can use the `==` operator*
- *`equals()` is better choice*
<br/>

### String Methods
#### String Class Methods
| Operation                          | Methods                                                                     |
|------------------------------------|-----------------------------------------------------------------------------|
|Length                              | `length`                                                                    |
| create new string(s) from existing | `concat`, `replace`, `toLoweerCase`, `toUpperCase`, `trim`, `split`         |
| extract substring                  | `chartAt`, `substring`                                                      |
| test substring                     | `contains`, `endsWith`, `startWith`, `indexOf`, `lastInndexOf`              |
| comparison                         | `equals`, `equalsIgnoreCase`, `isEmpty`, `compareTo`, `compareToIgnoreCase` |

<br/>

### String Conversion
#### Converting Non-String Types to String
- virtually all data types can be converted into a String.
  - can use `String.valueOf()`
  ```java
  int number = 100;
  String numberString = String.valueOf(number); // "100"
  ```
- conversion often happens implicitly
  ```java
  int numberOne = 5;
  int  numberTwo = 10;
  
  String output = numberOne + " + " + numberTwo + " = " + (numberOne+numberTwo);
  // result: "5 + 10 = 15"
  ```
  
<br/>

### String Builder
#### Provides mutable string buffer
- efficiently construct string values piece by piece.
- add new content to end with `append`.
- add new content to start with `insert`

#### extract content to a string
- use `toString` method

```java
class Main{
  public static void main() {
    StringBuilder newString = new StringBuilder(40);

    newString.append("Aizel, ");
    newString.append("How are you?");
    newString.insert(0, "Hi ");
    newString.insert(8, " and Maria");
    String result = newString.toString(); // Hi Aizel and Maria, How are you?

    System.out.println(result);
  }
}
```

*notes*
- *string builder itself is not a string.*
  
