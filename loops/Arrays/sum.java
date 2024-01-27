

public class sum {
    public static void main(String[] args) {
         double sum = 0;
       double arr[] = {1.2,2.2,3.3,4.5,5.7};

       for (double i: arr) {
       sum += i;
    }

    System.out.println("Sum is " + sum);
    }
}
