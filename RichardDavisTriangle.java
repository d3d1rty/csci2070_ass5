
/**
 * This class models a triangle polygon
 *
 */
public class RichardDavisTriangle
{
  private double base; // base of triangle
  private double height; // height of triangle
  private String name; // name of triangle

  /**
   * This method instantiates the triangle object
   *
   * @param  b  length of base
   * @param  h  length of height
   * @param  n  name of triangle
   */
  public RichardDavisTriangle(double b, double h, String n)
  {
    base = b;
    height = h;
    name = n;
  }

  /**
   * This method returns the value of base
   *
   */
  public double getBase()
  {
    return base;
  }

  /**
   * This method returns the value of height
   *
   */
  public double getHeight()
  {
    return height;
  }

  /**
   * This method returns the value of name
   *
   */
  public String getName()
  {
    return name;
  }

  /**
   * This method returns the area of the triangle
   *
   * @return  area  the area of the triangle object
   */
  public double getArea()
  {
    double area = (double)(this.getBase() * this.getHeight() / 2);
    return area;
  }

  /**
   * This method determines the equality of two triangle objects
   *
   * @return  areEqual  true if two triangles have same area
   */
  public boolean equals(RichardDavisTriangle tri)
  {
    boolean areEqual = false;
    if (tri.getArea() == this.getArea()) {
      areEqual = true;
    }
    return areEqual;
  }

  /**
   * This method formats the triangle object as a string
   *
   * @return  strTri  the string version of the triangle
   */
  public String toString()
  {
    String strTri = "Base: " + this.getBase() + ", Height: " + this.getHeight();
    return strTri;
  }
}
