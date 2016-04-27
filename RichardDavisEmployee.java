
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
   * This method instantiates an employee object
   *
   */
  public RichardDavisEmployee(String name, String num, String hireDate)
  {
    empName = name;
    empNumber = num;
    empHireDate = hireDate;
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

  /**
   * This method validates the employee number
   *
   * @return  result  the result of the validation
   */
  public boolean validateNumber()
  {
    return empNumber.matches("\\d{3}\\-[a-lA-L]");
  }
}
