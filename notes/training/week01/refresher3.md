# Java Core Notes:
### refresher content:
- Array - (pass by reference, value, varArgs)
- OOP - (object, class)
- Class Naming
- Code Smell
- Modularization
- SOLID Principle
- Design Pattern
- Instance & Static (variable, method)
- IPO

<br/>

### Array 
#### Pass by Value
- Java copies the actual value of the variable and stores it in a new temporary memory location used only inside the method.
- Any changes made inside the method only affect that temporary copy. The original variable outside the method remains completely untouched.
#### Pass by Reference
- The system passes the memory address *(the actual location)* of the original variable into the method., rather than a copy of the object itself.
- Any changes made inside the method immediately alter the original variable.

#### Pass  by VarArgs
- `...` - Allows us to provide zero or multiple values.
- you can also pass array as an argument in a method.
- example: 
  - method declaration: `methodName(dataType... varName)`
  - calling the method: `methodName(value, value)` or `methodName(arrayName)`

<br/>

### OOP - Object-Oriented Programming

#### Object 
- simulate how real-world objects work.
- object has **state** (properties or data attributes), **behavior** (method or function) & **identity** (name of the object).
- `new` - use to instantiate an object.
- `.` - use to access properties and method.
- ***behavior** should be **verb**  (action word)*.
- object consume space.

#### Class
- class is a blue-print or a template of an object.
- class does not consume space, unlike object.
- class can be public or default
- class can have multiple interfaces.
- no same public class in one file.
- class should have one class in a single file.
<br/>



### Additional Topic Discussed:

#### Class Naming
- class should be descriptive.
- class name should be in pascalCase.

#### Code Smell
- Code may be difficult to understand, to maintain, to test or extend.
- long method: performs to many operations.
- god class/large class: does too much work or many uses.

#### Modularization
- break one large function into multiple function for code reusability.

#### Solid Design Principle
- single response responsibility 
  - a class should have one and only one reason to change
  - a class should have only one job.
  - group related methods to a single class that method are into one responsibility.

#### Design Pattern
- reusable solution to common software design.
- patterns will give you confidence in application development.
- 2 requirements for design pattern:
  - deep understanding in OOP.
  - know how to read UML Diagrams.
- MVC Design Pattern:
  - Model - manage application data & business logic. //notes: model class don't have main method.
  - View - UI &  presentation of data.
  - Controller - input & process

#### Instance Variable
- outside any method but inside a class, owned by the object.
- have default value 0 or null
- when variable is an instance, don't need to perform initialization.

#### Instance Method
- method inside a class
- can be accessed by the object.

#### Static Method or Class method
- no need to create an  object from a class to be accessed, just call the class.

#### IPO
- Input (Controller)
  - main lives here.
  - handles the input.
  - assigning values to instance variables.
  - access the view.
- Process (Model)
  - is the business logic and properties
- Output (View)
  - import model to access properties
  - no data to maintain
  - no need to create object from a class to be accessed, just call the class.
  - method are static
- MVC Process 
    ```java
    // ==========================================
    // 1. PROCESS (Model)
    // ==========================================
    class ProductModel {
        // Properties (Instance variables: default to null/0, no initial values needed)
        public String productName; 
        public double price;       
    
        // Business Logic: Appears here alongside the properties
        public double calculateTotalWithTax() {
            return this.price * 1.12; // 12% tax rule
        }
    }
    
    // ==========================================
    // 2. OUTPUT (View)
    // ==========================================
    class ProductView {
        // No data to maintain. Methods are static. Just call the class!
        public static void displayProductDetails(ProductModel model) {
            System.out.println("----- PRODUCT INVOICE -----");
            System.out.println("Item: " + model.productName);
            System.out.println("Base Price: Php " + model.price);
            System.out.println("Total with Tax: Php " + model.calculateTotalWithTax());
        }
    }
    
    // ==========================================
    // 3. INPUT & ORCHESTRATION (Controller)
    // ==========================================
    public class MainController {
        // Main method lives here to drive the program
        public static void main(String[] args) {
            
            // 1. INPUT: Create the model instance to hold data
            ProductModel myModel = new ProductModel();
    
            // 2. ORCHESTRATION: Assigning values to instance variables
            myModel.productName = "Ergonomic Mouse";
            myModel.price = 2500.00; 
    
            // 3. OUTPUT: Accessing the view directly via class name (no object creation)
            ProductView.displayProductDetails(myModel);
        }
    }
    ```
