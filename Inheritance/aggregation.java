
/*if you don't use the this keyword to refer to instance variables inside a constructor, the compiler will not be able to distinguish between the instance variables and the parameters of the constructor with the same name. This can lead to confusion and potentially incorrect behavior. */







/*
 * 
 * Aggregation: 
 * In Java, aggregation is a type of association where one class has a "has-a" relationship with another class. It represents a whole-part or container-contained relationship between objects. Unlike composition, in aggregation, the objects have independent lifecycles, meaning the contained object can exist independently of the container object.
 */


class Address{
    String city, state, country;

    public Address(String city, String state, String country){
        this.city = city;
        this.state = state;
        this.country = country;
    }

}



/*This class is having a refernece to another entity. this is Aggragation.

 * In this example, the Studnet class has an aggregation relationship with the Address class. An Studnet "has-a" relationship with an Address, meaning an Studnet object can have an Address object associated with it.

However, note that the Address object can exist independently of the Studnet object. It can be used by other classes as well, and deleting the Studnet object does not necessarily delete the Address object.
 * 
 */
class Student{
    int id;
    String name;
    Address address;

    Student(int id, String name, Address address){
        this.id = id;
        this.name = name;
        this.address = address;
    }

    void display() {
        System.out.println(id + " " + name);
        System.out.println(address.city + " " + address.state + " " + address.country);
    
    }

}

public class aggregation {
    public static void main(String[] args) {
        Address a1 = new Address("Batala", "Punjab", "India");

        Student s1 =  new Student(101, "Harpreet ", a1);
        s1.display();
    }
}


