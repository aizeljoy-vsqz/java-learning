# Java OOP

### Refresher Overview
- Inheritance 
- Aggregate Relationship

<br/>

### Two Types of object Relationship in Java
#### Inheritance 
- IS-A relationship

#### Aggregate
- HAS-A relationship

<br/>

### Inheritance

#### Inheritance
Inheritance enables class to inherit properties and actions from another class.
- Inheritance represents IS-A relationship also known as a parent-child relationship.  
- English form: classChildName is a parentClassName.

#### Terms used in Inheritance
- super class / parent class / base class
  - class whose properties and functions are inherited.
- subclass / child class / derive class / extended class
  - class that inherits another class.
- `extends` keyword use to inherit a class.

#### Why use inheritance? 
- **code reusability** - inherit the method without modification.
- **method overriding** - inherit the method & do modification.
- **extensibility** - you can add more features to the subclass.

#### Types of Inheritance
- **Single inheritance** - one parent & one class
- **multilevel inheritance** - consist of at least 3 class
- **hierarchical inheritance** - at least 2 subclass inherits from a super class.
- **hybrid inheritance** - combines two or more type of inheritance.

*notes: *
- *not everything (all) can be inherited*

<br/> 

### Aggregation in Java

#### Aggregation
If a class has a reference to another class.
- aggregation refers to HAS-A relationship.
  - where one class contains a reference.
  - it's about ownership
- English form: className has a classFeature (ex: Car has an engine)

#### Coupling
- means joining, connecting or bringing together two individual entities.
- how two classes connected to solve real world problem.

#### Tight Coupling
- dependent
- it performs initialization  immediately
- effect: 
  - too much dependency
  - instead of executing one class you execute more.
- drawback:
  - hard to unit test
  - fragile when changes occur 
  - poor maintainability 
  - lack of flexibility and reusability

#### Loose Coupling (preferred or good practice)
- don't initialize object at first, it must be null.
- **CDI Constructor Dependency Injection** - do the initialization inside a constructor
  - from `null` it will be initialized.
  - it called *constructor dependency injection*
- loose coupling used a **SOLID Principle**
  - dependency inversion
- **SDI Setter dependency Injection**  
  - initialization is in the setter instead of constructor

#### When to use CDI and SDI?
- SDI - use when updating an object

<br/>

#### Additional Topic Discussed:
- `implements` keyword - used in interface.
  - to achieve more inheritance in a subclass.
- `trim()` - removes start & end white spaces but not in between spaces.
- LUHN algorithm - used for validation like credit card number and mobile.
- `protected` - accessible on a class, package, and subclass.
- in overriding method
  - you can increase or decrease accessibility level.
  - datatype, name, & parameter should be the same.
  - @override - used to identify the method as override. (optional)
