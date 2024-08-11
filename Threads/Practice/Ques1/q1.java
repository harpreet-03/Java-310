
/*
 * ques:
 * 
 write a program to print "good morning" and "welcome" continuously on the screen in Java using Threads.

 */

class GM extends Thread {
    public void run() {
        
        System.out.println("Good Morning.");
    }
}

class Welcome extends Thread {
    public void run() {
        System.out.println("Welcome.");
    }
}

class q1 {
    public static void main(String[] args) {
        GM gm = new GM();
        Welcome welcome = new Welcome();
        gm.start();
        welcome.start();
    }
}