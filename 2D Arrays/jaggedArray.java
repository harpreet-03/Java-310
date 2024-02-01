public class jaggedArray {

    private static void printArray(int[][] arr) {
        for (int[] row : arr) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3, 4 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        printArray(arr);

    }
}


//we can also print in main like :
/*
 * 
 * for(int i = 0; i < arr.length; i++){
 *  for(int j = 0; j < arr[row].length; j++){
 *  System.out.print(arr[row][col]+ " ");
 * }
 * System.out.println;
 */