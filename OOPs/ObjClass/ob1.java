
class Student{
    int rollNo;
    String Subject;

    Student(int rollNo, String Subject){
        this.rollNo = rollNo;
        this.Subject = Subject;
    }
    
    public String toString(){
        return "Roll No: " + rollNo + " Subject: " + Subject;
    }
}

public class ob1 {
    public static void main(String[] args) {
        Student obj = new Student(45, "xyzxy");

        System.out.println(obj.toString());
    }
}



