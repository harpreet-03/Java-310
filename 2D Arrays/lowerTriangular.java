public class lowerTriangular{

  public static void main (String[]args)
  {
	int[][] matrix = {
	  {1, 2, 3, 4},
	  {5, 6, 7, 8},
	  {9, 10, 11, 12}
	};

	System.out.println ("Lower triangular matrix:");
	printLowerTriangle (matrix);
  }

  public static void printLowerTriangle (int[][]matrix)
  {
	int rows = matrix.length;
	int cols = matrix[0].length;

	for (int i = 0; i < rows; i++)
	  {
		for (int j = 0; j <= i; j++)
		  {					
			System.out.print (matrix[i][j] + " ");
		  }
		System.out.println ();
	  }
  }
}