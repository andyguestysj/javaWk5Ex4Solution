public class Person {
  public String firstName;
  public String surname;
  public int age;

  public Person (String firstName, String surname, int age){
    this.firstName = firstName;
    this.surname = surname;
    this.age = age;
  }

  public String description(){
    String retVal = "Hello my name is " + firstName + " " + surname;
    retVal = retVal + " and I am " + age + ".";
    return retVal;
  }
}