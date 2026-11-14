### TWO TYPE PARAMETERS
A generic type can declare several parameters, separated by commas — the convention is K for key and
V for value. You have already seen this on Map&lt;K, V&gt;. Here is a simple Pair that holds two values of
independent types:

```java
public class Pair<K, V> {
    private final K key;
    private final V value;
    
    public Pair(K key, V value) {
    this.key = key;
    this.value = value;
    }
    
    public K getKey() { return key; }
    public V getValue() { return value; }
}

// each parameter can be a different type
Pair<String, Integer> age = new Pair<>("Alice", 30);
String who = age.getKey(); //"Alice"
int years = age.getValue(); // 30

Pair<Integer, Boolean> answered = new Pair<>(1, true);
```