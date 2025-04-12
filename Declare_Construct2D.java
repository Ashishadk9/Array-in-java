
/**
 * Write a description of class Declare_Construct2D here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Declare_Construct2D
{
   public static void main(String[] args) {
        int[][] matrix = new int[3][3];  // Declares and constructs a 3x3 2D array
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
   }
}
