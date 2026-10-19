package fundamentals;
/*
* Type Casting - converting one data type to another data type
*              - Widening casting -> from smaller type to larger type (ex: int -> double)
*              - Narrowing casting is vice versa of widening (ex: double -> int)
* */
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("---> Type Casting <---");

        int small = 2;
        double toInt = small; // type casting (widening)
        double medium = 2.5;

        // Widening casting
        System.out.println("from double to int: " + toInt);

        // Narrowing Casting
        System.out.println("from int to double: " + (int) medium);


    }
}
