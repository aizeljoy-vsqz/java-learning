package fundamentals;

/*
* Math method - math method allows you to perform mathematical task on numbers.
*   - Math.max(x,y) - find the highest value of x and y.
*   - Math.min(x,y) - find the lowest value of x and y.
*   - Math.round(x) - returns the round of value of x.
*   - Math.sqrt(x) - returns the square root of x.
*   - Math.ceil(x) - returns the round up value of x
*   - Math.floor(x) - returns the round down value of  x
*   - Math.abs(x) - returns the positive value of x
*   - Math.pow(x,y) - returns the value of x raised to the power of y.
*   - Math.random() - returns a random number
* */
public class MathMethod {
    public static void main(String[] args) {
        int num = 5;
        int num1 = -1;
        System.out.println("---> Math Method <---");
        System.out.println("Math.max(): " + Math.max(num, num1));
        System.out.println("Math.min(): " + Math.min(num, num1));
        System.out.println("Math.abs(): " + Math.abs(num1));
        System.out.println("Math.random(): " + (int) (Math.random() * 10));
        System.out.println("Math.sqrt(): " + Math.sqrt(num));
        System.out.println("Math.pow(): " + Math.pow(num, num));

    }
}
