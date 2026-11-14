### Generics
Generics let you write code that works with any type while staying type-safe.

#### Use cases:
1. Collections — every collection class is generic; this is where you meet generics most.
2. Reusable utility types — a Pair&lt;A, B&gt;, a Result&lt;T&gt;, a cache or container written once and used
   with any type.
3. Methods that work across types — e.g. a method that prints any list regardless of element type.
4. Libraries and APIs — so callers get type safety without the author knowing their types in advance.

<br/>

***Notes:***
- Generics accept only objects, never primitives
- that is the full reason List \<int> is illegal while
- List \<Integer> is fine. 
- Integer is the object form that generics can hold. 
- The two features are partners. 
- The empty <> on the right is the diamond operator: Java infers the type from the left, so
  you don't repeat it.

### GENERIC CLASS
T is a type placeholder — a stand-in replaced by a real type when the class is used. Conventional names:  
T (type), E (element), K/V (key/value).

```java
public class Box<t>{
    private T contents;
    
    public void put(T item){
        this.contents = item; 
    }
    
    public T get(){
        return contents; 
    }
}
```
##### THE SAME CLASS SERVES ANY TYPE
```java
Box<String> wordBox = new Box<>();

wordBox.put("Hello");
String s = wordBox.get(); // guaranteed String

Box<Integer> numBox = new Box<>();

numBox.put(100);
int n = numBox.get(); // guaranteed Integer
```


