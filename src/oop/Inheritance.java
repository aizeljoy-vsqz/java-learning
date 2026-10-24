package oop;
/* Inheritance
        - inheritance let us inherit attributes and methods from other class.
*       - inherit from a class using extends keyword
*       - protected keyword - use to access attributes from other subclass.
* */

public class Inheritance {
    static class Books  {
        // use protected instead of private so you  can still use attributes to the subclasses.
        protected String title = "Java Fundamentals";

        protected String nextPage(){
            String next = "next page.";
            return next;
        }
    }

    static class BookContext extends Books{
        String context = "Variables";
    }
}
