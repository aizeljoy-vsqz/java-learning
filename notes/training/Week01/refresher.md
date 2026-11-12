# 📝 Java Core Notes:

### Refresher day1:
- Java keyword
- Integral literals
- main()
- Comments
- Types of variable declaration
- Rules for variable declaration
- Rules for variable naming
- Local variable
- Underscore for readability
- Type casting
- Naming convention
- When to use double
- Unicode vs. ASCII
- Boolean naming
- InstanceOf Operator
- Lazy vs. no lazy
- IPO
- Given resources

---

### Java Keyword
- reserve keywords, cannot use as a method, class and variable name.

### Integral Literals 
*whole numbers:* `byte`, `long`, `short`, `int`

### main()
*entry-point of an execution.*  
*`main()` is being called by **JVM** runtime environment.*

### Comments
- single comment `//`
- multi-line comment with multiple asterisk `/******/`
- multi-line comment `/**/`
- addition: 
  -  `@` annotation, this is not a comment, but can use inside a comment
  - this is a form of metadata (data about data) that provides extra information about a program
  - example: @author authorName, @version versionNumber

### Types of variables declaration
- **local/automatic variable** (owned by a function), when the function ends local variables end (revived when called)
- **instance variable** (owned by the object), one copy of variable in each object or unique to each individual object.
- **class/static variable** (owned by the class itself), one value in all object or shared by all instances of a class 

### Rules for variable naming
- starts with letter, underscore or $, not with numbers  

### Local variable
- `int num;` 0 is not default value of local variable value, unlike instance and class variables.  

### Underscore for readability
- example: `int  num = 123_456;`  

### Type Casting
- implicit (automatic) - widening 
- explicit (manual) - narrowing
```java
class Main{
    static void main() {
        byte num = 50;
        short num1 = 100;
        int num2 = 100_000 + num + num1; // implicit
        int num4 = 100_223_222_000L;
        int num5 = (int) num4; // explicit
    }
}
```
*Notes:*
- concatenation: string + num 
- perform add: num + num;

### Naming Convention
- Class name = use PascalCase (eg. NumberOne)
- Methods & Variable name = use camelCase (eg. numberOne)

### When to use double
- always use double if dealing with money.
- use when working with financial application project  

### Unicode vs ASCII
- ASCII - American Standard Code for Information Interchanges
- Unicode - All human known symbols.

### Boolean naming
- use question - `boolean isOctober30PayDay = true;`
- value should be true or false.

### instanceOf Operator 
- use for introspection
- it tests whether an object belongs to a specific class, subclass, or implements a given interface, returning true or false.

### Every class has Object as parent class
- means every class extends object.

### Shorthand Operator
- `n += 10;` means `n = n + 10;`

### lazy vs. no lazy
- `&&, ||` - lazy, if once true or false then it will stop comparing the other condition.
- `|, &` - no lazy, if once true or false, it will continue check the other condition until it finished all the condition

### IPO
- Input, Process, Output.

---

<br/>

###  GIVEN RESOURCES:
- [CodingBat](https://codingbat.com/java) - practice coding
- [dzone](https://dzone.com/) - documentation
- [Jdoodle](https://www.jdoodle.com/online-java-compiler) - compiler
- [java tpoint](https://www.tpointtech.com/java-tutorial) - documentation

