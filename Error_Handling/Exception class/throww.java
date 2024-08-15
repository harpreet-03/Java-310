// package Java.Error_Handling.Exception class;

public class throww {
    public static void main(String[] args) {
        int b = 0;
        int a = 10;
        if ( b == 0 ) {
            throw new ArithmeticException("Div by 0");
               }
          else{
                  System.out.println(a/b) ;
              }
    }
}
