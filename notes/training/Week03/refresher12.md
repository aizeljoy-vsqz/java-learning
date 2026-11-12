# 📝 Java Core Notes:

### Refresher Day11:
Java Design Patten
- Factory Method
- Singleton Method
---

<br/>

### Design Pattern
- Design patterns are Solution to common problem encounter by the developer.

<br/>

### Gang of Four Design Pattern
- before jump to design pattern, you must understand the fundamentals of OOP
- The GoF design patterns are divided into three categories:
  - ***creational:*** This type of pattern abstracts the instantiation process of an object
  - ***structural:*** compose classes and objects to form larger structures.
  - ***behavioral:*** This category assigns responsibility and defines communication among groups of objects.

<br/>

### Creational Designs Pattern
    Creational Design  Pattern are concerned with the way in which objects are created.  
    They reduce complexities and instability by creating objects in a controlled manner.  

    The new operator is often considered harmful as it scatters object all over the application.  
    Over time, it can become challenging to change an implementation because classes become tightly coupled.  

    Creational Design Patterns address this issue by decoupling the client entirely from the actual initialization process.

<br/>

### Two most commonly use Java Pattern in industry
- Factory Method
- Singleton Pattern

<br/>

### Factory Method Design Pattern
    Factory Method is a creational design pattern that provides an interface for creating object in
    a superclass but allows subclasses to alter the type of object that will be crated. It just defines
    an interface or abstract class for creating object but let the subclasses decide which class to instantiate.
    In other words, subclasses are responsible to create the instance of the class.

    Factory method are usually called within the Template Methods. Objects are created through inheritance.

    Often, designs start out using Factory Method (less complicated, more customizable, subclasses
    proliferate) and evolve toward Abstract Factory, Prototype, Or Builder (more flexible, more complex) as
    the designer discovers where more flexibility is needed.

    The new operator considered harmful. There is a difference between requesting an object and creating
    one. The new operator always creates an object and fails to encapsulate object creation. A Factory
    Method enforces that encapsulation and allows an object to be requested without inextricable coupling
    to the act of creation

#### Factory Method
- Define an interface for creating an object but let subclasses decide which object to instantiate.
- Factory method lets a class defer instantiation to subclasses.

#### Advantages of Factory Methods or Factory Design Pattern
- allows subclasses to choose the type of objects to create.
- it  promotes loose-coupling by eliminating the need to bind application-specific classes into the code.
  - that means the code interacts soley with the resultant interface or abstract class,
  - so that it will work with any classes that implement the interface or that extends that abstract class.

#### Usage of Factory Design Pattern
- when a class does not know the subclasses will be required to create
- when a class wants that its subclasses specify the objects to be created.
- when the parent classes choose the creation of objects to its subclasses.

#### Implementation
- client uses the products as abstract products without being aware about their concrete implementation.
- client needs a product, but instead of creating it directly using the new operator, it asks the factory object for a new product, providing the information about the type of object it needs.
- factory instantiates a new concrete product and then returns to the client the newly created product (cast to abstract product class)
- client uses the products  as abstract products without being aware about their concrete implementation.

<br/>

### Singleton Method
- One of the simplest design pattern
- Restricts the instantiation of a class to one object
- Ensures that a class jas just a single instance
- Provides a global access point to that instance

#### Advantages
- Saves memory because object is not created at each request-only single instance is reused again and again.
- In cases where object creation is very costly (time taking), we do not have need it. We just access the already created object.

#### When to use?
- Ownership of single instance cannot be reasonably assigned.
- Lazy initialization is desirable
- Global access is not otherwise provided for

#### Singleton Implementation Requirements
- Private constructor to restrict instantiating of the class from other classes.
- Private static variable of the same class that is the only  instance of the class.
- ensure that a class has just a single instance
- Public static method that returns the instance of the class, this is the global access point to outer world to get the instance of the singleton class.
