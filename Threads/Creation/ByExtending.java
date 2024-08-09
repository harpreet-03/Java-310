
/*
 * 
 Creating a Thread by Extending the Thread Class:
 ------------------------------------------------
 
In this approach, you create a new class that extends the Thread class and override the run() method.
 */
class MyThread1 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread is Cooking!");
            i++;
        }
    }
}

class MyThread2 extends Thread {
    public void run() {
        int i = 0;
        while (i < 100) {
            System.out.println("Thread is Talking!");
            i++;
        }
    }
}

public class ByExtending {
    public static void main(String[] args) {
        // Create an instance of MyThread
        MyThread1 t1 = new MyThread1();
        MyThread2 t2 = new MyThread2();

        // Start the thread
        t1.start();
        t2.start();

    }
}


/*
 * Output: Handling both tasks concurrently
 * 
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Talking!
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Cooking!
 * Thread is Cooking!
 * 
 * 
 */