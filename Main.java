import java.util.Scanner;

/**
 *Determines if a number is even or odd by using remainder
 * @author Cole G.
 */
public class Main {

  /**
   * The method that is executed when you hit the run button.
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    // Create a scanner for user input
    Scanner input = new Scanner(System.in);

    //Ask the user for a number
    System.out.println("Please enter an integer:");
    //Get the number from the user
    int userNumber  = input.nextInt();
    
    //The equation for determining if a number is even or odd
    int remainder = userNumber % 2;

    //Check to see if the number is even or odd
    if(remainder >= 1){
      //tells them the number is odd
      System.out.println(userNumber + " is an odd number");
    }else{
      //tells them the number is even
      System.out.println(userNumber + " is an even number");
    }
  }
}
