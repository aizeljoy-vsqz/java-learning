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



