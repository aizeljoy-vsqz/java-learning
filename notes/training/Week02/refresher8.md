# 📝 Java Core Notes:

### Refresher Day8:
Java Collection Framework  
- Collection framework
- Array
- Collection
- Interface Collection
- List
- Set
- Map
---

<br/>

### Collection Framework
- object that represents a group of object.
- object has capability of holding set of object.
- object (container) holding many different types. 
- ***unified architecture*** for representing & ***manipulating*** collections
  - enabling collection  to be manipulated independently.
- ***creating classes***, simply creating our own data-types.

<br/>

### Array
- is a variable that contains multiple data
- array is SMA (Static Memory Allocation)
- fast read on RAM
- in array, you cannot readily put your 125 products in your 100 size array.
- waste memory: you have 100 products, but you create 200 size array.

#### Two limitation:
- fix-size
- homogenous(1 data type/ same data type)

<br/>

### Collection
- resizable and mix
- DMA (Dynamic Memory Allocation), decrease increase automatically

#### Advantage:
- Reduces Programming Effort
  - data structures & algorithm
  - you don't have to write them yourself
  - already available
- Increase Performance
  - provide high performance implementation of dsa
  - programmer can be tuned by switching implementations.
- Provides Interoperability between unrelated  API's
  - establishing a common language to pass collection back & forth.
- Reduces effort required to learn API
- Reduces the effort required to design & implement API
- Fosters software reuse
  - by providing standard interface for collections & algorithm

<br/>

### Interface Collection
`Interface Collection<E>` 
- E is an element, represent a group of object
- all collections reside in java.util (required to import) unlike java.lang
- collection  = represents a group of objects
- some collection allows duplicates while others not.
- collection  behavior
  - duplicate
  - not duplicate (unique)
  - ordered
  - unordered


<br/>

### List 
- **List** is a child
- **Collection** parent
- list is an *ordered collection* (also known as sequence).
- user has precise control over where in the list each element is inserted.
- allows *duplicate elements*
- access elements by integer index and search elements

#### List
- ***ArrayList***
  - resizable array (shrink, expand)
  - DMA - Dynamic Memory Allocation
  - not synchronized (something to do with thread)
    - many threads can access it at the same time.
    - in concurrent request, many request points to it at the same time.
  - best for read operation

  ```java
  import java.util.ArrayList;
  
  ArrayList variableName = new ArrayList();
  ```
 
- ***LinkedList***
  - java is doubly linked list
  - not synchronized, nut can make  it synchronized
  ```java
      List<Object> l = new LinkedList<>();
  ```
**Methods:** 
- `size()` `add()` `clear()` `iterator()` `hasNext()` `next()` ...  

***Notes:***
- **ArrayList**
  - array list allows null multiple elements.
  - empty parameter - initial capacity of 10.
  - you can `add()` as long as the RAM can handle.
- **Vector**
  - synchronized - thread safe
  - only one thread can access object at a time, unlike array list.
- **Collections**
  - always choose *runtime polymorphism* (good practice, loose coupling)
  - choose compile polymorphism if there's thing you need to child that's not included to parent.

<br/>

### Set
- Collection without duplicate
- Collection of unique elements

#### Set
- ***LinkedHashSet***
  - Stores unique values
  - guaranteed insertion order
  - when have duplicates, the firs duplicate elements retain
  ```java
  Set<String> variableName = new LinkedHashSet<>() {
  }
  ```
- ***HashSet***
  - Stores unique values
  - but it doesn't guarantee insertion order
  ```java
  Set<String> variableName = new HashSet<>() {
  }
  ```
- ***TreeSet***
  - Stores unique values 
  - sort according to natural order
  ```java
  Set<String> variableName = new TreeSet<>() {
  }
  ```

#### Iterating set
- enhanced loop

#### Method: 
- `isEmpty()` `add()` `remove()`  ...  

<br/>

### Map
- Map is a part of java collection framework
- Map doesn't extend collections
- Map stores key value pairs
- Map doesn't allows duplicate keys, keys must be unique
- the last duplicate override the first
- `add()` = `put()` in map

#### Map
- ***LinkedHashMap***
  - retains insertion order
  ```java
  Map<String, Integer> variableName = new LinkedHashMap<>();
  ```
- ***HashMap***
  - key value pair
  - unique keys
  - belongs to map
  - doesn't guarantee insertion orders
  ```java
  Map<String, Integer> variableName = new HashMap<>();
  ```
- ***TreeMap***
  - sorted keys in natural order of keys.
  ```java
    Map<String, Integer> variableName = new TreeMap<>();
  ```

#### Method:
- `put()` `remove(key)` `keySet()` `values()` `putAll` `keys()`

<br/>

### Additional
- **How java knows if duplicated or not**
  - using equals properties
    - reflexive
    - symmetric
    - transitive
    - consistent