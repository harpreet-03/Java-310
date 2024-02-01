public class minRow {

    public static void main(String[] args) {
        int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        for (int i = 0; i < myArray.length; i++) {
            int min = Integer.MAX_VALUE; // Initialize min to the highest possible value
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] < min) {
                    min = myArray[i][j];
                }
            }
            System.out.println("Minimum element in row : " + min);
        }
    }
}
