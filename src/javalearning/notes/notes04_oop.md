# 👩🏻‍💻Object oriented programming notes

### OOP content:
- **Classes and Objects**
- **Constructor and this**
- **Modifiers**
- **Encapsulation**
- **Inheritance**
- **Polymorphism**
- **Super keyword**
- **Abstract and Interfaces**

<br/>

### OOP  
- OOP stands for Object-Oriented Programming
- javalearning.code.code04_oop is about creating an objects that contains attributes & methods.  
- javalearning.code.code04_oop is ideal for building scalable, reusable and maintainable code.

<br/>

### Class
- **Class** - is a blueprint or template of an object.   
    ```java
    class Book{
        String title = "OOP";
        String content1 = "Class and Objects";
  
        public void learnOop(){
            System.out.println("Object Oriented Programming");
        }
    }
    
    ```
- **Class Attributes** - is a variable declared inside a class.
    ```java
    class Book{
        String title = "OOP";
        String content1 = "Class and Objects";
    }
    ```

- **Class Methods** - is a method within a class that perform a certain actions.  
    ```java
    class Book{
        public void learnObject(){
            System.out.println("Object is an instance of a class.");
        }
    }
    ```

<br/>

### Objects
- **Object**  - is an instance of a class.
  - *Notes: Multiple objects can be created from a single class.*

- **Creating Object** - use `new` keyword to create an object.  
    ```java
    class Book {
        String title = "Object";
        public void learnOOP(){
            // block of code.
        }
        
        public static void main(String[] args) {
            // Creating an object
            Book b = new Book();
        }
    }
    ```

<br/>

### Accessing Attributes and Methods
  - The `.` is used to access the object's methods and attributes.  
  - To call method, write the methodName followed by parenthesis `()` and semicolon `;`
    ```java
    class Book{
        String title = "Object";
        public void learnObject(){
            System.out.println("Object is an instance of a class.");
        }
    
        public static void main(String[] args) {
            Book b = new Book();
            
            // Accessing the attributes and methods
            b.title();
            b.learnObject();
        }
    }
    ``` 

<br/>

### Constructor
  - Constructor used to initialize an object.
  - Constructor is called when an object of a class is created.
  - It can be used to set initial values for an object attributes.

      ```java
        class Book{
            String bookTitle; // class attributes
            // Create Book Constructor
            public Book(){
                // set values for the class attributes
                bookTitle = "Constructor"; 
            }
        
            
            public static void main(String[] args) {
                Book b = new Book(); // Create an object, this will call the constructor
                System.out.println(b.bookTitle); // print the value of bookTitle
            }
        }
      ```
*Notes:*
- constructor name must have the same name with class name.
- All classes have constructor by default. *If you don't create a class constructor yourself, java creates one for you.* However, you are not able to set initial values for object attributes.

<br/>

### This keyword
- `this` often used to avoid confusion when class attributes have the same name as method or constructor.  
- you can also use `this` to call another constructor.
  - this is useful when you want to provide default values or reuse initialization code instead of repeating it.
- *Notes:* `this()` must be the first statement inside a constructor.
    ```java
    class Book{
        String title;
        String content;
        
        public Book(String content){
            // call the two parameter constructor to reuse code and set default title.
            this('Constructor', content);
        }
        
        public Book(String title, String content){
            //  use this to assign values to the class variables.
            this.title = title;
            this.content = content;
        }
    
    
        public static void main(String[] args) {
            // Create book with default title and pass content.
            Book b1 = new Book("this keyword");
            
            // Create book and pass 2 arguments.
            Book b2 = new Book("Oop", "constructor");
        }
    }
    ```

<br/>

### Modifiers  
- 2 types of modifiers
  - **Access Modifiers** - Control  the access level.
  - **Non-Access Modifiers** - Do not control access level, but provides functionality.
  
- **Access Modifiers**
  - For **Classes** access modifiers
    
    | Modifier | Description                                                                                                  |
    |----------|--------------------------------------------------------------------------------------------------------------|
    | `public` | The class is accessible by any other class                                                                   |
    | default  | The class is only accessible by classes in the same package. this is used when you  don't secify a modifier. |

  - For **Attributes**, **Methods**, and **Constructor**
  
    | Modifier    | Description                                                                                      |
    |-------------|--------------------------------------------------------------------------------------------------|
    | `public`    | The code is accessible for all classes.                                                          |
    | `private`   | The code is only accessible within the declared class.                                           |
    | default     | The code is only accessible in the same package. This is used when you don't specify a modifier. |
    | `protected` | 	The code is accessible in the same package and subclasses.                                       |

- **Non-Access Modifiers**  
*The most commonly used non-access modifiers are `final`, `static`, and `abstract`.*
  - **Final** - if you don't want the ability to override the value.
  - **static** - a method belongs to a class, not to any specific object. 
    - This means you can call it without creating an object of the class.
    - It cannot use variables or method that belongs to an object.

<br/>

### Encapsulation
*To make sure that sensitive data is hidden from users.* To achieve this, you must:
  - declare class variable/attributes as `private`.
  - provide public **get** and **set** methods to access and update the private value of a `private` variable.
  - *get* returns the value of the variable
  - *set* takes the parameter and assign it to the variable
    ```java
    public class Person{
    private String name; // private = restricted access
    
    // getter
    public String getName(){
        return name;
    }
    // setter
    public String setName(String name){
        this.name = name;
    }
    }
    ```

<br/>

### Inheritance  

- **subclass (child)** - the class that inherits from another class.
- **superclass (parent)** - a class being inherited from.

*Notes:* 
- to inherit from a class, use the `extends` keyword.
- inheritance is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.  

    ```java
    class Books{
        // title attribute
        protected String title = "Java Fundamentals";
        
        // nextPage method
        public void nextPage(){
            System.out.println("Turn to next page...");
        }
    }
    
    
    class BookContext extends Books{
        String context = "Java Variables";
    }
    
    
    public static void main(String[] args) {
        // Create an object:
        BookContext variableContext = new BookContext();
        
        // Accessing the BookContext Attribute
        variableContext.context; // output: Java Variables
        
        // Accessing the Books attributes & method
        variableContext.title // output: Java Fundamentals
        variableContext.nextPage(); // output: Turn to next page...
    }
    ```

*Notes:* 
- `protected` modifiers used, so the attributes accessible in the subclasses
- if you don't want other class to inherit from a class, use the `final` keyword.

<br/>

### Polymorphism
*Polymorphism means many forms.*  
- **Inheritance** lets us inherit attributes and methods from another class. **Polymorphism** uses those methods to perform different tasks. This allows us to perform a single action in different ways.  
- It is useful for code reusability: reuse attributes and methods of an existing class when you create a new class.

    ```java
    class Animal {
        public void makeSound() {
            System.out.println("The animal make sound");
        }
    }
    
    class Monkey extends Animal {
        public void makeSound() {
            System.out.println("hoo hoo ha ha");
        }
    }
    
    class Cat extends Animal {
        public void makeSound() {
            System.out.println("meow meow");
        }
    }
    
    
    public static void main(String[] args) {
        
        // We can create different animal that call makeSound() method 
        // with their own implementation of an animal sound.
        Monkey monkey = new Monkey();
        monkey.makeSound(); // hoo hoo ha ha
        
        Cat cat = new Cat();
        cat.makeSound(); // meow meow
    }
    
    ```

<br/>

### Super Keyword
- `super` keyword is used to refer the parent class of a subclass.
- the most common use of `super` is to eliminate the confusion between superclass and subclass that have methods with the same name.
- it can be use in two main ways:
  - To access attributes and methods from the parent class.
  - To call parent class constructor.
- **Access Parent Methods**  
    ```java
    class Animal {
        public void makeSound() {
            System.out.println("animal make sound");
        }
    }
    
    class Monkey{
        public void makeSound(){
            super.makeSound(); // call the parent method
            System.out.println("Monkey sound: hoo hoo ha ha");
        }
    }
    ```
*Note:* Use `super` when you want to call a method from the parent class that has been overridden in the child class.
- **Access Parent Attribute**
  - You can also use `super` to access an attribute from the parent class if they have an attribute with the same name:
  ```java
  class Animal{
  String type = "Animal";
  }
  
  class Monkey extends Animal{
  String type = "Monkey";
  public printType(){
    System.out.println(super.type); // access parent attribute
  }
  }
  ```
- **Call parent constructor**
  - Use `super()` to call the constructor of the parent class.
  ```java
  class Animal {
    Animal (){
        System.out.println("Animal is created");
    }
  }
  
  class Monkey extends Animal {
    Monkey(){
        super(); // call parent constructor.
        System.out.println("Monkey is created.");
    }
  }
  ```

<br/>

### Abstraction
*Data **abstraction** is the process of hiding certain details and showing only essential information to user.*  

- The `abstract` keyword is a non-access modifier, used for classes and methods:
  - **Abstract Class** - is a restricted class that cannot use to create objects. (To access it, it must be inherited from other class).
  - **Abstract Method** - can only be used in abstract class, and it does not have a body, the body is provided by the subclass(inherited from).
    ```java
    abstract class Animal {
        // abstract method:
        public abstract void animalSound();
        
        // regular method:
        public void sleep(){
            System.out.println("sleeping...");
        }
    }
    ```
*Note:* `abstract` class can have both abstract and regular method.

- To access the `abstract` class, it must be inherited from another class.
    ```java
    abstract class Animal{
        public abstract void animalSound();
    }
  
    class Cat extends Animal{
        public void animalSound() {
        System.out.println("cat: meow"); 
    }
   }
  ```
 
*Note:*
- To achieve security - hide certain details and only show the important details of an object. 
- Abstraction can also be achieved with Interfaces  

<br/>

### Interface
- `interface` is completely *abstract class* that is used to group related methods with empty bodies.
    ```java
    interface Animal{
        public void makeSound();
        public void eating();
    }
    ```
- To access the interface methods, the interface must be "implemented" (kinda like inherited) by another class with the implements keyword (instead of extends). The body of the interface method is provided by the "implement" class

    ```java
    interface Animal{
        // interface method does not have body
        public void makeSound();
        public void eating();
    }
    
  // Cat implements the Animal interface
    class Cat implements Animal{
        public void makeSound(){
            // the body is provided here:
            System.out.println("meow");
        }
    }
    
    public static void main(String[] args){
      Cat cat = new Cat(); // create a Cat object
      cat.makeSound();
    }
    ```
*Notes:*
- Like abstract class, interface cannot use to create object.
- Interface method does not have body, the body is provided by the *implement* class
- On implementation of an interface, you must override all methods.
- Interface methods are by default `abstract` and `public`.
- Interface attributes are by default `public`, `static`, and `final`.
- An interface cannot contain a constructor  

- Java does not support "multiple inheritance" (a class can only inherit from one superclass). However, it can be achieved with interfaces, because the class can implement multiple interfaces. 
  - *Note:* To implement multiple interfaces, separate them with a comma.
    ```java
    interface FirstInterface{
        public void method(); // interface method
    }
    interface SecondInterface{
        public void otherMethod(); // interface method
    }
    
    class DemoClass implements FirstInterface, SecondInterface{
        public void method(){
            // method() body is here:
            System.out.println("text...");
        }
        public void otherMethod(){
            // otherMethod() body is here.
            System.out.println("another text...");
        }   
    }
    ```