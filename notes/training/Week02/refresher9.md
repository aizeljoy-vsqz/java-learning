# 📝 Java Core Notes:

### Refresher Day9:
- Exception Handling
---

<br/>

### Exception Handling
#### Hierarchy
- Class Throwable (Parent)
  - Error (Child)
  - Exception (Child)

<br/>

#### throw
- *thrown by the java(you):* you can throw using `throw` statement
- *thrown by JVM:* if you don't JVM will

<br/>

#### Two types of exception
- ***Runtime Exception (Unchecked Exception)***
  - application has the choice to catch
  - application can still compile without catching the exception
  - optional to declare 
- ***Compile Time Exception (Checked Exception)***
  - application won't compile without you declaring  exceptions
  - mandatory to declare and catch

<br/>

#### Error
- serious problems
- application should not try to catch

<br/>

#### How to know if compile time or run time exceptions?
- compile time
  - if the Exception is in the hierarchy
- runtime 
  - if RunTime Exception is in the hierarchy
- All subclasses of runtime are compile time except RunTimeException

<br/>

#### Class Exception
- application might want to catch
- Exception and its subclass are in form of throwable

<br/>

#### How do we handle Exception Handling?
- try-catch exception handling
- try - statement that might crash
- catch - handle exception
- finally
  - necessary code of the program
  - used when closing up resources
  - close database connection
  - runs whether there's an error or not.
```java
try{
    // code
}catch(Exception e){
    // code
}finally{
    // code    
}
```

<br/>

#### throws keyword
- used to declare exceptions
- used as part of method signature (declaration method)
- be very  careful using throws
- you may use this, if you don't want to use try-catch
- what to avoid? 
  - don't throws runtime type, it must catch.

<br/>

#### How to create own exceptions (Custom Exception)
***Steps:***
- put Exception word at the end of class name.
- if compile time, extends Exception (parent)
- declare no argument constructor
  - `super()` - call constructor in parent class using super()
- create interface
  - create your message 
  - call your interface in your super()  

*purpose of creating interface:* - for maintainability

<br/>
<br/>

---
### Additional Notes:
- if you're a developer do not use technical jargon in your users.
- security controls when developing, consider misuse case
- CIA - Confidentiality, Integrity, Accountability
- Make the runtime exception mandatory.