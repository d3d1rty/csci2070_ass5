
/**
 * This class models an production worker
 *
 */
public class RichardDavisProductionWorker extends RichardDavisEmployee
{
  private int shift;
  private double payRate;

  /**
   * This method instantiates an production worker object
   *
   */
  public RichardDavisProductionWorker(String name, String num,
      String hireDate, int s, double rate)
  {
    super(name, num, hireDate);
    shift = s;
    payRate = rate;
  }

  /**
   * This method returns the production worker's shift
   *
   * @return  shift  the production worker's shift
   */
  public int getShift()
  {
    return shift;
  }

  /**
   * This method sets the production worker's shift
   *
   * @param  s  the production worker's shift
   */
  public void setShift(int s)
  {
    shift = s;
  }

  /**
   * This method returns the production worker's pay rate
   *
   * @return  payRate  the production worker's pay rate
   */
  public double getPayRate()
  {
    return payRate;
  }

  /**
   * This method sets the production worker's pay rate
   *
   * @param  rate  the production worker's pay rate
   */
  public void setPayRate(double rate)
  {
    payRate = rate;
  }

  /**
   * This method validates the production worker's shift
   *
   * @return  valid  the result of the validation
   */
  public boolean validateShift()
  {
    boolean valid = false;
    if (shift == 1 || shift == 2) {
      valid = true;
    }
    return valid;
  }
}
