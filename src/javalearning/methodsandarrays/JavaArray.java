package javalearning.methodsandarrays;

/*
* Arrays - used to store multiple values in a single variable.
*        - you can access an array element by referring to the index.
*
* length - length property used to find out how many elements inside an array.
* new keyword - used to specify the size of an empty array.
*
* multidimensional array - an array contains another array.
*                        - to create 2d array, write each rows inside its own curly braces{}
*                        - to  access element you need two indexes.
* */

public class JavaArray {
    public static void main(String[] args) {
        //---> Array
        System.out.println("---> Array <---");
        int[] num = {2,4,1,4};
        int[] num1 = new int[2];
        num1[0] = 1;
        num1[1] = 5;

        // ---> Sum of num array using for loop.
        int sum = 0;
        for (int i = 0; i < num.length; i++){
            sum += num[i];
        }
        System.out.println("Sum using for loop: " + sum);

        // ---> Print the value of num1 array using for each loop.
        // Note: for-each loop is great when you only need to read elements.
        System.out.println("Using for each loop:");
        for(int n : num1){
            System.out.print(n + " ");
        }
        System.out.println();

        //---> Two dimensional array


    }
}
