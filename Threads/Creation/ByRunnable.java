/*
 * 
Creating a Thread by Implementing the Runnable Interface:
---------------------------------------------------------

In this approach, you create a class that implements the Runnable interface and override the run() method. Then, you pass an instance of this class to a Thread object.
 */

// Implementing the Runnable interface
class MyRunnable1 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread 1 is running");
            i++;
        }
    }
}

class MyRunnable2 implements Runnable {
    public void run() {
        int i = 0;
        while (i < 50) {
            System.out.println("Thread 2 is walking");
            i++;
        }
    }
}

public class ByRunnable {
    public static void main(String[] args) {
        // Create an instance of MyRunnable
        MyRunnable1 bullet1 = new MyRunnable1();
        // Create a Thread object and pass the Runnable instance to it
        Thread gun1 = new Thread(bullet1);

        // Create an instance of MyRunnable
        MyRunnable2 bullet2 = new MyRunnable2();
        // Create a Thread object and pass the Runnable instance to it
        Thread gun2 = new Thread(bullet2);

        // Start the thread
        gun1.start();
        gun2.start();
    }

}
