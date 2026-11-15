# Java Collection
- [1. Introduction to List](#1-introduction-to-list)
- [2. List Interface and Implementations](#2-list-interface-and-implementations)
- [3. Adding & Accessing and Searching Elements](#3-adding--accessing-and-searching-elements)
- [4. Updating & Removing Elements](#4-updating--removing-elements)
- [5. Searching and Checking Elements in Java List](#5-searching-and-checking-elements-in-java-list)
- [6. Iterating Through a List in Java](#6-iterating-through-a-list-in-java)
- [7. Sorting and Manipulating Lists in Java](#7-sorting-and-manipulating-lists-in-java)

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

[⬇️](#3-adding--accessing-and-searching-elements)
[⬆️](#java-collection)
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

[⬇️](#4-updating--removing-elements)
[⬆️](#java-collection)
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

[⬇️](#5-searching-and-checking-elements-in-java-list)
[⬆️](#java-collection)
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

[⬇️](#6-iterating-through-a-list-in-java)
[⬆️](#java-collection)
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

<br/>

[⬆️](#java-collection)
## 6. Iterating Through a List in Java

### | Traditional for loop |
#### When to use?
- You need the element's index.
- You need to access the previous or next element.
- You need to skip certain positions.
- You need to iterate backward.
- You need to update elements using set().

#### Performance
- ArrayList, get(i) is O(1)
- traversing the entire list is O(n)
- LinkedList index-based loop is O(n²).

```java
List<String> names = new ArrayList<>(
    List.of("John", "Carlo", "Jc")
);

for (int i = 0; i < names.size(); i++) {
    System.out.println(names.get(i));
}
```

### | Enhanced for loop (for-each) |
- If you don't need the index, use for-each
- Updating an element does not replace the element in the list
- use for-loop if you want to update elements.
  ```java
  List<String> names = new ArrayList<>(
      List.of("Aiz", "Zel", "Joy")
  );
  
  for (String name : names) {
      System.out.println(name);
  }
  ```
  
### | Iterator — Traverse and safely remove elements |
- traversal with safe removal
- lets you move through a collection one element at a time
- useful when you need to remove elements while iterating
- `iterator()` - creates an iterator
- `hasNext()` - checks whether another element exists
- `next()` - Returns the next element
- `remove()` - Removes the last element returned by next()

  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(1, 2, 3, 4, 5,6)
  );
  
  Iterator<Integer> iterator = numbers.iterator();
  
  while (iterator.hasNext()) {
      Integer number = iterator.next();
  
      System.out.println(number);
  }
  
  // ================================================
  
   while (iterator.hasNext()) {
      Integer number = iterator.next();
  
      if (number % 2 == 0) {
          iterator.remove();
      }
  }
  
  System.out.println(numbers);// [1,3,5]
  ```

*Important:*
- You can only call iterator.remove() once after a successful next() call.
- Calling it before next(), or twice for the same element, throws IllegalStateException.

### | ListIterator — Traverse forward and backward |
- regular iterator moves forward
- ListIterator can do forward and backward traversal, plus modifications.
  ```java
  while (iterator.hasPrevious()) {
      System.out.println(iterator.previous());
  }
  ```
  
- ListIterator allows modification during traversal using its own methods.
- ListIterator methods:
  - `hasNext()` - Checks for a next element
  - `next()` - Returns the next element
  - `hasPrevious()` - Checks for a previous element
  - `previous()` - Returns the previous element
  - `nextIndex()` - Returns the next element's index
  - `previousIndex()` - Returns the previous element's index
  - `add(value)` - Inserts an element
  - `set(value)` - Replaces the last returned element
  - `remove()` - Removes the last returned element

### | forEach() — Iterate using a lambda expression |
- using lambda
  ```java
  List<String> names = List.of(
      "John", "Carlo", "Jc"
  );
  
  names.forEach(name -> {
      System.out.println(name);
  });
  ```
  
- You can shorten it further using a method reference:
  ```java
  name -> System.out.println(name)
  
  names.forEach(System.out::println); //short
  ```
  
<br/>

## 7. Sorting and Manipulating Lists in Java

### | Collections.sort() |
- `Collections.sort()` - to arrange elements in their natural order

  ```java
  List<Integer> numbers = new ArrayList<>(List.of(5, 2, 8, 1, 9, 3));
  
  Collections.sort(numbers);
  System.out.println(numbers); // [1,2,3,5,8,9]
  ```

### | Collections.reverseOrder() |
- `Collections.reverseOrder()` - if you want the reverse order of natural order
  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(5, 2, 8, 1, 9, 3)
  );
  
  Collections.sort(numbers, Collections.reverseOrder());
  
  System.out.println(numbers);
  ```
  
### | Comparator — Customize sorting rules |
- if you don't want to sort using the natural order
- A Comparator defines how two elements should be compared.
- Comparator.comparingInt(String::length)
  - compare Strings using their lengths instead of their alphabetical order

  ```java
  List<String> names = new ArrayList<>(
      List.of("Alexander", "John", "Mike", "Ana")
  );
  
  names.sort(
      Comparator.comparingInt(String::length)
  );
  
  System.out.println(names); // [Ana, John, Mike, Alexander]
  ```
  
### | Collections.reverse() |
- Reverse the List

  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(1, 2, 3, 4, 5)
  );
  
  Collections.reverse(numbers);
  
  System.out.println(numbers); // [5, 4, 3, 2, 1]
  ```
  
### | Collections.shuffle() |
- Randomize elements

  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(1, 2, 3, 4, 5)
  );
  
  Collections.shuffle(numbers);
  
  System.out.println(numbers); // [3, 1, 5, 2, 4]
  ```
  
### | subList() |
- Extract a portion of a List
- Use subList(fromIndex, toIndex)
- subList() is a view, not a separate independent List
- modifications through the view are reflected in the original List.
- Avoid structurally modifying the original List directly while using a subList view

  ```java
  List<Integer> numbers = new ArrayList<>(
      List.of(10, 20, 30, 40, 50, 60)
  );
  
  List<Integer> result = numbers.subList(1, 4);
  
  System.out.println(result); // [20, 30, 40]
  ```

### | Collections.min() and Collections.max() |
- find the smallest and largest elements.

  ```java
  List<Integer> numbers = List.of(10, 5, 30, 2, 50);
  
  System.out.println(Collections.min(numbers)); // 2
  System.out.println(Collections.max(numbers)); // 50
  ```
  
### | Collections.frequency() |
- Count occurrences

  ```java
    List<Integer> numbers = List.of(
        1, 2, 2, 3, 3, 3, 4, 4, 4, 4
    );
    
    System.out.println(Collections.frequency(numbers, 3)); // 3
    System.out.println(Collections.frequency(numbers, 4)); // 4
  ```
