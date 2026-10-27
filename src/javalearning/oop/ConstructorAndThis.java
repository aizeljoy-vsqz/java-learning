package javalearning.oop;
/* Constructors
*       - used to initialized objects.
*       - a constructor is called when an object of a class is created.
*       - it can be used to set initial values for object attributes.
*       - constructor must have the same name with a class, it cannot have a return type.
* */

public class ConstructorAndThis {
    String title;
    String topic;

    // Call the constructor inside the constructor to reuse code & set default value for title.
    public ConstructorAndThis(String topic){
        this("oop", topic);
    }

    public ConstructorAndThis(String title, String topic){
        // use this keyword to assign values to the class variable.
        this.title = title;
        this.topic = topic;
    }


    public static void main(String[] args) {
    ConstructorAndThis context1 = new ConstructorAndThis("constructor");
        System.out.println("Using constructor with default title: ");
        System.out.println("title: " + context1.title + " topic: " + context1.topic + "\n");


    // Create new object:
    ConstructorAndThis context2 = new ConstructorAndThis("Constructor", "this keyword");
        System.out.println("Using constructor with 2 parameter");
        System.out.println("title: " + context2.title + " topic: " + context2.topic);
    }

}
