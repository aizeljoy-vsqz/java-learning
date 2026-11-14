# Java Collection
- [Introduction to List](#1-introduction-to-list)
- [List Interface and Implementations](#2-list-interface-and-implementations)

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

## 3. Adding & Accessing and Searching Elements
### | add(element) --- get(index) |
- `add()` - add element at the end
- `get(index)` – Retrieve an element using its index.

  ```java
  List<String> names = new ArrayList<>();
  names.add("John");
  System.out.println(names.get(0));
  ```
  
### | add(index, element) --- indexOf(element) --- lastIndexOf(element) |
- `add(index, element)` - insert an element at a specific location
  - The existing elements shift to the right to make room for the new element.
- `indexOf(element)` – Returns the first matching index
- `lastIndexOf(element)` Returns the last matching index

  ```java
  names.add(1, "Jc");
  int index = names.indexOf("Jc");
  System.out.println(numbers.lastIndexOf("Jc"));
  ```
  
### | addAll() |
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

## 4. Updating & Removing Elements

### | set(index, element) |
- The `set()` method replaces an existing element at a specified index.

  ```java
  list.set(index, newElement);
  ```
  
  ```java
  List<String> names = new ArrayList<>();
  
  names.add("John");
  names.set(1, "Jc");
  ```
  
  ```java
  List<String> numbers = new ArrayList<>(List.of(1,2,3)); 
  
  for (int i = 0; i < numbers.size(); i++) {
          numbers.replaceAll(number -> number * 2);}
  ```

### | remove(index) |
`remove(index)` - remove by position
- Removes the element at a specific index and 
- returns the removed element.

  ```java
    List<String> names = new ArrayList<>();
    
    names.add("John");
    names.add("Carlo");
    names.add("Jc");
    
    String removed = names.remove(1);
    
    System.out.println(removed); // Carlo
    System.out.println(names); // [John, Jc]
  ```

### | remove(object) |
`remove(object)` — remove by value
- Removes the first matching element and 
- returns true if something was removed.
- Do not use numbers.remove(n) inside an enhanced for loop. 
  - It can cause a ConcurrentModificationException.
- An Iterator provides a safe way to remove elements while traversing a collection.

  ```java
    List<String> names = new ArrayList<>();
    
    names.add("John");
    names.add("Carlo");
    names.add("Jc");
    
    boolean removed = names.remove("Carlo");
    
    System.out.println(removed); // true
    System.out.println(names); // [John, Jc]
  
    List<String> num = new ArrayList<>(List.of(1,2,3));
    boolean removed = names.remove(Integer.valueOf(2));
  ```
  
  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(1, 2, 4, 6, 7)
  );
  
  Iterator<Integer> iterator = numbers.iterator();
  
  while (iterator.hasNext()) {
      int n = iterator.next();
  
      if (n % 2 == 0) {
          iterator.remove();
      }
  }
  
  System.out.println(numbers); // [1,7]
  ```

### | removeIf() |
`removeIf()` — remove using a condition
- Instead of manually searching for elements,
- use removeIf() when working with Lists.

  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(1, 2, 3, 4, 5, 6)
  );
  
  numbers.removeIf(n -> n % 2 == 0);
  
  System.out.println(numbers); // [1, 3, 5]
  ```

### | clear() |
`clear()` — remove everything
- If you want to empty the entire List, use clear().

  ```java
  List<String> names = new ArrayList<>(
      List.of("Aiz", "Zel", "Joy")
  );
  
  names.clear();
  
  System.out.println(names); // []
  System.out.println(names.size()); // 0
  ```
  
<br/>

## 5. Searching and Checking Elements in Java List

### | contains() |
- Check if an element exists
- It returns a boolean
- use contains(), when you only need to know whether an element exists
  ```java
  List<String> names = new ArrayList<>(
      List.of("Aiz", "Zel", "Joy")
  );
  System.out.println(names.contains("Zel")); // true
  System.out.println(names.contains("Jc")); // false
  ```
  
### | indexOf() |
- returns the index of the first occurrence.
- It returns -1 if the element doesn't exist.
- use indexOf(), if you want to know its position

  ```java
  List<String> names = new ArrayList<>(
      List.of("Aiz", "Zel", "Joy")
  );
  System.out.println(names.indexOf("Zel")); // 1
  System.out.println(names.indexOf("Jc")); // -1
  ```
  
### | lastIndexOf() |
- Find the last position

  ```java
  List<String> names = new ArrayList<>(
      List.of("Aiz", "Zel", "Joy")
  );
  System.out.println(names.lastIndexOf("Zel")); // 1
  ```
  
### | isEmpty() |
- Check whether the List has elements

  ```java
  List<String> names = new ArrayList<>();
  
  System.out.println(names.isEmpty()); // true
  ```
  
### | containsAll() |
- checks whether all requested values exist.
- It does not check how many times they appear.

  ```java
  List<Integer> numbers = List.of(1, 2, 3, 4, 5);
  
  List<Integer> required = List.of(2, 3, 5);
  
  System.out.println(numbers.containsAll(required)); // true
  ```

*Reminder:*
- ArrayList.contains() searches elements one by one. O(n)
- if you frequently need to check whether values exist
- A HashSet may be a better choice. 0(1)
- ArrayList for ordering
- HashSet for fast searching
