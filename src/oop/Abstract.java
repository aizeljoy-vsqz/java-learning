package oop;
/* Abstract
*       - abstract class cannot use to create object.
*       - abstract class can use to inherited class
* */
public class Abstract {

}

// abstract class
abstract class Books{
    // abstract method (does not have body)
    public abstract void page();
}

// subclass (inherit from Books)
class JavaBook extends Books{
    public void page() {
        // the body of page() is provided here.
        System.out.println("Using abstract page method: Page 1");
    }
}
