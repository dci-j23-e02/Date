

import java.time.LocalDate;
import java.time.Month;


public class LocalDateClass {
public static void main(String[] args){

  String sampleDateString = "2020-07-18";
  LocalDate birthdate =  LocalDateClass.getDayMonthYear(sampleDateString);
  // instance methods means it will be invoked by an instance of the class
  // for example the below methods are all instance methods
  int day = birthdate.getDayOfMonth();
  Month month = birthdate.getMonth();
  int year = birthdate.getYear();

  System.out.println("Day: " + day);
  System.out.println("Month: " + month);
  System.out.println("Year: " + year);

  // variable = returned value can be assigned to a variable
}

  /**
   * use the localDate class to get the day, month and year from date.
   * demonstrate  the method getDayMonth(), getMonth() and check the differences
   * Below would be a method to implement the above approach
   * */

  /**
   * public : access modifier  means this method is visible in our whole project
   * static : means that We can only invoke the method by the class name, no instances are required
   * LocalDate Or void :
          *  LocalDate: means I will return a value of LocalDate data type
          *  void : means I am not returning anything
   *  getDayMonthYear: the name of the method which is my suggested name
   *  (String date) : this method accepts one parameter of String data type
   *
   * */

  /* public static void getDayMonthYear(String date){
    // Get an instance of LocalDate
    LocalDate localDate1 = LocalDate.parse(date);
    System.out.println(localDate1); // this method does not return anything


  }


  */

  public static LocalDate getDayMonthYear(String date){
    // Get an instance of LocalDate
    LocalDate birthdate = LocalDate.parse(date);
    return birthdate;


  }

}
