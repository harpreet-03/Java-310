import java.util.ArrayList;
import java.util.List;

// Encapsulation is a mechanism where you bind your data (variables) and code (methods) together as a single unit.
class Student {
    private String student_name;
    private int student_id;
    private List<Double> grades;

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public List<Double> getGrades() {
        return grades;
    }

    public void addGrade(double grade) {
        if (grades == null) grades = new ArrayList<>();
        
        grades.add(grade);
    }
}

public class Student_Marksheet {
    public static void main(String[] args) {
        Student student = new Student();

        // Set the values using the setter methods
        student.setStudent_id(1);
        student.setStudent_name("Harpreet Singh");

        // Add grades using the addGrade() method
        student.addGrade(92.5);
        student.addGrade(89.0);
        student.addGrade(90.3);

        // Get the values using the getter methods
        int student_id = student.getStudent_id();
        String student_name = student.getStudent_name();
        List<Double> grades = student.getGrades();

        System.out.println("---------------------------");
        // Print the values

        System.out.println("Student ID: " + student_id);
        System.out.println("Student Name: " + student_name);
        System.out.println("Grades: " + grades);
    
        
        // Calculate the average of the grades
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        double average = (int)(sum / grades.size());
        System.out.println("Average: " + average);
        
        System.out.println("---------------------------");
    }
}
