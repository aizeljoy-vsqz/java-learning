### 3. GENERIC INTERFACE
An interface can carry a type parameter too. Each class that implements it chooses what the type
becomes — either by fixing it to a concrete type or by staying generic itself.

```java
// A generic interface
public interface Container<T> {
    void add(T item);

    T get(int index);
}

// Implementation that fixes T to String
public class StringBag implements Container<T> {
    private List<String> items = new ArrayList<>();
    public void add(String item) {
        items.add(item);
    }
    public String get(int index) {
        return items.get(index); 
    }
}

// Implementation that stays generic, passing T through
public class ListContainer<T> implements Container<T> {
    private List<T> items = new ArrayList<>();
    public void add(T item) {
        items.add(item);
    }
    public T get(int index) {
        return items.get(index); 
    }
}
```