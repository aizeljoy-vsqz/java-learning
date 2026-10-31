# Java Core Notes:

### Refresher Content:
- Encapsulation
- Constructor & Constructor Overload
- Access Modifier
- Polymorphism
- Application Security
- Java Bean
- Serialize & Deserialize
- When to use constructor and getter & setter
- varArgs
<br/>

### Encapsulation
- protected data, restrict direct access & wrapping data into a single units.
- state or properties should be private.
- provide setter(mutator: modify data) & getter(accessor: retrieve data).
- using setter & getter we can achieve data security, only the class has access and other classes have indirect access.
- WHY WE USE ENCAPSULATION?
  - local variable cannot use access modifier, only for instance and static.
  - protect & control access.
  - protect sensitive data from being access directly.
  - hides unnecessary data user of the class.
  - only show functionality to class.
  - changes internal can be made internally without affecting the external interface.
  - always has a parameter.
- getter method: always public, returning void & have parameter
- setter method: always public, returns a value that declared private & no parameter.


*Notes:*  
- *you can put the setter in a controller & getter in view.*  

<br/>

### Constructor
- owned by the object
- a special method use to perform initialization.
- name must be the same as its class.
- does not have returned any data type even void.
- cannot be abstract, static or synchronized (for multithreading)
- 2 types of constructor:
  - **default constructor** (no arg constructor): if no constructor, java creates default constructor.
  - **parameterized constructor** - with parameter
- constructor trigger initialization - initialize immediately
- java use the constructor when instantiating an object.

#### Constructor Overload
- constructor overload: parameterized constructor.
- you can also create a constructor overload like method overload
- method overload rules are the same with constructor overload

<br/>

### Access Modifier
*Access Modifier Accessibility*
- private - class
- default - class & package
- protected - class, package & subclasses
- public - class, package, subclasses, global

<br/>

### Polymorphism
- allows single action or method to behave different ways.
- enable the same name but different actions or arguments
- to identify polymorphism: you should look for its **method name** & **parameter**
- poly: means *many*, morph: means *forms*
- 2 type of polymorphism:
  - compile-time polymorphism: method overloading with different parameters (issue: memorability)
  - runtime polymorphism

<br/>

### Additional Topic:

#### Application Security
- data must be protected at the highest level.

#### Java bean
- a reusable java software that encapsulate data into a single standardized object. 
- private field
- getter & setter
- no arg constructor
- implement serialize(state or properties) & deserialized

##### Serialize
- primary memory - when we create object it resides in primary memory(RAM), it's temporary (when machine restart data will be lost)
- serialization: write object
- serialization - an object in RAM can be saved into file or db.
  - when we serialized object, data will not be lost when machine shutdown

#### Deserialize
- deserialization: read object

#### When to use Constructor and Setter & Getter?
- use constructor if your intention is to **create object**
- use setter & getter if you want to change the vale (meant for modification)

#### varArgs
- `...` varArgs must be at the end of other parameter. 
