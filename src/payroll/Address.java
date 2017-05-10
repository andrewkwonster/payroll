package payroll;

/**
 * Created by andrewkwon on 5/9/17.
 */
public class Address {

  private int streetNumber;
  private String streetName;
  private String state;
  private String city;
  private int zipCode;

  public Address(int streetNumber, String streetName, String state, String city, int zipCode){
    this.streetNumber=streetNumber;
    this.streetName=streetName;
    this.state=state;
    this.city=city;
    this.zipCode=zipCode;
  }

  public int getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(int streetNumber) {
    this.streetNumber = streetNumber;
  }

  public String getStreetName() {
    return streetName;
  }

  public void setStreetName(String streetName) {
    this.streetName = streetName;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public int getZipCode() {
    return zipCode;
  }

  public void setZipCode(int zipCode) {
    this.zipCode = zipCode;
  }

  public String toString() {
    return(streetNumber + " " + streetName + " " + city + ", " + state + " " + zipCode);
  }

}
