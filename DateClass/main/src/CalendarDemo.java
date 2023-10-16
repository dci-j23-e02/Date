// import static java.util.Calendar.MONDAY;

import java.util.Calendar; // abstract class means it is not complete with all fields and methods
import java.util.Date;

public class CalendarDemo {
public static void main(String[] args){
   Calendar myCalendar = Calendar.getInstance();
  // getInstance() method is how we instantiate abstract classes
  // getInstance() is similar to the constructor for normal classes : e.g. Date d1 = new Date()

  myCalendar.set(1987, Calendar.JULY, 31);
  Date AnneBirthDate = myCalendar.getTime();
  System.out.println(AnneBirthDate);
}
}
