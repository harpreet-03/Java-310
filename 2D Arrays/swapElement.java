
public class swapElement {

    public static void main(String[] args) {
        // Example 2D array
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        // Print the original array
        System.out.println("Original 2D array:");
        printArray(matrix);

        // Swap elements at positions (0,0) and (2,2)
        swapElements(matrix, 0, 0, 2, 2);

        // Print the array after swapping
        System.out.println("\n2D array after swapping elem  ents:");
        printArray(matrix);
    }

    // Method to swap elements in a 2D array
    private static void swapElements(int[][] array, int row1, int col1, int row2, int col2) {
        int temp = array[row1][col1];
        array[row1][col1] = array[row2][col2];
        array[row2][col2] = temp;
    }

    // Method to print a 2D array
    private static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
