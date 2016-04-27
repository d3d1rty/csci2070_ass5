import java.util.Scanner;

/**
 * This class tests the RichardDavisProductionWorker class
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

    // gets worker name information
    System.out.print("Enter worker's name => ");
    String name = in.nextLine();

    // gets worker number information
    System.out.print("Enter worker's number => ");
    String number = in.nextLine();

    // gets hire date information
    System.out.print("Enter the date the worker was hired => ");
    String date = in.nextLine();

    // gets hire date information
    System.out.print("Enter the worker's shift => ");
    int shift = in.nextInt();

    // gets the pay rate information
    System.out.print("Enter the worker's pay rate => ");
    double payRate = in.nextDouble();

    // creates a new production worker object using provided information
    RichardDavisProductionWorker emp = new RichardDavisProductionWorker(name, number, date, shift, payRate);

    // validates the worker's employee number
    if (!emp.validateNumber()) {
      System.out.println("The worker number is not valid.");
    } else {
      System.out.println("The worker number is valid.");
    }

    // validates the worker's shift number
    if (!emp.validateShift()) {
      System.out.println("The worker's shift is not valid.");
    } else {
      System.out.println("The worker's shift is valid.");
    }
  }
}
