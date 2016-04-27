import java.util.Scanner;
import java.util.Calendar;

/**
 * This class tests the RichardDavisWorkerDemo class
 *
 */
public class RichardDavisWorkerDemo
{

  /**
   * The main method
   *
   */
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);

    // gets employee name information
    System.out.print("Enter employee's name => ");
    String name = in.nextLine();
    in.nextLine();

    // gets employee number information
    System.out.print("Enter employee's number => ");
    String number = in.nextLine();
    in.nextLine();

    // gets hire date information
    System.out.print("Enter the year the employee was hired => ");
    String date = in.nextLine();
    RichardDavisEmployee emp = RichardDavisEmployee(name, number, date);
    if (emp.validateNumber()) {
      System.out.println("It worked!");
    }
  }
}
