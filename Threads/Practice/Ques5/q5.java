
/*
 * Ques: How do you get refernec to the current thread in Java?
 */

 public class q5 {
    public static void main(String[] args) {
        // Get reference to the current thread
        Thread currentThread = Thread.currentThread();
        
        // Print the name of the current thread
        System.out.println("Current thread name: " + currentThread.getName());
        
        // Print the ID of the current thread
        System.out.println("Current thread ID: " + currentThread.getId());
        
        // Print the state of the current thread
        System.out.println("Current thread state: " + currentThread.getState());
    }
}
