# Java 11:
 ### content:
- Relational Operator
- Conditional Assignment
- if-else & Chaining if-else
- Logical Operator
- Block Statement
- Switch

<br/>

 ### Conditional Logic
- perform a test (comparison).
- perform action based on the result.

<br/>

### Relational Operator
- `>` greater than
- `>=` greater than equal
- `<` less than
- `<=` less than equal
- `==` equal to
- `!=` not equal to

<br/>

### Conditional Assignment
- return a value based on the result of condition.
  - `result = conditon ? true-value : false-value;`

<br/>

### if-statement
- `if` statement conditionally executes a statement.
    ```
    if (condition){
        true-statement;
    }
    ```
- `else` clause executes a statement when condition is false.
  - else is optional
  ```
  if (condition)
    true-statement;
  else
    false-statement;
  ```
- chaining `if-else` 
  - evaluated in order top-to-bottom
  - first to test true is executed
  ```
  if (condition-1)
    true-statement;
  else if (condition-2)
    true-statement;
  else 
    fase-statement;
  ```
  
<br/>

### Logical Operator
#### standard logical operator
- produce a single true or false result from two true o false values.
- may combine two relational test.
- may combine two `Boolean` variable.

    |                    | Operator | What resolves to true                      |
    |--------------------|----------|--------------------------------------------|
    | And                | &        | true & true                                |
    | Or                 | \|       | false \| true, true \| false, true \| true |
    | Exclusve or  (XOR) | ^        | false ^ true, true ^ false                 |
    | Negation           | !        | false                                      |


#### Conditional Logical Operator
- similar to standard logical operator.
- right side executes only when needed.
  - `&&` executes right only when left is true
  - `||` execute right only when left is true.i

<br/>

### Block Statement
- groups statement together
- create compound statement
- enclose statements in opening & closing `{}` brackets.
    ```
    {
    statement;
    ... 
    statement;
    }
    ```

<br/>

### Switch Statement
#### switch
- test value against multiple matches.
- transfer control based on match
    ``` 
    switch(value-to-test){
        case matching-value1:
            statements;
            break;
        .
        .
        case matching-value-n:
            statements;
            break
        default: 
            statements;
    }
    ```
  
#### Using switch
- primitive types supported: `byte`, `short`, `int`, `long`, `char`
- a match can have multiple statements
- end each match with break to avoid *fall through* to next match.