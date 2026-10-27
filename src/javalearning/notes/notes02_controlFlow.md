# 👩🏻‍💻Java control flow notes

### Logic & control flow content:
- **if statement**
- **else if statement**
- **else statement**
- **shorthand if statement**
- **Switch**
- **While Loop**
- **Do While Loop**
- **For Loop**
- **For Each Loop**

<br/>

### if statement

``if`` statement specify a block of code to be executed, if condition is true.

// Note: the condition must  result in boolean value. 

**Syntax:**
```
if (conditon) {
    // block of code to be executed if condition is true.
}
```

<br/>

### if else statement

``else`` statement specify a block of code to be executed, if the same condition in if statement is false.  

**Syntax:**
```
if (condition) {
    // block of code to be executed if condition is true
} else {
    // block of code to be executed if condition is false.
}
```

<br/>

### else if statement
``else if`` statement specify a new condition to be executed, if ``if`` statement is false.

**Syntax:**
```
if (condition) {
    // block of code to be executed if condition is true
} else if (new condition){
    // block of code to be executed if the first condition is false.
} else {
    // block of code to be executed if the both condition is false.
}
```

<br/>

### Shorthand if statement
shorthand if statement is known as the **ternary operator**.

**Syntax:**
```
variableName = (condition) ? expressionTrue : expressionFalse;
```

<br/>

### Switch statement
``switch`` statement selects one of many code blocks to be executed.  
``break`` statement stops the execution of all the rest block of code, if matching case found.  
``continue`` statement skips the execution of the case that match, and continues with the next iteration in the loop.  
``default`` statement execute the default blocks  of code, if no matching case found.

// Note:  
break = stop the loop completely.  
continue = skip this round, but keep looping.  

**Syntax:**
```
switch(expression){
    case 1:
        // code block
        break;
    case 2: 
        // code block
        break;
    default:
        // code block
}
```

<br/>

### While loop
``while`` loop executes the block of code inside the loop if condition is true.

**Syntax:**
``` 
while (condition){
    // code block to be excuted.
}
```

<br/>

### Do While loop
``do/while`` loop always execute the block of code once, before checking if the condition is true.  

Then it will repeat the loops while the condition is true. 

// Note: it's required to put semicolon``;`` after the while condition.

**Syntax:**
```
do {
    // code to be executed
} while (condition);
```

<br/>

### for loop
``for`` loop executes the block of code inside the loop while the condition is true.  

// Note: for loop is recommended when you know exactly how many times you want to loop through a block of code.

**Syntax:**
``` 
for (statement 1; statement 2; statement 3) {
    // code block to be executed
}

// statement 1 - executed (one time) before the execution of code block.
// statement 2 - defines the condition
// statement 3 - executed (every time) after the code block has been executed.
```

<br/>

### For Each Loop
``for each`` loop used exclusively to loop through elements in an array or other data structures.  

**Syntax:**
``` 
for (type variableName : arrayName) {
  // code block to be executed
}
```



