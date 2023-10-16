// import static java.util.Calendar.JULY;

import java.util.Calendar; // abstract class means it is not complete with all fields and methods
import java.util.Date;

public class CalendarDemo {
public static void main(String[] args){
   Calendar myCalendar = Calendar.getInstance();
  // getInstance() method is how we instantiate abstract classes
  // getInstance() is similar to the constructor for normal classes : e.g. Date d1 = new Date()

  myCalendar.set(1987, Calendar.JULY, 31); // .set to assign the value to the Calendar
  Date AnneBirthDate = myCalendar.getTime();
  // getTime() is a Calendar instance method
  // it returns a Date instance with the same value of the Calendar instance
  // example : myCalendar holds value : 1987 July 31
  // myCalendar.getTime() returns : Date object with value : 1987 July 31
  // we want to work with Date objects not with Calendar objects
  System.out.println(AnneBirthDate);
}
}

/**
 * What is the instance ?
 * it is an object created of the Class , example :
 * Class is Date
 * Instance is obj
 * Date obj = new Date();
 * Calendar is the Class
 * myCalendar is the instance
 * .getTime() is the method
 * What is a method ?
 * It is a function defined in the class
 * it is either static or non-static
 * example of non-static ('instance methods'):
 * myCalendar.getTime();
 *
 * example of static methods:
 * Calendar is the class
 * getInstance() is the method
 * Calendar.getInstance();
 *
 *
 * if the method is invoked by the Class name then it is static
 * if the method is invoked by the instance name then it is non-static
 * */
