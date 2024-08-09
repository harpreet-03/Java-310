/*
 * Ques: Demostrate getPriority() and setPriority() methods in Java Threads.
 * 
 */


 class HighPriorityThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("High Priority Thread");
        }
    }
}

class LowPriorityThread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Low Priority Thread");
        }
    }
}

public class q3 {
    public static void main(String[] args) {
        // Create threads
        HighPriorityThread highPriorityThread = new HighPriorityThread();
        LowPriorityThread lowPriorityThread = new LowPriorityThread();

        // Set priorities
        highPriorityThread.setPriority(Thread.MAX_PRIORITY); // Set to 10
        lowPriorityThread.setPriority(Thread.MIN_PRIORITY);  // Set to 1

        // Print the priorities
        System.out.println("High Priority Thread Priority: " + highPriorityThread.getPriority());
        System.out.println("Low Priority Thread Priority: " + lowPriorityThread.getPriority());

        // Start threads
        highPriorityThread.start();
        lowPriorityThread.start();
    }
}
