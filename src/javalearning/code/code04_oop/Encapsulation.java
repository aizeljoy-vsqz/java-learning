package javalearning.code.code04_oop;
/* Encapsulation
*       - use to hide sensitive data.
*       - use private access modifier to attributes.
*       - use getter - method that returns the attributes value
*       - use setter - method that sets value to the attributes
*
* Why Encapsulation?
*       - Better control of class  attributes and methods.
*       - Class attributes can be made read-only or write-only.
*       - Flexible: the programmer can change one part of the code without affecting other parts.
* */

public class Encapsulation {
    private String password = "password 123";

    // getter
    public String getPassword(){
        return password;
    }
    // setter
    public void setPassword(String newPassword){
        this.password = newPassword;
    }
}


