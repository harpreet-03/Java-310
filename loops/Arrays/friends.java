
public class friends {
    public static void main(String[] args) {
        // Assuming the roll numbers of your 10 friends
        int[] friendRollNumbers = {101, 102, 103, 104, 105, 106, 107, 108, 109, 110};

        // Print friends with even roll numbers
        for (int rollNumber : friendRollNumbers) {
            if (rollNumber % 2 == 0) {
                System.out.println("Friend with even roll number: " + rollNumber);
            }
        }
    }
}
