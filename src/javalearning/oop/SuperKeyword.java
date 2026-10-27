package javalearning.oop;
/*
 * super keyword
 *       - used to refer parent  class of a subclass.
 *       - common use of super keyword is to eliminate the confusion
 *           between superclass and subclass that have methods with the same name.
 *       - two ways to use duper
 *           - to access attributes and methods from parent class.
 *           - to call the parent class constructor
 * Notes:
 *       - use super when you  want to call a method from the parent class
 *           that has been overridden in the child class.
 *       - you can also use super to access an attribute from parent class
 *           if they have an attribute with the same name.
* */
public class SuperKeyword {

    // Parent class
    static class Animal {
        // parent attribute & method
        String type = "Animal";
        public void sound(){
            System.out.println("Parent Class (Animal)");
            System.out.println("Parent sound: animal make sound \n");
        }
    }

    // Access parent method
    static class Monkey extends Animal{
        public void sound(){
            System.out.println("Subclass (Monkey)");
            System.out.println("subclass sound: hoo hoo haa haa \n");

            super.sound(); // call the parent method
        }
    }

    // Access parent attribute
    static class Cat extends Animal{
        String type = "Cat";
        public void printType(){
            System.out.println("Subclass (Cat)");
            System.out.println("Parent Type: " + super.type); // access parent attribute
            System.out.println("subclass Type: " + type);
        }
    }

}
