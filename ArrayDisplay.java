import java.util.Arrays;
/**
 * Write a description of class ArrayDisplay here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayDisplay
{
     public static void main(String[] args) {
     int[] oneDArray = {1, 2, 3, 4, 5};
      System.out.println("1D Array Elements:");
        for (int element : oneDArray) {
            System.out.print(element + " ");
      }
      System.out.println();
        System.out.println("1D Array using Arrays.toString(): " + Arrays.toString(oneDArray));
      int[][] twoDArray = {{1, 2}, {3, 4}, {5, 6, 7}};
        System.out.println("\n2D Array Elements:");
        for (int[] row : twoDArray) {
        for (int element : row) {
          System.out.print(element + " ");
        }
          System.out.println();
      }
        System.out.println("2D Array using Arrays.deepToString(): " + Arrays.deepToString(twoDArray));
  }
} 
