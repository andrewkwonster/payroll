package payroll;

/**
 * Created by andrewkwon on 5/9/17.
 */
public class Payroll {

  public static void main(String[] args){
    Address address1 = new Address(4841, "La Canada Blvd", "CA", "La Canada Flintridge", 91011);
    Person p1 = new Person("Andrew", 9999, 1000, address1, 2133691699);
    p1.printEmployee();
  }
}
