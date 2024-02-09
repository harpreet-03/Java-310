class Person {

    public String name;
    public int age;
    public long mob;

    public Person(String name, int age, long mob) {

        this.name = name;
        this.age = age;
        this.mob = mob;

        System.out.println("Parametrized constructor called");
    }

    public Person() {
        System.out.println("Default constructor called");
    }

    // Copy Constructor: 
    public Person(Person p) {
        this.name = p.name;
        this.age = p.age;
        this.mob = p.mob;
    }

    public void display() {
        System.out.println("Name: " + name + "\nAge: " + age + "\nMob: " + mob);
    }
}

public class Parameterized_Constr {
    public static void main(String[] args) {

        Person p1 = new Person("Harpreet Singh", 19, 7696224478L);
        Person p2 = new Person();
        Person p3 = new Person();

        Person p4 = new Person(p1);
        

        System.out.println("---------------------------");
        p1.display();
        System.out.println("---------------------------");
        System.out.println();

        System.out.println("-----Copy Constructor------");
        System.out.println(p4.name);
        System.out.println(p4.age);
        System.out.println(p4.mob);
        System.out.println("---------------------------");

        // p4 is an object of the same class as p1 but it's a different object
        // so any changes made in p4 will not reflect in p1 and vice versa
    }
}
