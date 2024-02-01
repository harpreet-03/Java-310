public class minn {
    public static void main(String[] args) {
        int[][] myArray = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < myArray.length; i++) {
            for (int j = 0; j < myArray[i].length; j++) {
                if (myArray[i][j] > min) {
                    min = myArray[i][j];
                }
               
            }
        } 
        System.out.println("Max: "+ min) ;
       

    
    }
}
