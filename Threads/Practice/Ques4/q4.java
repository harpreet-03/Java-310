/*
 * How do you get state of a given thread in Java?
 */

 class MyThread extends Thread {
    public void run() {
        // Thread does some work
        try {
            Thread.sleep(1000); // Sleep for demonstration
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}

public class q4 {
    public static void main(String[] args) {
        // Create a new thread
        MyThread myThread = new MyThread();
        
        // Get the state of the thread before it starts
        System.out.println("State before starting: " + myThread.getState());
        
        // Start the thread
        myThread.start();
        
        // Get the state of the thread after starting
        System.out.println("State after starting: " + myThread.getState());
        
        // Wait for the thread to complete
        try {
            myThread.join(); // Wait for the thread to finish
        } catch (InterruptedException e) {
            System.out.println(e);
        }
        
        // Get the state of the thread after it has finished
        System.out.println("State after completion: " + myThread.getState());
    }
}
