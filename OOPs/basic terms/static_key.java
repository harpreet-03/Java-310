
class Student {
    public String name;
    public int id;
    public static String uniName;

    public void output() {
        System.out.println("Name : " + name + " ID : " + id + " university : " + uniName);
    }

    public static void myStaticMethod(){
        System.out.println("This is a static method: " + uniName);
    
    }
}


public class static_key {
    public static void main(String args[]) {
        Student s1 = new Student();
        s1.name = "Aanand"; 
        s1.id = 1;
        s1.uniName = "LPU";

        Student s2 = new Student();
        s2.name = "Azhar";
        s2.id = 2;
        s2.uniName = "LPU";

        s1.output();
        s2.output();

        Student.myStaticMethod(); // static method accessible using its Class
        
        }
}