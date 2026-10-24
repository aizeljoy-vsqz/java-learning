package oop;
import oop.Inheritance.BookContext;
import oop.Polymorphism.*;
import oop.SuperKeyword.*;

public class OopMain {
    public static void main(String[] args) {
        encapsulationTopic();
        inheritanceTopic();
        polymorphismTopic();
        superKeywordTopic();
    }


    // ---> Encapsulation:
    static void encapsulationTopic(){
        System.out.println("---> Encapsulation <---");

        Encapsulation encap = new Encapsulation();
        // encap.password; // accessing the password attribute directly will cause error

        // Using getter:
        String getPass = encap.getPassword();
        System.out.println("Using getter method: " + getPass);

        // Using setter:
        encap.setPassword("newpassword");
        System.out.println("Using setter method: " + encap.getPassword() + "\n");
    }

    // ---> Inheritance:
    static void inheritanceTopic(){
        System.out.println("---> Inheritance <---");

        BookContext b = new BookContext();

        // context is an attributes of BookContext
        System.out.println("Book context (own attributes): " + b.context);

        // nextPage() &  title is an attributes of Books that extends by BookContext
        System.out.println("title (attributes from other class): " + b.title);
        System.out.println("next page (method from other class): " + b.nextPage() + "\n");
    }

    // ---> Polymorphism:
    static void polymorphismTopic(){
        System.out.println("---> Polymorphism <---");
        Department dep = new Department();
        dep.DepartmentActivity();

        Ccs ccs = new Ccs();
        ccs.DepartmentActivity();

        Criminology crim = new Criminology();
        crim.DepartmentActivity();
    }

    // ---> Super keyword:
    static void superKeywordTopic(){
        System.out.println("---> super keyword <---");
        Monkey monkey = new Monkey();
        monkey.sound();

        Cat cat = new Cat();
        cat.printType();
    }
}
