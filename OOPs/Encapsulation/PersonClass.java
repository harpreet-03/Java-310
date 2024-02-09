
class Person {
    private String name;
    private int age;
    private String country;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getCountry() {
        return country;
    }

    public  void setCountry(String country) {
        this.country = country;
    }

    public void Display() {
        System.out.println("---------------------------");
        System.out.println(" Name: " + name);
        System.out.println(" Age: " + age);
        System.out.println(" Country: " + country);
        System.out.println("---------------------------");
    }

}

public class PersonClass {
    public static void main(String[] args) {
        Person first = new Person();
        first.setName("Harpreet Singh");
        first.setAge(19);
        first.setCountry("India");

        first.Display();

        
    }
}
