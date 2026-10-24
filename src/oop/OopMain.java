package oop;

public class OopMain {
    public static void main(String[] args) {
        encapsulationTopic();
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
        System.out.println("Using setter method: " + encap.getPassword());
    }
}
