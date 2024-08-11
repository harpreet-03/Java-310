import java.util.Scanner;

class MyException extends Exception {
    @Override
    public String toString() {
        // return super.toString() + "I am toString()";
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        // return super.getMessage() + "I am getMessage()";
        return "I am getMessage()";
    }
}

public class exception {
    public static void main(String[] args) {

        int a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();

        if (a < 99) {
            try {

                throw new MyException();
            } catch (Exception e) {
                System.out.println(e.getMessage());
                System.out.println(e.toString());
                System.out.println(e);
                e.printStackTrace();
                System.out.println("Program finished successfully!");
            }
        }
    }
}
