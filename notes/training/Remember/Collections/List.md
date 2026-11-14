# Java Collection

## 1. Introduction to List

### | What is List? |
- stores multiple elements
- in a particular sequence

    ```java
    List<String> names = new ArrayList<>();
    names.add("Aiz");
    names.add("Zel");
    ```

### | Accessing each element |
- use index to access elements
- index starts at 0
- first element: index 0;
- last element: index size()-1
  ```java
  System.out.println(names.get(0)); // Aiz
  System.out.println(names.get(size()-1)); // Zel
  ```

### | What makes List special? |
- Maintains insertion order
- Allows duplicate elements
- Allows index-based access
  ```java
  List<Integer> numbers = new ArrayList<>();
  numbers.add(10); 
  numbers.add(10);
  numbers.set(1, 20);
  ```

### | difference between size & capacity |
- Size is the actual number of elements.
- Capacity is the amount of space allocated internally by an ArrayList.
  ```java
  List<Integer> numbers = new ArrayList<>(10);
  
  numbers.add(100);
  numbers.add(200);
  numbers.add(300);
  ```

<br/>

## 2. List Interface and Implementations

### | What is List interface? |
List  
- List is an interface
- not a concrete class

Interface  
- interface is a set of methods 
- that implementing classes must provide

### | Understanding List & ArrayList |
ArrayList
- You can access methods defined by ArrayList
- as well as inherited methods
  ```java
  ArrayList<String> names = new ArrayList<>();
  ```

List
- You access the object through the List interface
- Only methods available through that reference type can be called.
  ```java
  List<String> names = new ArrayList<>();
  ```

### | Why should we use List instead of ArrayList? |
- Flexibility: change implementations more easily.
  ```java
  List<String> names = new ArrayList /*LinkedList*/<>();
  names.add("Aiz");
  names.add("Zel");
  ```

*Important: Switching implementations doesn't guarantee better performance. You still need to choose based on how your application uses the List.*

### | Understanding the different List implementations |

#### ArrayList
- Uses a resizable array internally.
- Fast index-based access.
- Efficient iteration.
- Adding at the end is usually efficient.
- Inserting in the middle requires shifting elements.

####  LinkedList
- Uses connected nodes internally.
- Each node references the previous and next node.
- Index access requires traversal.
- Efficient insertion and removal at the ends.
- Uses additional memory for node references.

### | Declaring and initializing Lists |
- Empty List
  ```java
  List<String> names = new ArrayList<>();
  ```
- List with initial values
  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(10, 20, 30, 40)
  );
  ```
- Creating a LinkedList
  ```java
  List<String> names = new LinkedList<>();
  ```
- Immutable List
  - List.of() creates an unmodifiable List. You cannot add, remove, or replace its elements.

  ```java
  List<String> names = List.of(
      "John", "Jc", "Carlo"
  );
  ```

<br/>

## 3. Adding & Accessing Elements
- `add()` - add element at the end
- `get(index)` – Retrieve an element using its index.
  ```java
  List<String> names = new ArrayList<>();
  names.add("John");
  System.out.println(names.get(0));
  ```
- `add(index, element)` - insert an element at a specific location
  - The existing elements shift to the right to make room for the new element.
- `indexOf(element)` – Returns the first matching index
- `lastIndexOf(element)` Returns the last matching index
  ```java
  names.add(1, "Jc");
  int index = names.indexOf("Jc");
  System.out.println(numbers.lastIndexOf("Jc"));
  ```
- `addAll()` - add multiple elements at once.
  ```java
  List<String> first = new ArrayList<>();
  
  first.add("John");
  first.add("Carlo");
  
  List<String> second = new ArrayList<>();
  
  second.add("Aiz");
  second.add("Zel");
  
  first.addAll(second);
  ```
  
  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(10, 20, 50, 60)
  );
  
  List<Integer> newNumbers = List.of(30, 40);
  
  numbers.addAll(2, newNumbers);
  
  System.out.println(numbers);
  ```

*Important: add(element) returns a boolean indicating whether the element was added successfully.*
```java
boolean result = names.add("Jc");
System.out.println(result); // true
```

<br/>
