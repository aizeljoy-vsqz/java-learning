### GENERIC METHOD
A single method can be generic even if its class is not. The type parameter is declared in angle brackets
before the return type. Java usually infers the type from the arguments, so you rarely state it at the call
site.

```java
public class Utils {
    // <T> before the return type declares the type parameter
    public static <T> T firstOf(List<T> items) {
        return items.get(0);
    }
    
    // works with any type - T is inferred from the argument
    public static <T> void printAll(List<T> items) {
        for (T item : items) System.out.println(item);
    }
}


List<String> names = List.of("Alice", "Bob");
String first = Utils.firstOf(names); // T inferred as String

List<Integer> nums = List.of(10,20,30);
int n = Utils.firstOf(nums); // T inferred as Integer
```