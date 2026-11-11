# 📝 Java Core Notes:

### Refresher Day6:
- Abstraction
- Interface
- Runtime Polymorphism
---

<br/>

### Abstraction
- hiding implementation details in the method side.
- showing only the functionality to the user.
- focus on what an object does rather than how it does it.

#### Two ways to achieve abstraction
- Abstract Class - provides 0% - 100% abstraction.
- Interface - provides 100% abstraction.

#### How to do abstraction in java
- put `abstract` keyword in a class.
- you can put a constructor in  abstract class.

#### Abstract class
- abstract method - method without body.
- non-abstract method - method with body, fully implemented.
- abstract class are top-level classes.
  - gives commonality on child classes.
  - designed to be *parent classes*.
  - gives rules, regulations, policies.
  - child classes must implement the abstract method.

#### Allowed modifiers in abstract method and classes
- `public` & `protected`
- abstract methods cannot be private, static, final, or synchronized

***Notes:***
- the moment you make your method as abstract, you need make class abstract.
- abstract class cannot be instantiated (make object), but they can be subclassed

#### Classic Constructor Call Chain or Constructor of abstract Class
- use to access private properties in parents.
- it prioritizes the constructor of parent before its children.

#### Computation for abstract class
- total% of abstract = abstract method / total number of method * 100

#### Why do we use abstract class?
- code reusability
- enforce method implementation
- defining common interface.

---

<br/>

### Interface
- contains static constants and abstract method.
- cannot be instantiated, similar to abstract class, but it's not a class.
- represents an IS-A relationship
- allows multiple inheritance
- implicit, a method declared interface is a public abstract
- a variable in an interface is a public static final

#### Why Interface?
- to achieve abstraction
- to support multiple inheritance
- to achieve loose coupling

#### How to do interface in java
- use `interface` keyword
```java
interface <interface_name> {  
    public static final VARIABLE_NAME;
    public abstract void method();
}
```
- Variable Name Convention in interface
    - uppercase
    - separated with underscore
    - variable in interface are public static final(cannot be change.)

***Notes:***
- All methods are implicitly declared as public and abstract, even if these keywords are not explicitly written
- all fields declared in an interface are implicitly public, static, and final.
- not only class inherit from another class, interface can also inherit from another interface.
- Always choose interface before abstract()
  - for future extension.

---

<br/>

### Polymorphism
#### Runtime Polymorphism
- Also known as Dynamic Method Dispatch.
- call to an overridden method is resolved at runtime rather than compile-time
- an overridden method is invoked using *superclass reference variable* that refers to a *subclass object*
- True power of polymorphism:
  - interface (Parent) can change from one child to another child class.

---

<br/>

### Additional
- `""" """` - formatted string, display message as it is.
