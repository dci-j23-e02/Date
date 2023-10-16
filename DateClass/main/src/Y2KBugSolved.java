import java.util.Calendar;
import java.util.Date;


public class Y2KBugSolved {
public static void main(String[] args){
  /*
  Date date1 = new Date();
 // System.out.println("Current date is " + date1);

  Date SuzeBirthDate = new Date(2000, 11, 21); // Y2K bug : deprecated
  System.out.println("Suze birthdate is " + SuzeBirthDate);
  Date KarlBirthdate = new Date(93, 8, 7); // using 2 digits for the year before 2000, gives correct results , deprecated
  System.out.println("Karl birthdate is " + KarlBirthdate);
  Date KaiserBirthdate = new Date(1855, 8, 7); // using 4 digits is also a bug, deprecated
  System.out.println("Kaiser birthdate is " + KaiserBirthdate);

  Output was :
  Suze birthdate is Fri Dec 21 00:00:00 CET 3900  Wrong
  Karl birthdate is Tue Sep 07 00:00:00 CEST 1993 Correct with 2 digit for the year
  Kaiser birthdate is Sun Sep 07 00:00:00 CEST 3755  Wrong
  * */

// Solution with Calendar abstract class
  Calendar cal1 = Calendar.getInstance();
  cal1.set(2000,Calendar.NOVEMBER,  21);
  Date SuzeBirthDate = cal1.getTime();
  System.out.println("Suze birthdate is " + SuzeBirthDate);

  Calendar cal2 = Calendar.getInstance();
  cal2.set(1855, 8, 7);
  Date KaiserBirthdate = cal2.getTime();
  System.out.println("Kaiser birthdate is " + KaiserBirthdate);
}
}
