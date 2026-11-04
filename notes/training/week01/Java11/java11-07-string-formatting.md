# Java 11
### Overview:
- The advantage of format specifiers
- How to use a format specifiers
- Width and Precision
- Controlling value appearance with flags
- argument index

<br/>

### String Formatting
- formatting string simplifies the process of building strings
- it gives you a lot of control over the appearance of the value you place.
#### Format specifiers
- focus on describing desired result
- can control many aspects of appearance 

#### Supported by a variety of methods
- String.format
- System.out.printf
- Formatter.format

<br/>

### Concatenation Vs. Formatting
```java
// Concatenation
String name1 = "Aiz", name2 = "Zel", name3 = "Joy";
String usingConcatenation = "hello " + name1 + ", " + name2 + ", " + name3 + "welcome to java course.";

// Formatting 
// %s is format specifiers
String usingFormatting = String.format(
        "Hello, %s, %s, and %s welcome to java course.",
        name1, name2, name3
);
```

<br/>

### Parts of Format Specifiers
- `%[argument index][flags][width][precision] conversion`
- precision - decimal places to display
- width - minimum character to display
- flags - customize the appearance of value
- argument index - control over which format specifiers match up with data values

####  Common Format Conversion
|         | Meaning              | Type           | Example Value | Result      |
|---------|----------------------|----------------|---------------|-------------|
| d       | Decimal              | Integral       | 32            | 32          |
| x or X  | Hex                  | Integral       | 32            | 20          |
| f       | Decimal              | floating point | 123.0         |123.000000   |
| e or E  | Scienntific Notation | floating point | 123.0         |1.230000e+02 |
| s       | String               | general        | "Hello"       | Hello       |


<br/>

### Format Flags

#### Displaying Radix
- `#` - include radix

  ```java
  int value = 123;
  String.format("%#x", value); // 0x7b
  String.format("%#X", value); // 0X7b
  ```

#### Width and Padding

- `0` - zero padding

  ```java
  int value = 123
  String.format("num: %4d", value); // num:     123
  String.format("num: %04d", value); // num:0000123
  ```

#### Grouping Values

- `-` - left justify 

  ```java
  String.format("num: %-4d", value) value = 123 // num:123
  ```

- `,` - include grouping separators
  
  ```java
  String.format("%,d", value); // 123,456
  String.format("%,.2f", value); // 123,456.00
  ```

- `space` - leading space when positive number
  
  ```java
  String.fromat("%   d", value); //     123
  ```

#### Controlling value appearance with flags
- `+` - always show sign 

  ```java
  String.format("%+d", value); // +123
  String.fromat("%+d", value); // -123
  ```

- `(` - enclose negative values in parentheses
  
  ```java
  String.fromat("%(d", value); // (123)
  ```

#### Argument Index
- Not Specified - correspond sequentially to argument
  ```java
  int valA = 100, valB = 200, valC = 300
  String.format("%d %d %d", valA, valB, valC); // 100 200 300
  ```
- index`$` - index of argument to use (1-based)
  ```java
  int valA = 100, valB = 200, valC = 300
  String.format("%$3d %$1d %$2d", valA, valB, valC); // 300 100 200
  ```
- `<` - corresponds to same argument as previous specifier
  ```java
  int valA = 100, valB = 200, valC = 300
  String.format("%$2d %$1d %<d", valA, valB, valC); // 200 200 100
  ```