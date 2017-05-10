package payroll;

/**
 * Created by andrewkwon on 5/9/17.
 */
public class Person {

  private String name;
  private int employeeID;
  private double salary;
  private Address address;
  private int phoneNumber;

  public Person(String name, int employeeID, double salary, Address address, int phoneNumber){
    this.name = name;
    this.employeeID = employeeID;
    this.salary=salary;
    this.address=address;
    this.phoneNumber=phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getEmployeeID() {
    return employeeID;
  }

  public void setEmployeeID(int employeeID) {
    this.employeeID = employeeID;
  }

  public double getSalary() {
    return salary;
  }

  public void setSalary(double salary) {
    this.salary = salary;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public int getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(int phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public void printEmployee(){
    System.out.println("Name: " + name +  "\nemployeeID: "
      + employeeID + "\nsalary: " + salary + "\naddress: " + address + "\nphoneNumber: " + phoneNumber);
  }
}
