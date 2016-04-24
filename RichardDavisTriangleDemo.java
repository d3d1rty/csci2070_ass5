import java.util.Scanner;

/**
 * This class test the RichardDavisTriangle class
 *
 */
public class RichardDavisTriangleDemo
{
  /**
   * The main method
   *
   */
  public static void main(String[] args)
  {
    // instantiates first triangle object and displays information
    RichardDavisTriangle triOne = new RichardDavisTriangle(10, 5, "Triangle One");
    System.out.println("Information for first RichardDavisTriangle object...");
    System.out.println("Name= " + triOne.getName() +
        ", Base= " + triOne.getBase() +
        ", Height= " + triOne.getHeight());
    System.out.printf("Triangle area: %5.3f\n", triOne.getArea());
    System.out.println(triOne.toString());

    // instantiates second triangle object and displays information
    RichardDavisTriangle triTwo = new RichardDavisTriangle(5, 10, "Triangle Two");
    System.out.println("Information for second RichardDavisTriangle object...");
    System.out.println("Name= " + triTwo.getName() +
        ", Base= " + triTwo.getBase() +
        ", Height= " + triTwo.getHeight());
    System.out.printf("Triangle area: %5.3f\n", triTwo.getArea());
    System.out.println(triTwo.toString());

    // instantiates third triangle object and displays information
    RichardDavisTriangle triThree = new RichardDavisTriangle(2, 11, "Triangle Two");
    System.out.println("Information for third RichardDavisTriangle object...");
    System.out.println("Name= " + triThree.getName() +
        ", Base= " + triThree.getBase() +
        ", Height= " + triThree.getHeight());
    System.out.printf("Triangle area: %5.3f\n", triThree.getArea());
    System.out.println(triThree.toString());

    // tests equality for first two triangles
    if (triOne.equals(triTwo)) {
      System.out.println("Triangle one and two have the same area.");
    } else {
      System.out.println("Triangle one and two do not have the same area.");
    }

    // tests equality for first and third triangles
    if (triOne.equals(triThree)) {
      System.out.println("Triangle one and three have the same area.");
    } else {
      System.out.println("Triangle one and three do not have the same area.");
    }
  }
}
