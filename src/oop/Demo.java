package oop;

class Person{
    String name;
    String email;
    String phone;

    void walk(){
        System.out.println(name + " is walking");
    }
    void eat(){
        System.out.println(email);
    }
    void sleep(){
        System.out.println(name + " is sleeping");
    }
}

public class Demo {

    public static void main(String[] args) {
        // Instantiating an object
        Person person1 = new Person();

        // Define some properties
        person1.name = "Joe";
        person1.email = "joe@email.com";
        person1.phone = "2155550000";

        // Abstraction
        person1.walk();
        Person person2 = new Person();
        person2.name = "Sarah";
        person2.sleep();



        //Attributes, variables, adjectives, descriptors
       /* String name = "Joe";
        String email = "joe@email.com";
        String phone = "2155550000";

        // Action, activity, behavior
        System.out.println(name + " is walking");
        System.out.println(name + " is eating");

        //What if we want to add another person?
        String name2 = "Sarah";
        String email2 = "Sarah@email.com";
        String phone2 = "2155551111";

        // Action, activity, behavior
        walking(name2);
        System.out.println(name2 + " is eating");

        // What about binding attributes and properties together?
    }

    // Enhance by adding functions to minimize code
    static void walking(String name){
        System.out.println(name + " is walking");
       */
    }

}
