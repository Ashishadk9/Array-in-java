
/**
 * Write a description of class AverageOfArray here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AverageOfArray
{ 
  public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
         int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        double average = (double) sum / numbers.length;
          System.out.println("The average is: " + average);
    }  
}
