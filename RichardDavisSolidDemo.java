import java.util.Scanner;
/**
 * This class tests the RichardDavisSolid class
 *
 */
public class RichardDavisSolidDemo
{

  /**
   * The main method
   *
   */
  public static void main(String[] args)
  {
    boolean quit = false;
    double volume = 0.0;
    double radius = 0.0;
    double length = 0.0;
    double width = 0.0;
    double height = 0.0;
    double base = 0.0;
    Scanner in = new Scanner(System.in);

    System.out.println("Volume Calculator:");
    System.out.println("1. Calculate the volume of a sphere");
    System.out.println("2. Calculate the colume of a rectangular prism");
    System.out.println("3. Calculate the volume of a cone");
    System.out.println("4. Quit");
    while (!quit) {
      System.out.print("Enter your choice (1-4): ");
      int choice = in.nextInt();
      switch (choice) {
        case 1:
          System.out.print("Enter the radius of the sphere => ");
          radius = in.nextDouble();
          volume = RichardDavisSolid.getVolumeSphere(radius);
          if (volume == -1.0) {
            System.out.println("Error. The number you entered is negative.");
          } else {
            System.out.printf("The volume of the sphere is %8.2f\n", volume);
          }
          break;
        case 2:
          System.out.print("Enter the length of the cuboid => ");
          length = in.nextDouble();
          System.out.print("Enter the width of the cuboid => ");
          width = in.nextDouble();
          System.out.print("Enter the height of the cuboid => ");
          height = in.nextDouble();
          volume = RichardDavisSolid.getVolumeCuboid(length, width, height);
          if (volume == -1.0) {
            System.out.println("Error. The number you entered is negative.");
          } else {
            System.out.printf("The volume of the rectangular prism is %8.2f\n", volume);
          }
          break;
        case 3:
          System.out.print("Enter the base of the cone => ");
          base = in.nextDouble();
          System.out.print("Enter the height of the cone => ");
          height = in.nextDouble();
          volume = RichardDavisSolid.getVolumeCone(base, height);
          if (volume == -1.0) {
            System.out.println("Error. The number you entered is negative.");
          } else {
            System.out.printf("The volume of the cone is %8.2f\n", volume);
          }
          break;
        case 4:
          quit = true;
          break;
        default: System.out.println("Invalid option. Try again.");
          break;
      }
    }
  }
}
