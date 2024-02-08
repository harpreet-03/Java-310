package Encapsulation;
public class Student_data {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println("Before: " + s1.getMyname());
        s1.setMyname("Harpreet");
        System.out.println("After: " + s1.getMyname());
        
        System.out.println();

        System.out.println("Before: " + s1.getRid());
        s1.setRid(12210566);
        System.out.println("After: " + s1.getRid());

    }
}

class Student {
    private String myname = "Harpreet Singh";
    private int rid = 12215827;

    public void setMyname(String myname) {
        this.myname = myname;

    }

    public String getMyname() {
        return myname;
    }


    public void setRid(int rid) {
        rid = rid;
    }

    public int getRid() {
        return rid;
    }
}
