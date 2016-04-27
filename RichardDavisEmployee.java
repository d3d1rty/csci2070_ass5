
/**
 * This class models an employee
 *
 */
public class RichardDavisEmployee
{
  private String empName;
  private String empNumber;
  private String empHireDate;

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
   * This method returns the employee's name
   *
   * @return  empName  the name of the employee
   */
  public String getEmpName()
  {
    return empName;
  }

  /**
   * This method returns the employee's number
   *
   * @return  empNumber the number of the employee
   */
  public String getEmpNumber()
  {
    return empNumber;
  }

  /**
   * This method returns the employee's hire date
   *
   * @return  empHireDate  the hire date of the employee
   */
  public String getEmpHireDate()
  {
    return empHireDate;
  }
}
