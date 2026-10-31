# 📝 Java Core Notes:

### Refresher Day2:
- if statement
- Scanner and new keyword
- System class 
- comparing string
- switch statement
- loops 
- array

---

<br/>

### if statement

- `else-if` - use for multiple condition.
  - the first true condition will execute the block of code and skip other condition.
- `{}` block - code block or scope
- `else` - is not mandatory

### Import 
- under java.lang class (implicit import)
- under java.util class (explicit import)

### Scanner
- Scanner used to read the console line input 
- Scanner Syntax: `Scanner varName = new Scanner(System.in);`
- `new` in the scanner is to create  new object of scanner.
- remember: close the scanner.

### System Class
- Scanner use the system class `(System.in)`
- `in` - standard input stream // refers to keyboard
- `out` - standard output stream // refers to console and monitor
- `err` - standard error stream 
  - `System.err.println("error you want to print")`

### Comparing String
- equals() - Case sensitive `"Aizel".equals()"Aizel"` // true
- equalsIgnoreCase() Not case-sensitive. `"Aizel".equalsIgnoreCase()"aizel"` // false

### Switch Statement
- switch expression must be integral literals, enum, String & wrapper.
- wrapper ex: `Integer` instead of int
- double cannot use in switch.
- selector cases are (case values) ex: `case  1:`
- (value) should be constant or the actual value.
- `break` - the other case will be skipped if the case is true.
- `default` - executed if all cases are false.

### Loop
- `for-loop` (best use cases):
  - if you know how many times it will repeat
  - counter
  - if you need the position or index of an element in an array.
- `enhaced for-loop` (best use cases):
  - process every element in an array or collection
  - you dont need the index
  - you only need to read or use each element.
  - you want cleaner or readable traversal code.
- `while-loop` (best use cases):
  - you dont kow exactly how many iteration
  - it is dependent on the condition event
  - you can use it to validate & input repeatedly
  - reading data until no more data available
  - not execute if condition is false
- `do-while` (best use cases):
  - code must execute at least once
  - you need to display menu before checking whether the user wants to continue.
  - the repetition still depends on condition

### Array:
- start at index 0
- access element: `arrName[index]`
- length  property - number of element inside an array.
- array can process with loop
- accessing index that not exist in an array will result ArrayIndexOutOffBoundException


