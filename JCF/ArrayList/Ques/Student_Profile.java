
//Create a Java program to manage a list of student names using ArrayList. The program should allow users to add new student names, remove existing student names, and display all student names.

// Your program should include the following methods:

// addStudent(String name): This method adds a new student name to the list.

// removeStudent(String name): This method removes a student name from the list.

// displayAllStudents(): This method displays all the student names stored in the list.

// Write a Java program that implements the above methods and demonstrates their functionality.

import java.util.ArrayList;

class Student {
    private ArrayList<String> st = new ArrayList<String>(); // Initialize ArrayList here
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Adding the Student Name in the list:
    public void addStudent(String name) {
        st.add(name);
    }

    // Removing the Student Name from the list:
    public void removeStudent(String name) {
        boolean removed = st.remove(name);
        if (removed) {
            System.out.println("Removed Student Name: " + name);
        } else {
            System.out.println("Student Name not found: " + name);
        }
        
    }

    // Displaying the Student list:
    public void displayList() {
        System.out.println("Student List: ");
        for (String s : st) {
            System.out.print(s + " ");
        }
        System.out.println( "\n");
    }
}

public class Student_Profile {
    public static void main(String[] args) {
        Student student = new Student("Sahoo"); // Pass the student's name to the constructor

        student.addStudent("Harpreet");
        student.addStudent("Rahul");
        student.addStudent("Rohit");
        student.addStudent("Yash");

        student.displayList();

        student.removeStudent("Rohit");
        System.out.println("After removing Rohit: ");

        student.displayList();
    }
}
