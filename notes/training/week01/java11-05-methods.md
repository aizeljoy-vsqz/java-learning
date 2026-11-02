# Java 11:

### content: 
- Declaring and calling methods
- Parameters
- Exiting a method
- Returning a value
- Program command-line arguments

<br/>

### Declaring and Calling Methods

#### Methods
- mechanism of organizing code.
- enables creation of reusable code blocks.
- can receive data.
- can return data.

#### Declaring Methods
- **name**
  - same rules and conventions as variables.
- **typed parameter list** 
  - allows data values to be passed in.
  - can be empty.
  ```
  name (type-parameter-list)
  ```
- **body**
  - consists of zero or more statements.
  - enclosed in `{}` brackets.
  ```
  name (type-parameter-list){
    statements
  }
  ```
- **return type**
  - indicates the type of data returned.
  - use void when no value returned.
  ```
  return-type name (type-parameter-list){
    statements
  }
  ```

<br/>

### Parameters

#### variables
- scope limited to method where declared.

#### parameters
- enable passing data to methods.
- passed values matched to parameters by position. 
  ```
  static void myMethod(float x){
     return x;
  }
  ```
    
#### Parameter Passing Behavior
- **parameter passed *by value***
  - parameter receives a copy of the original value.
- **method changes to parameter values**
  - change will be visible within the method.
  - change will not be visible outside the method.
  ```java
  class Main{
     static void main(String[] args) {
        int x = 2;
        int y = 5;
  
        swapValues(x, y); // x = 5, y = 1

        System.out.println("x: " + x); // x still 2
        System.out.println("y: " + y); // y still 5
    }
  
    static void swapValues(int x, int y){
        int z = x;
        System.out.println("x: " + (x = y));
        System.out.println("y: " + (y = z));
    }
  }
  ```

<br/>

### Exiting a Method

#### reasons a method exits
- **end of method** 
  - no more code in method
- **return statement**
  - explicitly exit method
- **errors occurs**
  - method abruptly exits
  - throws an exception

<br/>

### Returning a Value

#### a method can return a single value.
- value returned with return statement.

#### method return type
- can be primitive type
- can be  more complex type such as an array.
- returning a **value**
    ```java
    class Main{
        static void main() {
            int addition = add(2,7); // addition = 9
        }
        
        static int add(int x, int y){
            int result = x+y;
            return result;
        }
    }
    ```
- returning an **array**
    ```java
    class Main{
      static void main(String[] args) {
        int arr[] = returnArray(1,2);
        
        System.out.println(arr[0]); // 1
        System.out.println(arr[1]); // 2
      }
    
      static int[] returnArray(int x, int y){
        int arr[] = {x, y};
        return arr;
      }
    }
    ```
  
<br/>

### Command-line Arguments

#### Application Main Method
- serves as program entry point.

#### Receives an Array as Parameter
- contains command-line arguments.

  ```java
  class Main{
    static void main(String[] args) {
    }
  }
  ```

#### Running from CMD Line to Pass an Arguments
- **Open the folder** containing your `.class`.
- **Click on the address bar** at the top of the file explorer window.
- **type `cmd`** into the address bar and press enter.
- **run the file** by typing `java <className> <args> <args> <args>`.

#### Accessing CMD Line Arguments
- parameter of main method are Strings array.
- you need to convert it to your desired dataType.

  ```java
  class Main{
    static void main(String[] args) {
      String firstArgs = args[0];
      int secondArgs = Integer.parseInt(args[1]);
      char thirdArgs = args[2].charAt(0);
    }
  }
  ```