/*
 Ques: Add a sleep method in welcome thread of question to delay its execution for 200ms.

 */
class GM extends Thread {
    public void run() {
        int i = 0;
        while (i < 20) {

            System.out.println("Good Morning.");
            i++;
        }

    }
}

class Welcome extends Thread {
    public void run() {
        int i = 0;
        while (i < 20) {
            System.out.println("Welcome.");
            i++;
            try {
                Thread.sleep(200); // Delay each iteration by 200ms
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }
}

public class q2 {
    public static void main(String[] args) {
        GM gm = new GM();
        Welcome wm = new Welcome();
        gm.start();
        wm.start();

    }
}
