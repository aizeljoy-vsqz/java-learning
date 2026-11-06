# OOP
### Overview:
- Encapsulation
- SRP - Single Responsibility Principle
- Abstraction

<br/>

### Encapsulation
#### Hiding implementation detail at the *execution level.*
- Especially detail that might impact on the rest of the system.

#### Mechanism for hiding detail  
- Access modifiers `private` or `protected`
- packages
- modules
- inheritance

#### Principle
- encapsulate what varies

***notes:***
- encapsulation is about hiding data 
  - *bundling data* together
  - *restrict direct access* to protect it
- it answers: How do I protect my internal state from being corrupted by external code.

**Encapsulating Product Type Variation**  

```java
public class Product{
    ...
    private ProductType type;
    ...
}
```
```java
public enum ProductType{
    DIGITAL, PHYSICAL;
}
```

<br/>

### Single Responsibility Principle
- A class should have only one reason to change

<br/>

### Abstraction
- Hiding data for higher-level view
- or defining things by their essential characteristics
- in software, can define abstract objects
