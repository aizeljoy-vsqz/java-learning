package javalearning.code.code04_oop;
/* Class
*       - is a blueprint or template for creating an object
*
*  Object
*       - is created from a class.
*       - you can crate object using new keyword.
*
*  Class Attributes
 *      - java variables declared inside a class are called attributes.
 *
 * Accessing Attributes
 *      - you can access attributes by creating an objects and using (.) syntax
 *
 * Class Methods
 *      - declared within a class, used to perform certain actions.
 *
 *
 * Notes:
 *      - variable inside class are called attributes
 *      - method inside class are called behavior
 *      - to create an object you need to use new key word
 *          syntax: (className variableName = new ClassName())
 *      - if you don't want to modify the attributes use the final keyword.
 *          syntax: (final dataType attributesName = value)
 *      - final keyword - used to prevent modifying the value.
 *      - multiple object - you can create multiple object
 *      - multiple attributes - you can specify multiple attributes.
* */

public class ClassesAndObjects { // ---> CLASS

    // ---> content is a CLASS ATTRIBUTES
    String topic = "OOP";
    String content = "Class And Objects";

    // ---> startOOP is a class METHOD
    public void startOOP(){
        System.out.println("Let's start learning the OOP.");
    }

    public static void main(String[] args) {
        // ---> classObj is an OBJECT
        ClassesAndObjects classObj = new ClassesAndObjects();
        // ---> ACCESSING ATTRIBUTES of a class
        String content = classObj.content;
        String topic = classObj.topic;
        System.out.println("Accessing the attributes: " + "content: " + content + "topic: " + topic);


        // ---> CREATING another OBJECT
        ClassesAndObjects anotherClassObj = new ClassesAndObjects();
        // ---> MODIFYING ATTRIBUTES by overriding it
        anotherClassObj.topic = "Object";
        System.out.println("Modifying the topic attributes: " + anotherClassObj.topic + "\n");

        // ---> ACCESSING METHOD of a class
        anotherClassObj.startOOP();
    }

}
