package fundamentals;
/*
* Type Casting - converting one data type to another data type
*              - Widening casting -> from smaller type to larger type (ex: int -> double)
*              - Narrowing casting is vice versa of widening (ex: double -> int)
* */
public class TypeCasting {
    public static void main(String[] args) {
        System.out.println("---> Type Casting <---");

        // Widening Casting (automatic)
        int small = 2;
        double toDouble = small; // type casting (widening)
        System.out.println("from int to double: " + toDouble);


        // Narrowing Casting (Manual) required to enclose type in parentheses
        double medium = 2.5;
        int toInt = (int) medium;
        System.out.println("from double to int: " + toInt);


    }
}
