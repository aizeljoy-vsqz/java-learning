# Java 11: 

### Content:
- Variables
- Data Types
- Math Operators

<br/>

### Variable
- named data storage
- strongly typed.
- use camel case for naming variable.

#### Variable Naming Convention:
- use only letters and numbers.
- first character cannot be a number.

#### variables can be declared final
- use `final` modifier.
- the value cannot be changed.
- helps avoid errors caused by inadvertent variable changes.

<br/>

### Data Types
#### Primitive Data Types
- built into the language.
- foundation of all other types.

#### Four Categories of Primitive Data Types
- **integer type** 
    
    | Type  | Bits | Min Value                  | Max Value                 | Literal Form |
    |------ |------|----------------------------|---------------------------|--------------|
    | byte  | 8    | -128                       | 127                       | 0            |
    | short | 16   | -32_768                    | 32_767                    | 0            |
    | int   | 32   | -2_147_483_648             | 2_147_483_647             | 0            |
    | long  | 64   | -9_223_372_036_854_775_808 | 9_223_372_036_854_775_807 | 0L           |
    
    ```
    byte numberOfVowelLetter = 5;
    short schoolAllowance = 10_000;
    int savings = 500_000_000;
    long debt = 1_000_000_000_000_000;
    ``` 
- **floating point** - store values containing a fractional portion (decimal value).
  
    | Type   | Bits | Min Value           | Max Value          | Literal Form |
    |------  |------|---------------------|--------------------|--------------|
    | float  | 32   | $1.4 x 10^{-45}$    | $3.4 x 10^{38}$    | 0.0f         |
    | double | 64   | $4.9 x 10^{-324}$   | $1.7 x 10^{308}$   | 0.0 or 0.0d  |
  ```
  float javaGrades = 88.95f;
  double htmlGrades = 90.56d;
  double oopGrades = 87.90;
  ```
- **character**
  - store a single Unicode character.
  - literal values placed between single quotes
  - for Unicode code points, use \u followed by 4-digits hex value.
  ```
  char regularU = 'U';
  char accentedU = '\u00DA' // Ú
  ```
- **boolean**
  - stores true/false values
  - literal values are true and false
  ```
  char isLearningJava = true;
  ```

#### Primitive Types are Stored by Value
- Independence: Once the assignment (=) is done, the two variables lose all connection. They do not look at each other.
  - each variable get its own independent copy of each value.
- No Link: Changing variable A will never accidentally change variable B.
  - each variable's values are unrelated to any other variable's values.

  ```
    int firstValue = 100; // firstValue is 100
    int otherValue = firstValue; // otherValue gets a COPY of 100. They are now independent.
    
    frst value = 50 // firstValue changes to 50.
                    // otherValue is completely unaffected and remains 100.
  ```
<br/>

### Math  Operators

#### Basic Operator
- `+`, `-`, `*`, `/`, `%`

#### Prefix and Postfix Operators
- `++` increment value by 1.
- `--` decrement value by 1.
- Order:
  - *prefix* applies operation before returning value.
  - *postfix* applies operation after returning the value. 

#### Compound Assignment Operators
- combine an operators & assignment.
- store results in variable on left side.
- `+=`, `-=`, `*=`, `/=`, `%=`

#### Operator Precedence
- postfix: `++x`, `--x`
- prefix: `x++`, `x--`
- multiplicative: `*`, `/`, `%`
- additive: `+`, `-`
- operators of equal precedence evaluated left to right.
- `()` can override precedence with parenthesis.
- Nested parenthesis evaluated from inside out.