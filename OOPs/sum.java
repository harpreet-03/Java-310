
class Add{

    public int add(int num1, int num2) {
       return num1 + num2;
    }

    public double add(double num1, double num2) {
        return num1 + num2;
    }

}

public class sum{
    public static void main(String[] args) {

        int n1 = 5;
        int n2 = 10;

        double n3 = 1.1;
        double n4 = 2.2;
        
    Add obj1 = new Add();
    //an object is created in the heap memory using new keyword.

    int out = obj1.add(n1, n2);
    System.out.println(out);
    double bt = obj1.add(n3,n4);
    System.out.println(bt);
    }
}

