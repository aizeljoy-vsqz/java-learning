package fundamentals;
/*
* Strings - is a collection of characters surrounded by double quotes "".
*
* String method
*   - .length()
*       - returns the length of string. // abc = 3
*   - .toUppercase()
*       - convert string to upper case. // abc = ABC
*   - .toLowercase()
*       - convert string to lower case. // Abc = abc
*   - .indexOf()
*       - return the index of the first occurrence of specified text. // Hello Aizel
*       - indexOf("Aizel") = 6
*   - .charAt()
*       - access a character at specific position in a string // Hello
*       - charAt(0) = e
*   - .equals()
*       - used to compare two string
*   - .trim()
*       - used to remove white space from beginning and the end of string.
*
* Special Characters
*   - \n - new line
*   - \t - tab
*   - \b - backspace
* */
public class Strings {
    public static void main(String[] args) {

        String name = " Aizel Joy ";

        System.out.println("---> String Method <--- (name = \" Aizel Joy \")");
        System.out.println("length(): " + name.length());
        System.out.println("chartAt(): " + name.charAt(0));
        System.out.println("indexOf(): " + name.indexOf('z'));
        System.out.println("toUpperCase(): " + name.toUpperCase());
        System.out.println("toLowerCase(): " + name.toLowerCase());
        System.out.println("trim(): " + name.trim());
        System.out.println("equals(): " + name.equals(" Aizel Joy ") + "\n");


        System.out.println("---> String Concatenation (firstName = Aizel, lastName = Vasquez) <---");
        String firstName = "Aizel";
        String lastName = "Vasquez";

        System.out.println("Full Name: " + firstName + " " + lastName);


    }
}
