# Java 11:
### content
- While loop
- Do-while loop
- For loop
- Arrays
- For-each loop

### Loops
- repeatedly execute a statement as long as the provide condition is true.
- while loop: basic looping
- Do-while loop: looping with deferred condition check.
- For loop: looping with simplified notation for common use case.

#### While loop
- condition checked at loop start
- loop body may never run if the condition is already false.
    ``` 
    while(consition){
        statements;
    }
    ```
  
#### Do-while loop
- condition checked at loop end.
- loop body always runs at least once.
    ``` 
        do {
            statements;
        } while (condition);
    ```

#### For loop
- condition checked at loop start
- loop body may never run if condition is already false.
- simplified notation for loop control values.
    ``` 
    for (initialize; condition; update{
        statements;
    }
    ```
  
<br/>

### Arrays
- provides an ordered collection of elements.
- each element accessed via index.
- index range from 0 to number of elements minus 1.
- *explicitly* sizing and initializing the array:
    ``` 
    float floatNumber = new float[3];
    floatNumber[0] = 1.0f;
    floatNumber[1] = 2.0f;
    floatNumber[2] = 3.0f;
    ```
- shorthand array
    ``` 
    float floatNumber[] = {1.0f, 2.0f, 3.0f}; 
    ```

<br/>

### For-each loop
- executes a statement once for each array member.
- handles getting collection length.
- handles accessing each value.
    ``` 
    for (loop-variable:  array){
    statements;
    } 
    ```