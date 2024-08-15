public class finally_code {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        while (true) {
            try {
                System.out.println( "For a = " + a + " and b = " + b + "  => "+ a / b);
            } catch (Exception e) {
                System.out.println("\n" + e);
                break;
            } finally {
                System.out.println("\nFinally block is always executed");
            }
            b--;
        }
    }
}
