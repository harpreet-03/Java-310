public class Event {
    public static void main(String[] args) {
        System.out.println(countCommonCards(15, 3)); // Output should be 3
        System.out.println(countCommonCards(9, 12)); // Output should be 8
    }

    public static int countCommonCards(int jerryChoice, int tomChoice) {
        int smaller = Math.min(jerryChoice, tomChoice);
        int count = 0;
        
        for (int i = 2; i <= smaller; i += 2) { // Starting from 2 and incrementing by 2 for even numbers
            if (i % 3 == 0) {
                count++;
            }
        }
        
        return count;
    }
}
