# 📝 Java Core Notes:

### Refresher Day7:
- final
- static
- this
- super
---

<br/>

### final keyword
Final - restricting changes
- variable cannot be reassigned
- method cannot be overridden
- class cannot be extended

#### final method
- cannot be overridden
- however, it can be inherited and use by the child class
- that's why you can still access it.

#### final class
- cannot be extended
- however, it can be instantiated
- that's why you can still access its behavior

<br/>

### static keyword
- variable 
  - belongs to the class, not object
- method  
  - belongs to the class, 
  - we can call it without object instantiation
- block
  - class level, called when class initialized.
  - first to run, rather than main method.
  - execute when class initialized
  - usually use when something needs to be initialized at least once.

<br/>

### this keyword
- refers to current object
- this cannot be used in static method
- commonly use in constructor that have field with the same name.

#### `this()` this constructor 
- call another constructor
- use in overloading constructor
- constructor chaining = constructor in the same class.

<br/>

### super keyword
- refers to the parent class current object.
- use when you have child that want to access the parent behavior
  - or fields instead of their own.

#### `super()` super constructor
- refers to the parent class
- must be called first before assigning others.
- `super()` find the same parameter in parent class rather than same parameter name.