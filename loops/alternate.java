import java.util.*;

class alternate {
    public static void kuchbhi(int number) {
        int num = number;
        int track = 1;
        while (num > 0) {
            int digit = num % 10;
            if (track % 2 != 0) {
                System.out.print(digit);

            }
            track++;
            num = num / 10;
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        kuchbhi(number);
    }
}