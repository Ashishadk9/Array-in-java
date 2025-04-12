
/**
 * Write a description of class Declare2D_array here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Declare2D_array
{
   public static void main(String[] args){
       int[][] matrix = {
    {10, 20, 30},
    {50, 60, 70, 80},
    {90, 100, 110,125,120}
};
for (int i = 0; i < matrix.length; i++) {
  for (int j = 0; j < matrix[i].length; j++) {
     System.out.println("Element at row " + i + ", column " + j + " " + matrix[i][j]);
            }
        }

}
}