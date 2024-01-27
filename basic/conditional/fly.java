package conditional;

import java.util.*;
public class fly {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int n = sc.nextInt();
        
        if(n >= 18 && n<60) {
            System.out.println("You can fly");
        }else{
            System.out.println("not");
        }
    }
}

