
/**
 * This class models a solid object
 *
 */
public class RichardDavisSolid
{

  /**
   * This method returns the volume of a sphere
   * or -1 if a negative argument is given
   *
   * @param   r  the radius of the sphere
   * @return  v  the volume of the solid object
   */
  public static double getVolumeSphere(double r)
  {
    double v = -1.0;
    if (!checkIfNegative(r)) {
      v = (4.0/3.0)*(Math.PI)*(Math.pow(r, 3));
    }
    return v;
  }

  /**
   * This method returns the volume of a rectangular prism
   * or -1 if a negative argument is given
   *
   * @param   l  the length of a rect. prism
   * @param   w  the width of a rect. prism
   * @param   h  the height of a rect. prism
   * @return  v  the volume of the solid object
   */
  public static double getVolumeCuboid(double l, double w, double h)
  {
    double v = -1.0;
    if (!checkIfNegative(l) && !checkIfNegative(w) && !checkIfNegative(h)) {
      v = l*w*h;
    }
    return v;
  }

  /**
   * This method returns the volume of a cone
   * or -1 if a negative argument is given
   *
   * @param   b  the base area of a cone
   * @param   h  the height of a cone
   * @return  v  the volume of the solid object
   */
  public static double getVolumeCone(double w, double h)
  {
    double v = -1.0;
    if (!checkIfNegative(w) && !checkIfNegative(h)) {
      v = (1.0/3.0)*w*h;
    }
    return v;
  }

  /**
   * This method returns the volume of a cone
   *
   * @param   b  the base area of a cone
   * @param   h  the height of a cone
   * @return     the volume of the solid object
   */
  public static boolean checkIfNegative(double num)
  {
    if (num > 0) {
      return false;
    } else {
      return true;
    }
  }
}
