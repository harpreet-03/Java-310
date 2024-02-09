
class IPerson{
    ///////////////////
    public String name;
    public int age = 13;

    //constructor doesnot have a return type
    // It is a mthd that have same name as class name
    //It'll called automatically when object is created 

    // Default constructor: 
    public IPerson() {
        System.out.println("Default constructor called");
        this.name = "hs";
        this.age = 19;
    }

    // public void display() {
    //     System.out.println("Name: " + name + "\nAge: " + age);
    // }

}

public class Personn {
    public static void main(String[] args) {
       
         IPerson person1 = new IPerson();
         

         IPerson person2 = new IPerson();
         

    }
}
