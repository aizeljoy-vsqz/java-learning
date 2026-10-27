package javalearning.code.code04_oop;
/* Polymorphism
*       - means many forms
*       - inheritance let us inherit attributes and methods from other class.
*       - Polymorphism uses those methods to perform different tasks.
*       - This allows us to perform single action in different ways.
*       - Polymorphism is useful for code reusability:
*       - reuse attributes & methods of an existing class when you create new class
* */

public class Polymorphism {
    static class Department {
        public void DepartmentActivity (){
            System.out.println("Parent Class (Department)");
            System.out.println("Department Activity: Cheer Dance \n");
        }
    }

    // Ccs extends Department and override the method
    static class Ccs extends Department {
        public void DepartmentActivity(){
            System.out.println("Override Department Activity: Subclass (Ccs)");
            System.out.println("CCS Activity: System Showcase \n");
        }
    }

    // Criminology extends Department and override the method
    static class Criminology extends Department{

        public void DepartmentActivity(){
            // override the method and call the parent version of method.
            System.out.println("Override the Department Activity: subclass (Criminology)");
            System.out.println("Crim Activity: Shooting \n");
        }

    }
}
